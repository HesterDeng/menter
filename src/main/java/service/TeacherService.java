package service;

import dto.Page;
import dto.Student;
import dto.Teacher;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Esther on 2016/8/20.
 */
public interface TeacherService {
    /**
     * 列出老师
     * @return 老师列表
     */
    HashMap<String, Object> list(Page page);

    /**
     * 添加导师
     * @param name
     * @param password
     * @return
     */
    Long addTeacher(String name,String password);

    /**
     * 删除导师
     * @param teacherid
     * @return
     */
    Boolean deleteTeacher(Long teacherid);

    /**
     * 登陆
     * @param teacher
     * @return
     */
    Teacher login(Teacher teacher);

    /**
     * 更新密码
     * @param teacher
     * @return
     */
    Boolean updatePassword(Teacher teacher);

    /**
     * 更新老师基本信息
     * @param teacher
     */
    Boolean updateInformation(Teacher teacher);

    /**
     * 通过id查找老师基本信息
     * @param id
     * @return
     */
    Teacher selectById(Long id);

    /**
     * 列出老师可以选择的学生
     * @param teacherid
     * @return
     */
    HashMap<String, Object> listStudent(Long teacherid,Page page);

    /**
     * 老师拒绝学生
     * @param studentid
     * @return
     */
    Boolean nextTeacher(Long studentid);

    /**
     * 选中一个学生
     * @param studentid
     * @param teacherid
     * @return
     */
    Integer selectStu(Long studentid,Long teacherid);

    /**
     * 返回老师选择学生的列表
     * @param teacherid
     * @return
     */
    HashMap<String, Object> selectStudents(Long teacherid,Page page);

    /**
     * 加入后删除的学生
     * @param studentid
     * @param teacherid
     * @return
     */
    Boolean deleteStudent(Long studentid,Long teacherid);
    /**
     * 添加cvid
     * @param cvid
     * @param id
     * @return
     */
    int updateCvid(Long cvid,Long id);
}
