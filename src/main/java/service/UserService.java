package service;

import dto.User;

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
     * 登录，确认用户名和密码的正确性，返回
     * @param user
     * @return
     */
    User login(User user);
}
