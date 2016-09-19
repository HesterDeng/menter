package service;

import java.util.HashMap;

/**
 * Created by xheart on 2016/8/14.
 */
public interface RoleService {
    /**
     * 列出角色
     * @return 角色列表
     */
    HashMap<String, Object> list(int pageNumber, int pageSize);
}
