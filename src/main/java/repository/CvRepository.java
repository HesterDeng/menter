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
     * 添加一个简历
     * @param cv
     * @return
     */
    Long addCv(@Param("cv")Cv cv);

    /**
     * 通过id查看简历
     * @param cvid
     * @return
     */
    Cv selectCv(@Param("cvid")Long cvid);

    /**
     * 更新cv
     * @param cv
     */
    int updateCv(@Param("cv")Cv cv);
}
