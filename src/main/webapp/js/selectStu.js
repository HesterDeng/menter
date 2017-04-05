function nameFormatter(value) {
    if(value!=undefined){
        return '<a href="javascript:void(0)" onclick="getCV(' + value + ')">more</a>';
    }
}

function actionFormatter(value, row, index) {
    return [
        '<a class="delete ml10" href="javascript:void(0)" title="Delete" data-target="#deleteModal" data-toggle="modal">',
        '<i class="glyphicon glyphicon-remove"></i>',
        '</a>'
    ].join('');
}

window.actionEvents = {
    'click .delete': function (e, value, row, index) {
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

function deleteSubmit(){
    $.ajax({
        url: "/teacher/deleteStu",
        data: {
            studentid:$(".id").val()
        },
        type: "Get",
        dataType : "json"
    }).done(function(result){
        if(result.success){
            $(".table").bootstrapTable('refresh',"/teacher/selectStudents");
        }else{
            alert("failed")
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