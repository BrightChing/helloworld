package cn.test.helloworld.service;

import cn.test.helloworld.dao.PersonDAO;
import cn.test.helloworld.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {
    @Autowired
    private PersonDAO personDAO;

    public List<Person> getPerson() {
        return personDAO.getPerson();
    }

    public Person getPersonById(String id) {
        return personDAO.getPersonById(id);
    }

    public void addPerson(Person person) {
        personDAO.addPerson(person);
    }

    public void updatePerson(Person person) {
        personDAO.updatePerson(person);
    }

    public void deletePersonById(String id) {
        personDAO.deletePersonById(id);
    }
}
