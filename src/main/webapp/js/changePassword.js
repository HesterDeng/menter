$(document).ready(function(){
    var error = false;
    var name = location.search;
    var url;
    var path;
    if(name=="?student"){
        url = "/student/updatePassword";
        path="/pages/student.jsp";
    }else if(name =="?teacher"){
        url="/teacher/updatePassword";
        path="/pages/teacher.jsp";
    }else{
        url="/user/updatePassword";
        path="/pages/manager.jsp";
    }

    $("#newpass").blur(function(){
        var newpass = $("#newpass").val();
        if(newpass == '') {
            showError('newpass', '�����벻��Ϊ��');
            error = true;
        }
        else {
            $("#newpass").css({"border-color":"green"});
            $("#newpassTip").css({"display":"none"});
        }
    });

    $("#newpassAgain").blur(function(){
        var newpass = $("#newpass").val();
        if(newpass == '') {
            showError('newpass', '�����벻��Ϊ��');
            error = true;
            return;
        }

        var newpassAgain = $("#newpassAgain").val();
        if(newpassAgain != newpass) {
            showError('newpassAgain', '������������벻һ��');
            error = true;
        }
        else {
            $("#newpassAgain").css({"border-color":"green"});
            $("#newpassAgainTip").css({"display":"none"});
        }
    });

    $("#submit").click(function(event){
        $("#newpass").blur();
        $("#newpassAgain").blur();

        if(!error) {
            var newpass = $("#newpass").val();
            $.ajax({
                url: url,
                data: {
                    password:newpass
                },
                type: "GET",
                dataType : "json"
            }).done(function(result){
                if(result.success){
                    location.href=path;
                }
            }).fail(function(){
                alert("���������⣬����ϵ����Ա");
            });
        }

        event.preventDefault();
        return false;
    });
});

function showError(formSpan, errorText) {
    $("#" + formSpan).css({"border-color":"red"});
    $("#" + formSpan + "Tip").empty();
    $("#" + formSpan + "Tip").append(errorText);;
    $("#" + formSpan + "Tip").css({"display":"inline"});
}