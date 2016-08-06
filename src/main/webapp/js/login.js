$(function(){
    var contextPath = "http://localhost:8080"
    //登录动作
    $("#submit").click(function(){
        var username = $("#username").val();
        var password = $("#password").val();
        if(username != ""&&password!=""){
            $.ajax({
                url: contextPath+"/user/login",
                data: {
                    username:username,
                    password:password
                },
                type: "GET",
                dataType : "json",
            }).done(function(result){
                if(result.success){
                    $.href(contextPath+"/index");
                }
            }).fail(function(){
                alert("bad");
            });
        }

    });

    //回车登录事件
    $("#loginForm :input").on("keyup",function(e){
        if(e.keyCode == 13){
            $("#submit").trigger("click");
        }
    });
});