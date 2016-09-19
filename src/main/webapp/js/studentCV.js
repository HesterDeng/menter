$(function () {
    //找到所有名字的单元格
    var name = $(".edit");
    //给这些单元格注册鼠标点击事件
    name.click(function () {


        //找到当前鼠标单击的td
        var tdObj = $(this);
        //保存原来的文本
        var oldText = $(this).text();
        //创建一个文本框
        var inputObj = $("<input type='text' class='form-control' value='" + oldText + "'/>");
        //去掉文本框的边框
        inputObj.css("border-width", 0);
        inputObj.click(function () {
            return false;
        });
        //使文本框的宽度和td的宽度相同
        inputObj.width(tdObj.width());
        inputObj.height(tdObj.height());
        //去掉文本框的外边距
        inputObj.css("margin", 0);
        inputObj.css("padding", 0);
        inputObj.css("text-align", "center");
        inputObj.css("font-size", "16px");
        inputObj.css("background-color", tdObj.css("background-color"));
        //把文本框放到td中
        tdObj.html(inputObj);
        //文本框失去焦点的时候变为文本
        inputObj.blur(function () {
            var newText = $(this).val();
            tdObj.html(newText);
        });
        //全选
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
            alert("服务器问题，请联系管理员");
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
            alert("服务器问题，请联系管理员");
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
                alert("服务器问题，请联系管理员");
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
                alert("服务器问题，请联系管理员");
            });
        }
    });

});