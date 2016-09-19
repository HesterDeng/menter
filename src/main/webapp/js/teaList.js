function nameFormatter(value) {
    if(value!=undefined){
        return '<a href="javascript:void(0)" onclick="getCV(' + value + ')"> more</a>';
    }
}

function actionFormatter(value, row, index) {
    return [
        '<a class="add" href="javascript:void(0)" data-target="#addModal" title="Add" data-toggle="modal" >',
        '<i class="glyphicon glyphicon-plus"></i>',
        '</a>'
    ].join('');
}

window.actionEvents = {
    'click .add': function (e, value, row, index) {
        $("#menter").html(row["name"]);
        $(".id").val(row["id"]);
    }
};

function queryParams(params){
    var pp= {
        limit: params.limit,   //页面大小
        offset: params.offset,
        search:params.search
    };
    return JSON.stringify(pp);
}


function addSubmit(){
    $.ajax({
        url: "/student/selectTeacher",
        data: {
            teacherid:$(".id").val()
        },
        type: "Get",
        dataType : "json"
    }).done(function(result){
        if(result.success){
            $(".table").bootstrapTable('refresh',"/student/selectTeas");
        }else{
            alert("添加失败");
        }
    }).fail(function(){
        alert("服务器问题，请联系管理员");
    });
}

function getCV(value){
    $('#cvModal').modal({
        keyboard: true
    });
    $.ajax({
        url: "/teacher/cv",
        data: {
            id:value
        },
        type: "Get",
        dataType : "json"
    }).done(function(result){
        if(result.success){
            $("#experience").html(result.result["cvexperience"]);
            $("#result").html(result.result["cvresult"]);
            $("#other").html(result.result["cvother"]);
        }else{
            alert("添加失败");
        }
    }).fail(function(){
        alert("服务器问题，请联系管理员");
    });
}