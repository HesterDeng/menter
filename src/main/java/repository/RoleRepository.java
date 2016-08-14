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
    List<Role> list(@Param("pageindex") int pageindex, @Param("number") int number);
}
