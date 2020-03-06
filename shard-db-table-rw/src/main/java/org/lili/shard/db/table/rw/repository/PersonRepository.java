package org.lili.shard.db.table.rw.repository;

import org.apache.ibatis.annotations.Mapper;
import org.lili.common.Person;

import java.util.List;


@Mapper
public interface PersonRepository {

    Long addPerson(Person louDong);

    List<Person> list();
}
