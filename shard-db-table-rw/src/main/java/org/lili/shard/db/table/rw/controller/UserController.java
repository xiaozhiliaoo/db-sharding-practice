package org.lili.shard.db.table.rw.controller;

import org.lili.common.User;
import org.lili.shard.db.table.rw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public Object list() {
        List<User> list = userService.list();
        System.out.println(list);
        return list;
    }

    @GetMapping("/add")
    public Object add() {
        for (long i = 0; i < 100; i++) {
            User user = new User();
            user.setCity("西安" + i);
            user.setName("lili" + i);
            userService.add(user);
        }
        return "success";
    }

    @GetMapping("/users/{id}")
    public Object get(@PathVariable Long id) {
        return userService.findById(id);
    }

    @GetMapping("/users/query")
    public Object get(String name) {
        User byName = userService.findByName(name);
        System.out.println(byName);
        return byName;
    }

}
