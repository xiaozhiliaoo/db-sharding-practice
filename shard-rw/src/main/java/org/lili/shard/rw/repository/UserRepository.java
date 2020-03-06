package org.lili.shard.rw.repository;

import org.apache.ibatis.annotations.Mapper;
import org.lili.common.User;

import java.util.List;

@Mapper
public interface UserRepository {

    Long addUser(User user);

    List<User> list();

}
