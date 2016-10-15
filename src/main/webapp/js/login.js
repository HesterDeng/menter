$(function(){
    //登录动作
    $("#submit").click(function(){
        var username = $("#username").val();
        var password = $("#password").val();
        var url;
        var path;
        var changePassword;
        if($("input[name='optionsRadios']")[0].checked){
            url="/student/login";
            path = "/pages/student.jsp";
            changePassword="/pages/changePassword.jsp?student";
        }else if($("input[name='optionsRadios']")[1].checked){
            url="/teacher/login";
            path="/pages/teacher.jsp";
            changePassword="/pages/changePassword.jsp?teacher";
        }else{
            url="/user/login";
            path="/pages/manager.jsp";
            changePassword="/pages/changePassword.jsp?user";
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
                if(result.success&&result.result["islogin"]){
                    location.href=path;
                }else if(result.success&&result.result["islogin"]==false){
                   location.href=changePassword;
                } else{
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