$(function () {
    $("#addMark").click(function(){
        $.ajax({
            url: "/user/mark",
            data:{
                mark:$("#mark").val(),
                advice:$("#advice").val()
            },
            type: "GET",
            dataType : "json",
            contentType:"application/json"
        }).done(function(result){
            alert("success");
        }).fail(function(){
            alert("服务器问题，请联系管理员");
        });
    });
});