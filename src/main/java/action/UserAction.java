package action;

import dto.Page;
import dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import repository.SystemRepository;
import service.UserService;
import utils.WebResponse;
import utils.rest.annotation.Delete;
import utils.rest.annotation.Get;
import utils.rest.annotation.Post;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * Created by xheart on 2016/8/3.
 */
@Controller
@RequestMapping("/user")
public class UserAction {
    @Resource
    private UserService userService;
    @Resource
    private SystemRepository systemRepository;

    /**
     * 登录
     * @return
     */
    @Get("/login")
    @ResponseBody
    public WebResponse login(HttpServletRequest request, @RequestParam("name") String username,@RequestParam("password") String password){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user=userService.login(user);
        if(user==null){
            return WebResponse.fail();
        }
        request.getSession().setAttribute("id", user.getId());
        return WebResponse.success(user);
    }

    @Get("delete")
    @ResponseBody
    public WebResponse delete(@RequestParam("id")Long id){
        return WebResponse.success(userService.delete(id));
    }

    @Post("update")
    @ResponseBody
    public WebResponse update(@RequestBody User user){
        return WebResponse.success(userService.update(user));
    }

    /**
     * 测试添加 (通用方法1)
     * @param username
     * @param password
     * @return {"success":true,"result":1,"throwable":null,"permission":true}
     */
    @Get("/add")
    @ResponseBody
    public WebResponse add(@RequestParam("username")String username,@RequestParam("password")String password,
    @RequestParam("roleid")Long roleid){
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        user.setRoleid(roleid);
        return WebResponse.success(userService.save(user));
    }

    /**
     * 列出用户
     */
    @Post("/list")
    @ResponseBody
    public HashMap<String, Object> list(@RequestBody Page page){
        return userService.list(page);
    }

    @Get("teacherSelect")
    @ResponseBody
    public WebResponse setTeacher(@RequestParam("teacherSelect")int teacherSelect){
        return WebResponse.success(systemRepository.updateTeacher(teacherSelect));
    }

    @Get("studentSelect")
    @ResponseBody
    public WebResponse setStudent(@RequestParam("studentSelect")int studentSelect){
        return WebResponse.success(systemRepository.updateStudent(studentSelect));
    }

    @Get("getStudentNum")
    @ResponseBody
    public WebResponse getStudent(){
        return WebResponse.success(systemRepository.studentNumber());
    }

    @Get("getTeacherNum")
    @ResponseBody
    public WebResponse getTeacher(){
        return WebResponse.success(systemRepository.teacherNumber());
    }

    @Get("mark")
    @ResponseBody
    public WebResponse addMark(@RequestParam("mark")int mark){
        return WebResponse.success(systemRepository.addMark(mark));
    }

    @Get("markSum")
    @ResponseBody
    public WebResponse getMark(){
        return WebResponse.success(systemRepository.getMark());
    }

    @Get("close")
    @ResponseBody
    public WebResponse close(HttpServletRequest request){
        request.getSession().removeAttribute("id");
        return WebResponse.success();
    }

}
