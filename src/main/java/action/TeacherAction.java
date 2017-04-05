package action;

import dto.Cv;
import dto.Page;
import dto.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import repository.CvRepository;
import service.TeacherService;
import utils.WebResponse;
import utils.rest.annotation.Get;
import utils.rest.annotation.Post;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

/**
 * Created by Esther on 2016/8/20.
 */
@Controller
@RequestMapping("/teacher")
public class TeacherAction {

    @Resource
    TeacherService teacherService;
    @Resource
    CvRepository cvRepository;

    @Post("/list")
    @ResponseBody
    public HashMap<String, Object> list(@RequestBody Page page){
        return teacherService.list(page);
    }

    @Get("/cv")
    @ResponseBody
    public WebResponse getCv(@RequestParam("id") Long id){
        return WebResponse.success(cvRepository.selectCv(id));
    }

    @Get("/add")
    @ResponseBody
    public WebResponse addTeacher(@RequestParam("name")String name,@RequestParam("password") String password){
        return WebResponse.success(teacherService.addTeacher(name, password));
    }

    @Get("deleteTea")
    @ResponseBody
    public WebResponse deleteTeacher(@RequestParam("id")Long id){
        return WebResponse.success(teacherService.deleteTeacher(id));
    }

    @Get("login")
    @ResponseBody
    public WebResponse login(HttpServletRequest request,@RequestParam("name")String name,@RequestParam("password")String password){
        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setPassword(password);
        teacher = teacherService.login(teacher);
        if(teacher==null){
            return WebResponse.fail();
        }
        request.getSession().setAttribute("id", teacher.getId());
        return WebResponse.success(teacher);
    }

    @Get("updatePassword")
    @ResponseBody
    public WebResponse updatePassword(HttpServletRequest request,@RequestParam("password")String password){
        Long id=(Long)request.getSession().getAttribute("id");
        Teacher teacher = new Teacher();
        teacher.setId(id);
        teacher.setPassword(password);
        return WebResponse.success(teacherService.updatePassword(teacher));
    }

    @Get("isselect")
    @ResponseBody
    public WebResponse isselect(){
        return WebResponse.success(teacherService.isselect());
    }

    @Get("getCV")
    @ResponseBody
    public WebResponse getCV(@RequestParam("id")Long id){
        HashMap<String,Object> cv = new HashMap<String, Object>();
        Teacher teacher = teacherService.selectById(id);
        if(teacher.getCvid()==null){
            cv.put("teacher",teacher);
            return WebResponse.success(cv);
        }else {
            cv.put("teacher",teacher);
            cv.put("cv", cvRepository.selectCv(teacher.getCvid()));
            return WebResponse.success(cv);
        }
    }

    @Post("updateTea")
    @ResponseBody
    public WebResponse updateTea(@RequestBody Teacher teacher){
        return WebResponse.success(teacherService.updateInformation(teacher));
    }

    @Post("updateCV")
    @ResponseBody
    public WebResponse updateCV(@RequestBody Cv cv){
        return WebResponse.success(cvRepository.updateCv(cv));
    }

    @Post("addCV")
    @ResponseBody
    public WebResponse addCV(HttpServletRequest request,@RequestBody Cv cv){
        Long id=(Long)request.getSession().getAttribute("id");
        Long cvid=cvRepository.addCv(cv);
        if(teacherService.updateCvid(cvid,id)>0){
            return WebResponse.success();
        }
        return  WebResponse.fail();
    }

    /**
     * 列出老师可以选择的学生列表
     * @return
     */
    @Post("listStudent")
    @ResponseBody
    public HashMap<String, Object> listStudent(HttpServletRequest request,@RequestBody Page page){
        Long id=(Long)request.getSession().getAttribute("id");
        return teacherService.listStudent(id, page);
    }

    /**
     * 老师拒绝学生的申请
     * @param studentid
     * @return
     */
    @Get("reject")
    @ResponseBody
    public WebResponse reject(@RequestParam("studentid")Long studentid){
        return WebResponse.success(teacherService.nextTeacher(studentid));
    }

    /**
     * 导师选择一个学生
     * @param studentid
     * @return
     */
    @Get("selectStu")
    @ResponseBody
    public WebResponse selectStu(HttpServletRequest request,@RequestParam("studentid")Long studentid){
        Long id=(Long)request.getSession().getAttribute("id");
        return WebResponse.success(teacherService.selectStu(studentid, id));
    }

    /**
     * 导师选择的学生列表
     * @return
     */
    @Post("selectStudents")
    @ResponseBody
    public HashMap<String, Object> selectStudents(HttpServletRequest request,@RequestBody Page page){
        Long id=(Long)request.getSession().getAttribute("id");
        return teacherService.selectStudents(id,page);
    }

    /**
     * 加入后删除学生
     * @param studentid
     * @return
     */
    @Get("deleteStu")
    @ResponseBody
    public WebResponse delete(HttpServletRequest request,@RequestParam("studentid")Long studentid){
        Long id=(Long)request.getSession().getAttribute("id");
        return WebResponse.success(teacherService.deleteStudent(studentid, id));
    }

}
