package repository;

import dto.Role;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by xheart on 2016/8/14.
 */
@Repository
public interface RoleRepository {
    /**
     * 注意：如果参数只有一个可以不用param，如果多个必须用param
     * 列出角色
     * @return id
     */
    List<Role> list(@Param("pageNumber") int pageNumber, @Param("pageSize") int pageSize);
    /**
     * 角色总数
     */
    int listCount();

    /**
     * 通过roleid获得角色power
     * @param roleid
     * @return
     */
    int getPower(@Param("roleid")Long roleid);

    /**
     * 添加角色，返回id
     * @param role
     * @return
     */
    Long addRole(@Param("role")Role role);

    /**
     * 更新角色
     * @param role
     */
    void updateRole(@Param("role")Role role);

    /**
     * 删除角色
     * @param roleid
     */
    void deleteRole(@Param("roleid")Long roleid);
}
