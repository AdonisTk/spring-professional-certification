package io.berkel.crud.service;

import io.berkel.crud.dao.PersonDAO;
import io.berkel.crud.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDAO personDAO;

    @Override
    @Transactional
    public void addPerson(Person p) {
        personDAO.addPerson(p);
    }

    @Override
    @Transactional
    public void updatePerson(Person p) {
        personDAO.updatePerson(p);
    }

    @Override
    @Transactional
    public List<Person> listPersons() {
        return personDAO.listPersons();
    }

    @Override
    @Transactional
    public Person getPersonById(int id) {
        return personDAO.getPersonById(id);
    }

    @Override
    @Transactional
    public void removePerson(int id) {
        personDAO.removePerson(id);
    }

}
