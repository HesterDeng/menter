package service.impl;

import dto.User;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import service.UserService;

import javax.annotation.Resource;

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
        if (user1.getPassword().equals(user.getPassword())){
            return user1;
        }
        return null;
    }
}
