package repository;

import dto.Page;
import dto.StuTea;
import dto.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Esther on 2016/8/20.
 */
@Repository
public interface StudentRepository {
    /**
     * 注意：如果参数只有一个可以不用param，如果多个必须用param
     * 列出学生
     * @return id
     */
    List<Student> list(@Param("page")Page page);
    /**
     * 学生总数
     */
    int listCount();

    /**
     * 添加学生的姓名和密码
     * @param student
     * @return
     */
    Long addStudent(@Param("student")Student student);

    /**
     * 删除学生
     * @param studentid
     */
    Integer deleteStudent(@Param("studentid")Long studentid);

    /**
     * 通过姓名确定密码登陆
     * @param name
     * @return
     */
    Student login(@Param("name")String name);

    /**
     * 第一次登陆时更改密码
     * @param student
     */
    Integer updatePassword(@Param("student")Student student);

    /**
     * 更新用户简历的基本信息
     * @param student
     */
    Integer updateInformation(@Param("student")Student student);

    /**
     * 通过id获取简历基本信息
     * @param id
     * @return
     */
    Student selectById(@Param("id")Long id);

    /**
     * 添加一个学生选择老师的志愿
     * @param stuTea
     */
    void selectTeacher(@Param("stuTea")StuTea stuTea);

    /**
     * 根据姓名模糊查询
     * @param page
     * @return
     */
    List<Student> search(@Param("page") Page page);

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
     * 列出学生可以选择的老师列表
     * @param studentid
     * @return
     */
    List<Student> selectTeas(@Param("studentid")Long studentid,@Param("page") Page page);

    int teasCount(@Param("studentid")Long studentid,@Param("page") Page page);

    /**
     * 获取学生选择导师的人数
     * @param studentid
     * @return
     */
    Integer getMax(@Param("studentid")Long studentid);

    /**
     * 已选老师列表
     * @param studentid
     * @return
     */
    List<Object> teachers(@Param("studentid")Long studentid,@Param("page")Page page);

    int teacherCount(@Param("studentid")Long studentid);

    /**
     * 导师上移
     * @param studentid
     * @param teacherid
     * @return
     */
    int up(@Param("studentid")Long studentid,@Param("teacherid") Long teacherid);

    /**
     * 导师下移
     * @param studentid
     * @param listnumber
     * @return
     */
    int down(@Param("studentid")Long studentid,@Param("listnumber") int listnumber);

    /**
     * 将删除的导师后面的上移
     * @param studentid
     * @param listnumber
     * @return
     */
    int updateTea(@Param("studentid")Long studentid,@Param("listnumber") int listnumber);

    /**
     * 删除导师
     * @param studentid
     * @param listnumber
     * @return
     */
    int deleteTea(@Param("studentid")Long studentid,@Param("listnumber") int listnumber);

    /**
     * 学生是否已经确定了选择
     * @param id
     * @return
     */
    Boolean isselect(@Param("id")Long id);

    /**
     * 学生确定不更改了
     * @param id
     */
    void updateIsselect(@Param("id")Long id);
}
