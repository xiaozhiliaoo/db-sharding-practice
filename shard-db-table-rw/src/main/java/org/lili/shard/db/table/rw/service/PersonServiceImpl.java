package org.lili.shard.db.table.rw.service;

import org.lili.common.Person;
import org.lili.shard.db.table.rw.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> list() {
        return personRepository.list();
    }

    @Override
    public Long addPerson(Person Person) {
        return personRepository.addPerson(Person);
    }

}
