$(document).ready(function(){
    $.ajax({
        url: "/user/markSum",
        type: "GET",
        dataType : "json"
    }).done(function(result){
        if(result.success){
            $("#teacherNumber").html(result.result["teacherselect"]);
            $("#studentNumber").html(result.result["studentselect"]);
            $("#marksum").html(result.result["marksum"]);
            $("#usernumber").html(result.result["usernumber"]);
            $("#avg").html(result.result["marksum"]/result.result["usernumber"]);
            $("#advice").html(result.result["advice"]);
        }
    }).fail(function(){
        alert("服务器问题，请联系管理员");
    });
});

function updateTeacher(){
    var teachernumber=$("#teachernumbernew").val();
    if(teachernumber!=""){
        $.ajax({
            url: "/user/teacherSelect",
            type: "GET",
            data:{
                teacherSelect: teachernumber
            },
            dataType : "json"
        }).done(function(result){
            if(result.success){
               $("#teacherNumber").html(teachernumber);
            }
        }).fail(function(){
            alert("服务器问题，请联系管理员");
        });
    }
}

function updateStudent(){
    var studentnumber=$("#studentnumbernew").val();
    if(studentnumber!=""){
        $.ajax({
            url: "/user/studentSelect",
            type: "GET",
            data:{
                studentSelect: studentnumber
            },
            dataType : "json"
        }).done(function(result){
            if(result.success){
                $("#studentNumber").html(studentnumber);
            }
        }).fail(function(){
            alert("服务器问题，请联系管理员");
        });
    }
}

function isResult(){
    $.ajax({
        url: "/user/isResult",
        type: "GET",
        dataType : "json"
    }).done(function(result){
        if(result.success){
            alert("所有学生已被选择，邮箱已发送");
        }else{
            alert("还有学生未被选择，请督促学生或导师尽快选择");
        }
    }).fail(function(){
        alert("服务器问题，请联系管理员");
    });
}