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
     * �г���ʦ
     * @return ��ʦ�б�
     */
    HashMap<String, Object> list(Page page);

    /**
     * ��ӵ�ʦ
     * @param name
     * @param password
     * @return
     */
    Long addTeacher(String name,String password);

    /**
     * ɾ����ʦ
     * @param teacherid
     * @return
     */
    Boolean deleteTeacher(Long teacherid);

    /**
     * ��½
     * @param teacher
     * @return
     */
    Teacher login(Teacher teacher);

    /**
     * ��������
     * @param teacher
     * @return
     */
    Boolean updatePassword(Teacher teacher);

    /**
     * ������ʦ������Ϣ
     * @param teacher
     */
    Boolean updateInformation(Teacher teacher);

    /**
     * ͨ��id������ʦ������Ϣ
     * @param id
     * @return
     */
    Teacher selectById(Long id);

    /**
     * �г���ʦ����ѡ���ѧ��
     * @param teacherid
     * @return
     */
    HashMap<String, Object> listStudent(Long teacherid,Page page);

    /**
     * ��ʦ�ܾ�ѧ��
     * @param studentid
     * @return
     */
    Boolean nextTeacher(Long studentid);

    /**
     * ѡ��һ��ѧ��
     * @param studentid
     * @param teacherid
     * @return
     */
    Integer selectStu(Long studentid,Long teacherid);

    /**
     * ������ʦѡ��ѧ�����б�
     * @param teacherid
     * @return
     */
    HashMap<String, Object> selectStudents(Long teacherid,Page page);

    /**
     * �����ɾ����ѧ��
     * @param studentid
     * @param teacherid
     * @return
     */
    Boolean deleteStudent(Long studentid,Long teacherid);
    /**
     * ���cvid
     * @param cvid
     * @param id
     * @return
     */
    int updateCvid(Long cvid,Long id);
}
