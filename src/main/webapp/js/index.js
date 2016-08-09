/**
 * tab实现方法
 * @param name
 * @param url
 */
function showTab(name,url){
    //第一步：name不能和menus重复
    menus = new Array();
    if($.inArray(name,menus)!=-1){
        //刷新
    }else{
        $(".tab").kandytabs({
            trigger:"click",
            scroll:true
        }).add("<span><span class=\"title\">"+name+"</span>"+"<i class=\"fa fa-times pointer close-tab\"></i>"+"</span>",
            "<iframe src=\""+url+"\" name=\"main\" allowfullscreen=\"true\"></iframe>",
            true);
    }
}