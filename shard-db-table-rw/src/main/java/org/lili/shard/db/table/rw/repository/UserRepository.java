package org.lili.shard.db.table.rw.repository;

import org.apache.ibatis.annotations.Mapper;
import org.lili.common.User;

import java.util.List;


@Mapper
public interface UserRepository {

    Long addUser(User user);

    List<User> list();

    User findById(Long id);

    User findByName(String name);
}
