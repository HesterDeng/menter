/**
 * tabʵ�ַ���
 * @param name
 * @param url
 */
function showTab(name,url){
    //��һ����name���ܺ�menus�ظ�
    //typeof��������menusδ��������type������
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
 * �����Ϊ��tab�Ĺرհ�ť�ܹ��ɹ�
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
        alert("���������⣬����ϵ����Ա");
    });
}