$(function () {
    //�ҵ��������ֵĵ�Ԫ��
    var name = $(".edit");
    //����Щ��Ԫ��ע��������¼�
    name.click(function () {


        //�ҵ���ǰ��굥����td
        var tdObj = $(this);
        //����ԭ�����ı�
        var oldText = $(this).text();
        //����һ���ı���
        var inputObj = $("<input type='text' class='form-control' value='" + oldText + "'/>");
        //ȥ���ı���ı߿�
        inputObj.css("border-width", 0);
        inputObj.click(function () {
            return false;
        });
        //ʹ�ı���Ŀ�Ⱥ�td�Ŀ����ͬ
        inputObj.width(tdObj.width());
        inputObj.height(tdObj.height());
        //ȥ���ı������߾�
        inputObj.css("margin", 0);
        inputObj.css("padding", 0);
        inputObj.css("text-align", "center");
        inputObj.css("font-size", "16px");
        inputObj.css("background-color", tdObj.css("background-color"));
        //���ı���ŵ�td��
        tdObj.html(inputObj);
        //�ı���ʧȥ�����ʱ���Ϊ�ı�
        inputObj.blur(function () {
            var newText = $(this).val();
            tdObj.html(newText);
        });
        //ȫѡ
        inputObj.trigger("focus").trigger("select");
    });

    $(document).ready(function(){
        $.ajax({
            url: "/student/getCV",
            data:{id:$(".idvalue").val()},
            type: "GET",
            dataType : "json"
        }).done(function(result){
            if(result.success){
                $("#name").html(result.result.student["name"]);
                $("#sex").html(result.result.student["sex"]);
                $("#grade").html(result.result.student["grade"]);
                $("#tellphone").html(result.result.student["tellphone"]);
                $("#qq").html(result.result.student["qq"]);
                $("#email").html(result.result.student["email"]);
                $("#cvid").val(result.result.student["cvid"]);
                $("#experience").val(result.result.cv["cvexperience"]);
                $("#result").val(result.result.cv["cvresult"]);
                $("#other").val(result.result.cv["cvother"]);
            }
        }).fail(function(){
            alert("���������⣬����ϵ����Ա");
        });
    });

    $("#save").click(function(){
        $.ajax({
            url: "/student/updateStu",
            data:JSON.stringify({
                id:$(".idvalue").val(),
                name:$("#name").html(),sex:$("#sex").html(),
                grade:$("#grade").html(),tellphone:$("#tellphone").html(),
                qq:$("#qq").html(),email:$("#email").html()
            }),
            type: "POST",
            dataType : "json",
            contentType:"application/json"
        }).done(function(result){
            alert("success");
        }).fail(function(){
            alert("���������⣬����ϵ����Ա");
        });
        if($("#cvid").val()!=""){
            $.ajax({
                url: "/student/updateCV",
                data: JSON.stringify({
                    id:$("#cvid").val(),
                    cvexperience:$("#experience").val(),
                    cvresult:$("#result").val(),cvother:$("#other").val()
                }),
                type: "POST",
                dataType : "json",
                contentType:"application/json"
            }).done(function(result){
            }).fail(function(){
                alert("���������⣬����ϵ����Ա");
            });
        }else{
            $.ajax({
                url: "/student/addCV",
                data: JSON.stringify({
                    cvexperience:$("#experience").val(),
                    cvresult:$("#result").val(),cvother:$("#other").val()
                }),
                type: "POST",
                dataType : "json",
                contentType:"application/json"
            }).done(function(result){
            }).fail(function(){
                alert("���������⣬����ϵ����Ա");
            });
        }
    });

});