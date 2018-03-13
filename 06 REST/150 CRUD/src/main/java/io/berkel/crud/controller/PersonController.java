package io.berkel.crud.controller;

import io.berkel.crud.model.Person;
import io.berkel.crud.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/persons", method = RequestMethod.GET)
    public String listPersons(Model model) {

        model.addAttribute("person", new Person());
        model.addAttribute("listPersons", personService.listPersons());
        return "person";

    }

    @RequestMapping(value = "/person/add", method = RequestMethod.POST)
    public String addPerson(@ModelAttribute("person") Person p) {

        if (p.getId() == 0) {
            personService.addPerson(p);
        } else {
            personService.updatePerson(p);
        }
        return "redirect:/persons";

    }

    @RequestMapping("/remove/{id}")
    public String removePerson(@PathVariable("id") int id) {

        personService.removePerson(id);
        return "redirect:/persons";

    }

    @RequestMapping("/edit/{id}")
    public String editPerson(@PathVariable("id") int id, Model model) {

        model.addAttribute("person", personService.getPersonById(id));
        model.addAttribute("listPersons", personService.listPersons());
        return "person";

    }

}
