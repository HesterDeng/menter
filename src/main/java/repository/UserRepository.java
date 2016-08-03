package repository;

import dto.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * Created by xheart on 2016/8/2.
 */
@Repository
public interface UserRepository {
    /**
     * 保存用户
     * @param user 用户
     * @return id
     */
    void save(@Param("user") User user);
}
