package service.impl;

import dto.Page;
import dto.User;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import service.UserService;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * Created by xheart on 2016/8/3.
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    public Long save(User user) {
        userRepository.save(user);
        return user.getId();
    }

    @Override
    public User login(User user) {
        User user1 =userRepository.selectUserByName(user.getUsername());
        if (user1 != null&&user1.getPassword().equals(user.getPassword())){
            return user1;
        }
        return null;
    }

    @Override
    public Long delete(Long id) {
        userRepository.deleteUser(id);
        return id;
    }

    @Override
    public User update(User user) {
        userRepository.updateUser(user);
        return user;
    }

    @Override
    public HashMap<String, Object> list(Page page) {
        HashMap<String,Object> pageList = new HashMap<String, Object>();
        if(page.getSearch()==null){
            pageList.put("total",userRepository.listCount());
            pageList.put("rows",userRepository.list(page));
            return pageList;
        }else {
            pageList.put("total",userRepository.searchCount(page));
            pageList.put("rows",userRepository.search(page));
            return pageList;
        }

    }
}
