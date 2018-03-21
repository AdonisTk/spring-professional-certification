package io.berkel.responsebody.controller;

import io.berkel.responsebody.model.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MyController {

    @RequestMapping(value = "/persons", method = RequestMethod.GET)
    @ResponseBody
    public List<Person> getPersons(@ModelAttribute("person") Person person) {

        Person person1 = new Person();
        person1.setName("Fabio");
        person1.setSurname("Gutierrez");

        Person person2 = new Person();
        person2.setName("Omar");
        person2.setSurname("Galtieri");

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);

        return personList;

    }

}
