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
}
