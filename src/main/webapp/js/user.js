function actionFormatter(value, row, index) {
    return [
        '<a class="add" href="javascript:void(0)" data-target="#addModal" title="Add" data-toggle="modal" >',
        '<i class="glyphicon glyphicon-plus"></i>',
        '</a>',
        '<a class="edit ml10" href="javascript:void(0)" title="Edit" data-target="#editModal" data-toggle="modal">',
        '<i class="glyphicon glyphicon-edit"></i>',
        '</a>',
        '<a class="delete ml10" href="javascript:void(0)" title="Delete" data-target="#deleteModal" data-toggle="modal">',
        '<i class="glyphicon glyphicon-remove"></i>',
        '</a>'
    ].join('');
}

window.actionEvents = {
    'click .edit': function (e, value, row, index) {
        $(".id").val(row["id"]);
    },
    'click .delete': function (e, value, row, index) {
        $(".id").val(row["id"]);
    }
};

function queryParams(params){
 var pp= {
     limit: params.limit,   //ҳ���С
     offset: params.offset,
     search:params.search
 };
    return JSON.stringify(pp);
}

function deleteSubmit(){
    $.ajax({
        url: "/user/delete",
        data: {
            id:$(".id").val()
        },
        type: "Get",
        dataType : "json"
    }).done(function(result){
        if(result.success){
            alert("success");
            $(".table").bootstrapTable('refresh',"/user/list");
        }else{
            alert("�û����������벻��ȷ����ȷ��")
        }
    }).fail(function(){
        alert("���������⣬����ϵ����Ա");
    });
}

function addUser(){
    $.ajax({
        url: "/user/add",
        data: {
            username: $("#username").val(),
            password:$("#password").val(),
            roleid:$("#roleid").val()
        },
        type: "Get",
        dataType : "json"
    }).done(function(result){
        if(result.success){
            alert("success");
            $(".table").bootstrapTable('refresh',"/user/list");
        }else{
            alert("���ʧ��");
        }
    }).fail(function(){
        alert("���������⣬����ϵ����Ա");
    });
}

function editUser(){
    var dat={
            id:$(".id").val(),
            username: $("#usernamenew").val(),
            password:$("#passwordnew").val(),
            roleid:$("#roleidnew").val()
        };
    $.ajax({
        url: "/user/update",
        data:JSON.stringify(dat),
        type: "Post",
        dataType : "json",
        contentType:"application/json"
    }).done(function(result){
        if(result.success){
            alert("success");
            $(".table").bootstrapTable('refresh',"/user/list");
        }else{
            alert("���ʧ��");
        }
    }).fail(function(){
        alert("���������⣬����ϵ����Ա");
    });
}