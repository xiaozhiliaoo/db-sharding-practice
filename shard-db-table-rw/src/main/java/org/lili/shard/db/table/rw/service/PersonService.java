package org.lili.shard.db.table.rw.service;


import org.lili.common.Person;

import java.util.List;

public interface PersonService {

    List<Person> list();

    Long addPerson(Person louDong);

}
