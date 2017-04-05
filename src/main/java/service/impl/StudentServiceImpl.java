package service.impl;

import dto.Page;
import dto.StuTea;
import dto.Student;
import org.springframework.stereotype.Service;
import repository.StudentRepository;
import repository.SystemRepository;
import service.StudentService;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * Created by Esther on 2016/8/20.
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Resource
    private StudentRepository studentRepository;
    @Resource
    private SystemRepository systemRepository;

    @Override
    public HashMap<String, Object> list(Page page) {
        HashMap<String,Object> pageList = new HashMap<String, Object>();
        if(page.getSearch()==null){
            pageList.put("total",studentRepository.listCount());
            pageList.put("rows",studentRepository.list(page));
        }else {
            pageList.put("total",studentRepository.searchCount(page));
            pageList.put("rows",studentRepository.search(page));
        }
        return pageList;
    }

    @Override
    public Long addStudent(String name, String password) {
        Student student = new Student();
        student.setName(name);
        student.setPassword(password);
        return studentRepository.addStudent(student);
    }

    @Override
    public Boolean deleteStudent(Long studentid) {
        try {
            if(studentRepository.deleteStudent(studentid)>0){
                return true;
            }
            return false;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Student login(Student student) {
        Student getStu=studentRepository.login(student.getName());
        if(getStu !=null &&getStu.getPassword().equals(student.getPassword())){
            return getStu;
        }
        return null;
    }

    @Override
    public Boolean updatePassword(Student student) {
        try {
            if(studentRepository.updatePassword(student)>0){
                return true;
            }
            return false;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Boolean updateInformation(Student student) {
        try {
            if(studentRepository.updateInformation(student)>0){
                return true;
            }
            return false;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Student selectById(Long id) {
        return studentRepository.selectById(id);
    }

    @Override
    public Boolean selectTeacher(StuTea stuTea) {
        Integer max=studentRepository.getMax(stuTea.getStudentid());
        if(max==null){
            max=0;
        }
        if(max<systemRepository.studentNumber()){
            stuTea.setListnumber(max + 1);
            studentRepository.selectTeacher(stuTea);
            return true;
        }
        return false;
    }

    @Override
    public HashMap<String, Object> teachers(Long studentid, Page page) {
        HashMap<String,Object> pageList = new HashMap<String, Object>();
        pageList.put("total",studentRepository.teacherCount(studentid));
        pageList.put("rows",studentRepository.teachers(studentid, page));
        return pageList;
    }

    @Override
    public void upTeacher(Long studentid, int listnumber,Long teacherid) {
        studentRepository.down(studentid, listnumber-1);
        studentRepository.up(studentid,teacherid);
    }

    @Override
    public void deleteTea(Long studentid, int listnumber) {
        studentRepository.deleteTea(studentid, listnumber);
        studentRepository.updateTea(studentid, listnumber);
    }

    @Override
    public int updateCvid(Long cvid, Long id) {
        return studentRepository.updateCvid(cvid,id);
    }

    @Override
    public HashMap<String, Object> selectTeas(Long studentid,Page page) {
        HashMap<String,Object> pageList = new HashMap<String, Object>();
        pageList.put("total",studentRepository.teasCount(studentid, page));
        pageList.put("rows",studentRepository.selectTeas(studentid, page));
        return pageList;
    }

    @Override
    public Boolean isselect(Long id) {
        return studentRepository.isselect(id);
    }

    @Override
    public void updateIsselect(Long id) {
        studentRepository.updateIsselect(id);
    }


}
