package org.lili.shard.db.table.rw.service;


import org.lili.common.User;
import org.lili.shard.db.table.rw.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> list() {
        return userRepository.list();
    }

    public Long add(User user) {
        return userRepository.addUser(user);
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public User findByName(String name) {
        return userRepository.findByName(name);
    }

}
