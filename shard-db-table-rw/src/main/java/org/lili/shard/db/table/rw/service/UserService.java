package org.lili.shard.db.table.rw.service;

import org.lili.common.User;

import java.util.List;

public interface UserService {

    List<User> list();

    Long add(User user);

    User findById(Long id);

    User findByName(String name);

}
