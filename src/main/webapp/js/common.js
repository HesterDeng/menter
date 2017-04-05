/**
 * tab实现方法
 * @param name
 * @param url
 */
function showTab(name,url){
    //第一步：name不能和menus重复
    //typeof可以允许menus未创建，而type不可以
    if(typeof(menus)=="undefined"){
        menus=new Array();
    }
    if($.inArray(name,menus)!=-1){
        $("iframe[src=\""+url+"\"]").attr("src",url);
    }else{
        menus.push(name);
        $(".tab").KandyTabs({
            trigger:"click",
            scroll:true
        }).add("<span><span class=\"title\">"+name+"</span><i class=\"pointer close-tab\">X</i></span>",
            "<iframe src=\""+url+"\" name=\"main\" allowfullscreen=\"false\"></iframe>",
            true);
    }
}
/**
 * 这个是为了tab的关闭按钮能够成功
 */
$(document).on("click",".tabbtn i",function(e){
    var $menu = $(e.target).parent();
    var name = $(e.target).prev("span").html();
    $(".tab").KandyTabs({
        trigger:"click",
        scroll:true
    }).del($menu);
    menus = $.grep(menus,function(value,i){
        return value != name;
    });
});

function closeSession(){
    $.ajax({
        url: "/user/close",
        type: "Get",
        dataType : "json"
    }).done(function(result){
        if(result.success){
            window.location.href="http://localhost:8081/";
        }else{
            alert("failed")
        }
    }).fail(function(){
        alert("服务器问题，请联系管理员");
    });
}