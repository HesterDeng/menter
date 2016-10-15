package action;

import dto.Cv;
import dto.Page;
import dto.StuTea;
import dto.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import repository.CvRepository;
import service.StudentService;
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
@RequestMapping("/student")
public class StudentAction {
    @Resource
    StudentService studentService;
    @Resource
    CvRepository cvRepository;

    @Post("/list")
    @ResponseBody
    public HashMap<String, Object> list(@RequestBody Page page ){
        return studentService.list(page);
    }

    @Get("/add")
    @ResponseBody
    public WebResponse addStudent(@RequestParam("name")String name,@RequestParam("password") String password){
        return WebResponse.success(studentService.addStudent(name, password));
    }

    @Get("delete")
    @ResponseBody
    public WebResponse deleteStudent(@RequestParam("id")Long id){
        return WebResponse.success(studentService.deleteStudent(id));
    }

    @Get("login")
    @ResponseBody
    public WebResponse login(HttpServletRequest request,@RequestParam("name")String name,
                             @RequestParam("password")String password){
        Student student = new Student();
        student.setName(name);
        student.setPassword(password);
        student = studentService.login(student);
        if(student==null){
            return WebResponse.fail();
        }
        request.getSession().setAttribute("id", student.getId());
        return WebResponse.success(student);
    }

    @Get("updatePassword")
    @ResponseBody
    public WebResponse updatePassword(HttpServletRequest request,@RequestParam("password")String password){
        Long id=(Long)request.getSession().getAttribute("id");
        Student student = new Student();
        student.setId(id);
        student.setPassword(password);
        return WebResponse.success(studentService.updatePassword(student));
    }

    @Get("isselect")
    @ResponseBody
    public WebResponse isselect(HttpServletRequest request){
        Long id=(Long)request.getSession().getAttribute("id");
        return WebResponse.success(studentService.isselect(id));
    }

    @Get("updateIsselect")
    @ResponseBody
    public WebResponse updateIsselect(HttpServletRequest request){
        Long id=(Long)request.getSession().getAttribute("id");
        studentService.updateIsselect(id);
        return WebResponse.success();
    }

    @Get("getCV")
    @ResponseBody
    public WebResponse getCV(@RequestParam("id")Long id){
        HashMap<String,Object> cv = new HashMap<String, Object>();
        Student student = studentService.selectById(id);
        if(student.getCvid()==null){
            cv.put("student",student);
            return WebResponse.success(cv);
        }else {
            cv.put("student",student);
            cv.put("cv", cvRepository.selectCv(student.getCvid()));
            return WebResponse.success(cv);
        }
    }

    @Post("updateStu")
    @ResponseBody
    public WebResponse updateStu(@RequestBody Student student){
        return WebResponse.success(studentService.updateInformation(student));
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
        if(studentService.updateCvid(cvid,id)>0){
            return WebResponse.success();
        }
        return  WebResponse.fail();
    }

    @Get("selectTeacher")
    @ResponseBody
    public WebResponse selectTeacher(HttpServletRequest request,@RequestParam("teacherid")Long teacherid){
        Long id=(Long)request.getSession().getAttribute("id");
        StuTea stuTea = new StuTea();
        stuTea.setStudentid(id);
        stuTea.setTeacherid(teacherid);
        return WebResponse.success(studentService.selectTeacher(stuTea));
    }

    @Get("teachers")
    @ResponseBody
    public HashMap<String, Object> teachers(HttpServletRequest request,@RequestParam("offset")int offset,
                                            @RequestParam("limit")int limit){
        Long id=(Long)request.getSession().getAttribute("id");
        Page page=new Page();
        page.setOffset(offset);
        page.setLimit(limit);
        return studentService.teachers(id, page);
    }

    @Get("up")
    @ResponseBody
    public WebResponse up(HttpServletRequest request,@RequestParam("listnumber")int listnumber,
                          @RequestParam("teacherid")Long teacherid){
        Long id=(Long)request.getSession().getAttribute("id");
        studentService.upTeacher(id, listnumber, teacherid);
        return WebResponse.success();
    }

    @Get("deleteTea")
    @ResponseBody
    public WebResponse deleteTea(HttpServletRequest request,@RequestParam("listnumber")int listnumber){
        Long id=(Long)request.getSession().getAttribute("id");
        studentService.deleteTea(id, listnumber);
        return WebResponse.success();
    }

    @Post("selectTeas")
    @ResponseBody
    public HashMap<String, Object> selectTeas(HttpServletRequest request,@RequestBody Page page){
        Long id=(Long)request.getSession().getAttribute("id");
        return studentService.selectTeas(id, page);
    }
}
