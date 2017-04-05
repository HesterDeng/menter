package repository;

import dto.Cv;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by Esther on 2016/8/28.
 */
@Repository
public interface CvRepository {

    /**
     * ���һ������
     * @param cv
     * @return
     */
    Long addCv(@Param("cv")Cv cv);

    /**
     * ͨ��id�鿴����
     * @param cvid
     * @return
     */
    Cv selectCv(@Param("cvid")Long cvid);

    /**
     * ����cv
     * @param cv
     */
    int updateCv(@Param("cv")Cv cv);
}
