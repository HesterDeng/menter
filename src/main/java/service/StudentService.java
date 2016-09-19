package service;

import dto.Page;
import dto.StuTea;
import dto.Student;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Esther on 2016/8/20.
 */
public interface StudentService {
    /**
     * 列出学生
     * @return 学生列表
     */
    HashMap<String, Object> list(Page page);

    /**
     * 添加学生
     * @param name
     * @param password
     * @return
     */
    Long addStudent(String name,String password);

    /**
     * 删除学生
     * @param studentid
     * @return
     */
    Boolean deleteStudent(Long studentid);

    /**
     * 登陆
     * @param student
     * @return
     */
    Student login(Student student);

    /**
     * 更改密码
     * @param student
     * @return
     */
    Boolean updatePassword(Student student);

    /**
     * 更新学生基本信息
     * @param student
     */
    Boolean updateInformation(Student student);

    /**
     * 通过id查找学生基本信息
     * @param id
     * @return
     */
    Student selectById(Long id);

    /**
     * 添加一个学生的志愿
     * @param stuTea
     */
    Boolean selectTeacher(StuTea stuTea);

    /**
     * 列出学生选择的导师列表
     * @param studentid
     * @param page
     * @return
     */
    HashMap<String, Object> teachers(Long studentid,Page page);

    /**
     * 导师上升
     * @param studentid
     * @param listnumber
     */
    void upTeacher(Long studentid,int listnumber,Long teacherid);

    /**
     * 删除导师
     * @param studentid
     * @param listnumber
     */
    void deleteTea(Long studentid,int listnumber);

    /**
     * 添加cvid
     * @param cvid
     * @param id
     * @return
     */
    int updateCvid(Long cvid,Long id);

    HashMap<String, Object> selectTeas(Long studentid,Page page);
}
