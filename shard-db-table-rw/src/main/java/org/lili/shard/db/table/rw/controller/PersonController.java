package org.lili.shard.db.table.rw.controller;

import org.lili.common.Person;
import org.lili.shard.db.table.rw.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/lds")
    public Object list() {
        return personService.list();
    }

    @GetMapping("/ld/add")
    public Object add() {
        for (long i = 0; i < 10; i++) {
            Person person = new Person();
            person.setId(i + "a");
            person.setCity("深圳");
            person.setRegion("宝安");
            person.setName("李四");
            person.setLdNum("A");
            person.setUnitNum("2");
            personService.addPerson(person);
        }
        return "success";
    }

}
