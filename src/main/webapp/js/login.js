$(function(){
    //登录动作
    $("#submit").click(function(){
        var username = $("#username").val();
        var password = $("#password").val();
        if(username!=""&&password!=""){
            $.ajax({
                url: "/user/login",
                data: {
                    username:username,
                    password:password
                },
                type: "GET",
                dataType : "json"
            }).done(function(result){
                if(result.success){
                    location.href="/pages/index.jsp";
                }
            }).fail(function(){
                alert("用户不存在");
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