package service;

import dto.Role;

import java.util.List;

/**
 * Created by xheart on 2016/8/14.
 */
public interface RoleService {
    /**
     * 列出角色
     * @return 角色列表
     */
    List<Role> list(int pageindex, int number);
}
