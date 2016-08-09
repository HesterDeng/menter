package action;

import dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import service.UserService;
import utils.WebResponse;
import utils.rest.annotation.Get;
import utils.rest.annotation.Post;

import javax.annotation.Resource;

/**
 * Created by xheart on 2016/8/3.
 */
@Controller
@RequestMapping("/user")
public class UserAction {
    @Resource
    private UserService userService;

    /**
     * 登录
     * @param user
     * @return
     */
    @Get("/login")
    @ResponseBody
    public WebResponse login(@RequestParam("username") String username,@RequestParam("password") String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return WebResponse.success(userService.login(user));
    }

    /**
     * 保存用户信息
     * @param username 用户
     * @return 用户id
     * 问题1: Get方式不能用json方式接收数据
     * 问题2: 其实他根本不认识你的Get. 因为Get 的注解为interface, 没有实现. 我又去moon上捞了个文件.集中放到utils下面了.
     *        在这之后,才是配置文件中需要配置开启restful风格url.参见 spring-servlet.xml 23行.2016年8月3日 22:18:01
     */

    @Get("/save")
    @ResponseBody
    public WebResponse save(@RequestParam("username")String username,@RequestParam("password")String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        System.out.println("-------");
        return WebResponse.success(userService.save(user));
    }

    /**
     * 测试添加 (通用方法1)
     * @param username
     * @param password
     * @return {"success":true,"result":1,"throwable":null,"permission":true}
     */
    @RequestMapping("/add")

    @ResponseBody
    public WebResponse add(@RequestParam("username")String username,@RequestParam("password")String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return WebResponse.success(userService.save(user));
    }

}
