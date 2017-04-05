package action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.RoleService;
import utils.rest.annotation.Get;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * Created by xheart on 2016/8/14.
 */
@Controller
@RequestMapping("/role")
public class RoleAction {
    @Resource
    RoleService roleService;
    /**
     * 列出角色列表
     * @return
     */
    @Get("/list")
    @ResponseBody
    public HashMap<String, Object> list(@RequestParam("offset") int pageNumber, @RequestParam("limit") int pageSize){
        return roleService.list(pageNumber,pageSize);
    }
}
