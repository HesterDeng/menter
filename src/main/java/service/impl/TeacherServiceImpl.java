package service.impl;

import dto.Page;
import dto.Student;
import dto.Teacher;
import org.springframework.stereotype.Service;
import repository.SystemRepository;
import repository.TeacherRepository;
import service.TeacherService;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Esther on 2016/8/20.
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Resource
    private TeacherRepository teacherRepository;
    @Resource
    private SystemRepository systemRepository;

    @Override
    public HashMap<String, Object> list(Page page) {
        HashMap<String,Object> pageList = new HashMap<String, Object>();
        if(page.getSearch()==null){
            pageList.put("total",teacherRepository.listCount());
            pageList.put("rows",teacherRepository.list(page));
        }else {
            pageList.put("total",teacherRepository.searchCount(page));
            pageList.put("rows",teacherRepository.search(page));
        }
        return pageList;
    }

    @Override
    public Long addTeacher(String name, String password) {
        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setPassword(password);
        return teacherRepository.addTeacher(teacher);
    }

    @Override
    public Boolean deleteTeacher(Long teacherid) {
        try {
            if(teacherRepository.deleteTeacher(teacherid)>0){
                return true;
            }
            return false;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Teacher login(Teacher teacher) {
        Teacher getTea=teacherRepository.login(teacher.getName());
        if(getTea !=null &&getTea.getPassword().equals(teacher.getPassword())){
            return getTea;
        }
        return null;
    }

    @Override
    public Boolean updatePassword(Teacher teacher) {
        try {
            if(teacherRepository.updatePassword(teacher)>0){
                return true;
            }
            return false;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Boolean updateInformation(Teacher teacher) {
        try {
            if(teacherRepository.updateInformation(teacher)>0){
                return true;
            }
            return false;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Teacher selectById(Long id) {
        return teacherRepository.selectById(id);
    }

    @Override
    public HashMap<String, Object> listStudent(Long teacherid,Page page) {
        HashMap<String,Object> pageList = new HashMap<String, Object>();
        pageList.put("total",teacherRepository.listCountStu(teacherid, page));
        pageList.put("rows",teacherRepository.listStudent(teacherid, page));
        return pageList;
    }

    @Override
    public Boolean nextTeacher(Long studentid) {
        try {
            if(teacherRepository.nextTeacher(studentid)>0){
                return true;
            }
            return false;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public Integer selectStu(Long studentid, Long teacherid) {
        if(systemRepository.teacherNumber()>=teacherRepository.countStudent(teacherid)){
            return teacherRepository.checkStudent(studentid,teacherid);
        }
        return -2;
    }

    @Override
    public HashMap<String,Object> selectStudents(Long teacherid,Page page) {
        HashMap<String,Object> pageList = new HashMap<String, Object>();
        pageList.put("total",teacherRepository.stuCount(teacherid,page));
        pageList.put("rows",teacherRepository.selectStudents(teacherid,page));
        return pageList;
    }

    @Override
    public Boolean deleteStudent(Long studentid, Long teacherid) {
        try {
            if(teacherRepository.nextTeacher(studentid)>0&&
                    teacherRepository.deleteStudent(studentid, teacherid)>0 ){
                return true;
            }
            return false;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public int updateCvid(Long cvid, Long id) {
        return teacherRepository.updateCvid(cvid,id);
    }
}
