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
     * ע�⣺�������ֻ��һ�����Բ���param��������������param
     * �г���ʦ
     * @return id
     */
    List<Teacher> list(@Param("page") Page page);
    /**
     * ��ʦ����
     */
    int listCount();

    /**
     * �����ʦ�����������룬����id
     * @param teacher
     * @return
     */
    Long addTeacher(@Param("teacher")Teacher teacher);

    /**
     * ɾ����ʦ
     * @param teacherid
     */
    Integer deleteTeacher(@Param("teacherid")Long teacherid);

    /**
     * ͨ��name����teacher
     * @param name
     * @return
     */
    Teacher login(@Param("name")String name);

    /**
     * ��һ�ε�½ʱ��������
     * @param teacher
     */
    Integer updatePassword(@Param("teacher")Teacher teacher);

    /**
     * ͨ��id��ȡteacher������Ϣ
     * @param id
     * @return
     */
    Teacher selectById(@Param("id")Long id);

    /**
     * ����teacher������Ϣ
     * @param teacher
     */
    Integer updateInformation(@Param("teacher")Teacher teacher);

    /**
     * �г���ʦѡ���ѧ���б�
     * @param teacherid
     * @return
     */
    List<Teacher> listStudent(@Param("teacherid")Long teacherid,@Param("page")Page page);

    /**
     * ��ʦ����ѡ�������
     * @param teacherid
     * @param page
     * @return
     */
    int listCountStu(@Param("teacherid")Long teacherid,@Param("page")Page page);

    /**
     * ��ʦ��ѡ������
     * @param teacherid
     * @return
     */
    int countStudent(@Param("teacherid")Long teacherid);

    /**
     * ��ʦѡ��ѧ��
     * @param studentid
     * @param teacherid
     */
    Integer checkStudent(@Param("studentid")Long studentid,@Param("teacherid")Long teacherid);

    /**
     * ѧ��������һ����ʦ
     * @param studentid
     */
    Integer nextTeacher(@Param("studentid")Long studentid);

    /**
     * ����ѧ������ɾ��
     * @param studentid
     * @param teacherid
     */
    Integer deleteStudent(@Param("studentid")Long studentid,@Param("teacherid")Long teacherid);

    /**
     * ��ʦѡ���ѧ���б�
     * @param teacherid
     * @return
     */
    List<Student> selectStudents(@Param("teacherid")Long teacherid,@Param("page")Page page);

    int stuCount(@Param("teacherid")Long teacherid,@Param("page")Page page);

    /**
     * ��������ģ����ѯ
     * @param page
     * @return
     */
    List<Teacher> search(@Param("page") Page page);

    /**
     * ģ����ѯ�Ľ������
     * @param page
     * @return
     */
    Integer searchCount(@Param("page")Page page);
    /**
     * ����cvid
     * @param cvid
     * @param id
     * @return
     */
    int updateCvid(@Param("cvid")Long cvid,@Param("id")Long id);

    /**
     * ���ж���ѧ��Ϊ����־Ը
     * @return
     */
    int isselect();
}
