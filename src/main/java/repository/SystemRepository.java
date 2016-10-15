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
     * 更新老师选择的数量
     * @param teacherNumber
     */
    int updateTeacher(@Param("teacherNumber")int teacherNumber);

    /**
     * 更新学生选择的最大数量
     * @param studentNumber
     */
    int updateStudent(@Param("studentNumber")int studentNumber);

    /**
     * 添加一个人的打分分数
     * @param mark
     */
    int addMark(@Param("mark")int mark,@Param("advice")String advice);

    /**
     * 返回老师最大选择数量
     * @return
     */
    int teacherNumber();

    /**
     * 返回学生最大选择数量
     * @return
     */
    int studentNumber();

    /**
     * 获取满意度统计
     * @return
     */
    System getMark();
}
