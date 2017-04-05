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
            url: "/teacher/getCV",
            data:{id:$(".idvalue").val()},
            type: "GET",
            dataType : "json"
        }).done(function(result){
            if(result.success){
                $("#name").html(result.result.teacher["name"]);
                $("#sex").html(result.result.teacher["sex"]);
                $("#grade").html(result.result.teacher["grade"]);
                $("#tellphone").html(result.result.teacher["tellphone"]);
                $("#qq").html(result.result.teacher["qq"]);
                $("#xueli").html(result.result.teacher["xueli"]);
                $("#xuewei").html(result.result.teacher["xuewei"]);
                $("#position").html(result.result.teacher["position"]);
                $("#duty").html(result.result.teacher["duty"]);
                $("#schoolage").html(result.result.teacher["schoolage"]);
                $("#campus").html(result.result.teacher["campus"]);
                $("#email").html(result.result.teacher["email"]);
                $("#cvid").val(result.result.teacher["cvid"]);
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
            url: "/teacher/updateTea",
            data:JSON.stringify({
                id:$(".idvalue").val(),
                name:$("#name").html(),sex:$("#sex").html(),
                tellphone:$("#tellphone").html(),
                qq:$("#qq").html(),email:$("#email").html(),xueli:$("#xueli").html(),
                xuewei:$("#xuewei").html(),position:$("#position").html(),
                duty:$("#duty").html(),schoolage:$("#schoolage").html(),
                campus:$("#campus").html()
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
                url: "/teacher/updateCV",
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
                url: "/teacher/addCV",
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