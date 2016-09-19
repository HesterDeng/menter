package repository;

import dto.Page;
import dto.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

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
    Long save(@Param("user") User user);

    /**
     * 更新用户
     * @param user
     */
    void updateUser(@Param("user")User user);

    /**
     * 删除用户
     * @param userid
     */
    void deleteUser(@Param("userid")Long userid);

    /**
     * 登录，通过用户名查找密码
     * @param username
     * @return
     */
    User selectUserByName(@Param("username")String username);

    /**
     * 注意：如果参数只有一个可以不用param，如果多个必须用param
     * 列出用户
     * @return id
     */
    List<User> list(@Param("page")Page page);
    /**
     * 用户总数
     */
    int listCount();

    /**
     * 根据姓名模糊查询
     * @param page
     * @return
     */
    List<User> search(@Param("page")Page page);

    /**
     * 模糊查询的结果总数
     * @param page
     * @return
     */
    Integer searchCount(@Param("page")Page page);
}
