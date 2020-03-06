package org.lili.shard.rw.service;


import org.lili.common.User;
import org.lili.shard.rw.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> list() {
        // 强制路由主库
        //HintManager.getInstance().setMasterRouteOnly();
        return userRepository.list();
    }

    public Long add(User user) {
        return userRepository.addUser(user);
    }

}
