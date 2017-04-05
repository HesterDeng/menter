package repository;

import dto.Page;
import dto.Student;
import dto.Teacher;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Esther on 2016/8/20.
 */
@Repository
public interface TeacherRepository {
    /**
     * 注意：如果参数只有一个可以不用param，如果多个必须用param
     * 列出老师
     * @return id
     */
    List<Teacher> list(@Param("page") Page page);
    /**
     * 老师总数
     */
    int listCount();

    /**
     * 添加老师的姓名和密码，返回id
     * @param teacher
     * @return
     */
    Long addTeacher(@Param("teacher")Teacher teacher);

    /**
     * 删除老师
     * @param teacherid
     */
    Integer deleteTeacher(@Param("teacherid")Long teacherid);

    /**
     * 通过name返回teacher
     * @param name
     * @return
     */
    Teacher login(@Param("name")String name);

    /**
     * 第一次登陆时更新密码
     * @param teacher
     */
    Integer updatePassword(@Param("teacher")Teacher teacher);

    /**
     * 通过id获取teacher基本信息
     * @param id
     * @return
     */
    Teacher selectById(@Param("id")Long id);

    /**
     * 更新teacher基本信息
     * @param teacher
     */
    Integer updateInformation(@Param("teacher")Teacher teacher);

    /**
     * 列出老师选择的学生列表
     * @param teacherid
     * @return
     */
    List<Teacher> listStudent(@Param("teacherid")Long teacherid,@Param("page")Page page);

    /**
     * 老师可以选择的总数
     * @param teacherid
     * @param page
     * @return
     */
    int listCountStu(@Param("teacherid")Long teacherid,@Param("page")Page page);

    /**
     * 老师已选择人数
     * @param teacherid
     * @return
     */
    int countStudent(@Param("teacherid")Long teacherid);

    /**
     * 老师选择学生
     * @param studentid
     * @param teacherid
     */
    Integer checkStudent(@Param("studentid")Long studentid,@Param("teacherid")Long teacherid);

    /**
     * 学生跳入下一个导师
     * @param studentid
     */
    Integer nextTeacher(@Param("studentid")Long studentid);

    /**
     * 加入学生后又删除
     * @param studentid
     * @param teacherid
     */
    Integer deleteStudent(@Param("studentid")Long studentid,@Param("teacherid")Long teacherid);

    /**
     * 老师选择的学生列表
     * @param teacherid
     * @return
     */
    List<Student> selectStudents(@Param("teacherid")Long teacherid,@Param("page")Page page);

    int stuCount(@Param("teacherid")Long teacherid,@Param("page")Page page);

    /**
     * 根据姓名模糊查询
     * @param page
     * @return
     */
    List<Teacher> search(@Param("page") Page page);

    /**
     * 模糊查询的结果总数
     * @param page
     * @return
     */
    Integer searchCount(@Param("page")Page page);
    /**
     * 更新cvid
     * @param cvid
     * @param id
     * @return
     */
    int updateCvid(@Param("cvid")Long cvid,@Param("id")Long id);

    /**
     * 还有多少学生为填完志愿
     * @return
     */
    int isselect();
}
