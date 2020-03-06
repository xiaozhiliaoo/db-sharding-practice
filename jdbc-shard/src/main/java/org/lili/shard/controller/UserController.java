package org.lili.shard.controller;

import org.lili.shard.bean.User;
import org.lili.shard.bean.UserExample;
import org.lili.shard.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/findOne/{id}")
    public User findOne(@PathVariable("id") Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @RequestMapping("/list")
    public List<User> list() {
        return userMapper.selectByExample(new UserExample());
    }

    @RequestMapping("/save")
    public long save(User user) {
        System.out.println(user.toString());
        userMapper.insertSelective(user);
        return user.getId();
    }
}
