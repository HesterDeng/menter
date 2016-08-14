package service.impl;

import dto.Role;
import org.springframework.stereotype.Service;
import repository.RoleRepository;
import service.RoleService;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by xheart on 2016/8/14.
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleRepository roleRepository;

    @Override
    public List<Role> list(int pageindex, int number) {
        return roleRepository.list(pageindex,number);
    }
}
