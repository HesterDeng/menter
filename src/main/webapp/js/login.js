$(function(){
    //登录动作
    $("#submit").click(function(){
        var username = $("#username").val();
        var password = $("#password").val();
        var url;
        var path;
        if($("input[name='optionsRadios']")[0].checked){
            url="/student/login";
            path = "/pages/student.jsp";
        }else if($("input[name='optionsRadios']")[1].checked){
            url="/teacher/login";
            path="/pages/teacher.jsp";
        }else{
            url="/user/login";
            path="/pages/manager.jsp";
        }
        if(username!=""&&password!=""){
            $.ajax({
                url: url,
                data: {
                    name:username,
                    password:password
                },
                type: "GET",
                dataType : "json"
            }).done(function(result){
                if(result.success){
                    location.href=path;
                }else{
                    alert("用户名或者密码不正确，请确定")
                }
            }).fail(function(){
                alert("服务器问题，请联系管理员");
            });
        }else {
            alert("请填写内容");
        }

    });

    //回车登录事件
    $("#loginForm :input").on("keyup",function(e){
        if(e.keyCode == 13){
            $("#submit").trigger("click");
        }
    });
});