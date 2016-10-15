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
     * ע�⣺�������ֻ��һ�����Բ���param��������������param
     * �г�ѧ��
     * @return id
     */
    List<Student> list(@Param("page")Page page);
    /**
     * ѧ������
     */
    int listCount();

    /**
     * ���ѧ��������������
     * @param student
     * @return
     */
    Long addStudent(@Param("student")Student student);

    /**
     * ɾ��ѧ��
     * @param studentid
     */
    Integer deleteStudent(@Param("studentid")Long studentid);

    /**
     * ͨ������ȷ�������½
     * @param name
     * @return
     */
    Student login(@Param("name")String name);

    /**
     * ��һ�ε�½ʱ��������
     * @param student
     */
    Integer updatePassword(@Param("student")Student student);

    /**
     * �����û������Ļ�����Ϣ
     * @param student
     */
    Integer updateInformation(@Param("student")Student student);

    /**
     * ͨ��id��ȡ����������Ϣ
     * @param id
     * @return
     */
    Student selectById(@Param("id")Long id);

    /**
     * ���һ��ѧ��ѡ����ʦ��־Ը
     * @param stuTea
     */
    void selectTeacher(@Param("stuTea")StuTea stuTea);

    /**
     * ��������ģ����ѯ
     * @param page
     * @return
     */
    List<Student> search(@Param("page") Page page);

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
     * �г�ѧ������ѡ�����ʦ�б�
     * @param studentid
     * @return
     */
    List<Student> selectTeas(@Param("studentid")Long studentid,@Param("page") Page page);

    int teasCount(@Param("studentid")Long studentid,@Param("page") Page page);

    /**
     * ��ȡѧ��ѡ��ʦ������
     * @param studentid
     * @return
     */
    Integer getMax(@Param("studentid")Long studentid);

    /**
     * ��ѡ��ʦ�б�
     * @param studentid
     * @return
     */
    List<Object> teachers(@Param("studentid")Long studentid,@Param("page")Page page);

    int teacherCount(@Param("studentid")Long studentid);

    /**
     * ��ʦ����
     * @param studentid
     * @param teacherid
     * @return
     */
    int up(@Param("studentid")Long studentid,@Param("teacherid") Long teacherid);

    /**
     * ��ʦ����
     * @param studentid
     * @param listnumber
     * @return
     */
    int down(@Param("studentid")Long studentid,@Param("listnumber") int listnumber);

    /**
     * ��ɾ���ĵ�ʦ���������
     * @param studentid
     * @param listnumber
     * @return
     */
    int updateTea(@Param("studentid")Long studentid,@Param("listnumber") int listnumber);

    /**
     * ɾ����ʦ
     * @param studentid
     * @param listnumber
     * @return
     */
    int deleteTea(@Param("studentid")Long studentid,@Param("listnumber") int listnumber);

    /**
     * ѧ���Ƿ��Ѿ�ȷ����ѡ��
     * @param id
     * @return
     */
    Boolean isselect(@Param("id")Long id);

    /**
     * ѧ��ȷ����������
     * @param id
     */
    void updateIsselect(@Param("id")Long id);
}
