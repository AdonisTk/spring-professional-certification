package io.berkel.pathvariable.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

   @GetMapping("/request/{firstName}/{lastName}")
   @ResponseBody
   public String handler(@PathVariable(name="firstName") String firstName, @PathVariable(name="lastName") String lastName) {

      return "URL parameters:  <br>"  + " firstName = " + firstName + " <br>" + " lastName = " + lastName;

   }

}
