package cn.test.helloworld.controller;


import cn.test.helloworld.entity.Person;
import cn.test.helloworld.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/getPerson")
    @ResponseBody
    public List<Person> getPerson() {
        return personService.getPerson();
    }
    @RequestMapping(value = "/getPersonById")
    @ResponseBody
    public Person getPersonById(String id) {
        return personService.getPersonById(id);
    }
    @RequestMapping(value = "/getPersonById")
    public void addPerson(Person person) {
        personService.addPerson(person);
    }
    @RequestMapping(value = "/updatePerson")
    public void updatePerson(Person person) {
        personService.updatePerson(person);
    }
    @RequestMapping(value = "/getPersonById")
    public void deletePersonById(String id) {
        personService.deletePersonById(id);
    }
}
