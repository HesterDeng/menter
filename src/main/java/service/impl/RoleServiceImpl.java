package service.impl;

import org.springframework.stereotype.Service;
import repository.RoleRepository;
import service.RoleService;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * Created by xheart on 2016/8/14.
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private RoleRepository roleRepository;

    @Override
    public HashMap<String, Object> list(int pageNumber, int pageSize) {
        HashMap<String,Object> page = new HashMap<String, Object>();
        page.put("total",roleRepository.listCount());
        page.put("rows",roleRepository.list(pageNumber,pageSize));
        return page;
    }
}
