package service;

import dto.Page;
import dto.Result;
import dto.User;

import java.util.HashMap;
import java.util.List;

/**
 * Created by xheart on 2016/8/3.
 */
public interface UserService {
    /**
     * 保存用户
     * @param user 用户
     * @return id
     */
    Long save(User user);

    /**
     * 更新密码
     * @param user
     * @return
     */
    int updatePassword(User user);

    /**
     * 登录，确认用户名和密码的正确性，返回
     * @param user
     * @return
     */
    User login(User user);

    /**
     * 删除user
     * @param id
     */
    Long delete(Long id);

    /**
     * 更新user
     * @param user
     * @return
     */
    User update(User user);

    /**
     * 列出管理员
     * @return 管理员列表
     */
    HashMap<String, Object> list(Page page);

    /**
     * 被所有导师拒绝的学生的邮箱集
     * @return
     */
    List<String> allReject();

    /**
     * 判断所有学生是否都被选择
     * @return
     */
    int endCount();

    /**
     * 最后的结果
     * @return
     */
    List<Result> endResult();
}
