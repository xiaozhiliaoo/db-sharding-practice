package org.lili.shard.rw.service;


import org.lili.common.User;

import java.util.List;

public interface UserService {

    List<User> list();

    Long add(User user);

}
