function nameFormatter(value) {
    if(value!=undefined){
        return '<a href="javascript:void(0)" onclick="getCV(' + value + ')"> more</a>';
    }
}

function actionFormatter(value, row, index) {
    return [
        '<a class="up" href="javascript:void(0)" title="Up">',
        '<i class="glyphicon glyphicon-arrow-up"></i>',
        '</a>',
        '<a class="delete" href="javascript:void(0)" data-target="#deleteModal" title="Delete" data-toggle="modal" >',
        '<i class="glyphicon glyphicon-remove"></i>',
        '</a>'
    ].join('');
}

window.actionEvents = {
    'click .delete': function (e, value, row, index) {
        $("#menter").html(row["name"]);
        $(".id").val(row["listnumber"]);
    },
    'click .up': function (e, value, row, index) {
        if(row["listnumber"]==1){
            alert("no up");
        }else{
            $.ajax({
                url: "/student/up",
                data: {
                    listnumber:row["listnumber"],
                    teacherid:row["id"]
                },
                type: "Get",
                dataType : "json"
            }).done(function(result){
                if(result.success){
                    $(".table").bootstrapTable('refresh',"/student/teachers");
                }else{
                    alert("删除失败");
                }
            }).fail(function(){
                alert("服务器问题，请联系管理员");
            });
        }
    }
};


function deleteSubmit(){
    $.ajax({
        url: "/student/deleteTea",
        data: {
            listnumber:$(".id").val()
        },
        type: "Get",
        dataType : "json"
    }).done(function(result){
        if(result.success){
            $(".table").bootstrapTable('refresh',"/student/teachers");
        }else{
            alert("删除失败");
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