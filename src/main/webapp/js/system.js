$(document).ready(function(){
    $.ajax({
        url: "/user/getTeacherNum",
        type: "GET",
        dataType : "json"
    }).done(function(result){
        if(result.success){
            $("#teacherNumber").html(result.result);
        }
    }).fail(function(){
        alert("服务器问题，请联系管理员");
    });
    $.ajax({
        url: "/user/getStudentNum",
        type: "GET",
        dataType : "json"
    }).done(function(result){
        if(result.success){
            $("#studentNumber").html(result.result);
        }
    }).fail(function(){
        alert("服务器问题，请联系管理员");
    });
    $.ajax({
        url: "/user/markSum",
        type: "GET",
        dataType : "json"
    }).done(function(result){
        if(result.success){
            $("#marksum").html(result.result["marksum"]);
            $("#usernumber").html(result.result["usernumber"]);
            $("#avg").html(result.result["marksum"]/result.result["usernumber"]);
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