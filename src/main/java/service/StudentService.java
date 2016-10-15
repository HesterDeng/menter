package service;

import dto.Page;
import dto.StuTea;
import dto.Student;

import java.util.HashMap;

/**
 * Created by Esther on 2016/8/20.
 */
public interface StudentService {
    /**
     * �г�ѧ��
     * @return ѧ���б�
     */
    HashMap<String, Object> list(Page page);

    /**
     * ���ѧ��
     * @param name
     * @param password
     * @return
     */
    Long addStudent(String name,String password);

    /**
     * ɾ��ѧ��
     * @param studentid
     * @return
     */
    Boolean deleteStudent(Long studentid);

    /**
     * ��½
     * @param student
     * @return
     */
    Student login(Student student);

    /**
     * ��������
     * @param student
     * @return
     */
    Boolean updatePassword(Student student);

    /**
     * ����ѧ��������Ϣ
     * @param student
     */
    Boolean updateInformation(Student student);

    /**
     * ͨ��id����ѧ��������Ϣ
     * @param id
     * @return
     */
    Student selectById(Long id);

    /**
     * ���һ��ѧ����־Ը
     * @param stuTea
     */
    Boolean selectTeacher(StuTea stuTea);

    /**
     * �г�ѧ��ѡ��ĵ�ʦ�б�
     * @param studentid
     * @param page
     * @return
     */
    HashMap<String, Object> teachers(Long studentid,Page page);

    /**
     * ��ʦ����
     * @param studentid
     * @param listnumber
     */
    void upTeacher(Long studentid,int listnumber,Long teacherid);

    /**
     * ɾ����ʦ
     * @param studentid
     * @param listnumber
     */
    void deleteTea(Long studentid,int listnumber);

    /**
     * ���cvid
     * @param cvid
     * @param id
     * @return
     */
    int updateCvid(Long cvid,Long id);

    HashMap<String, Object> selectTeas(Long studentid,Page page);

    /**
     * ѧ��ѡ�����
     * @param id
     * @return
     */
    Boolean isselect(Long id);

    /**
     * ����isselect
     * @param id
     */
    void updateIsselect(Long id);
}
