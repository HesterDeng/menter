package repository;

import dto.*;
import dto.System;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Esther on 2016/8/28.
 */
@Repository
public interface SystemRepository {
    /**
     * ������ʦѡ�������
     * @param teacherNumber
     */
    int updateTeacher(@Param("teacherNumber")int teacherNumber);

    /**
     * ����ѧ��ѡ����������
     * @param studentNumber
     */
    int updateStudent(@Param("studentNumber")int studentNumber);

    /**
     * ���һ���˵Ĵ�ַ���
     * @param mark
     */
    int addMark(@Param("mark")int mark);

    /**
     * ������ʦ���ѡ������
     * @return
     */
    int teacherNumber();

    /**
     * ����ѧ�����ѡ������
     * @return
     */
    int studentNumber();

    /**
     * ��ȡ�����ͳ��
     * @return
     */
    System getMark();
}
