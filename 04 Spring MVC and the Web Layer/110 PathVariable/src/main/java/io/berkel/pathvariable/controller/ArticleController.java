package io.berkel.pathvariable.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * http://localhost:8080/pathvariable/articles/get/20
 */
@Controller
@RequestMapping("/articles")
public class ArticleController {

    @RequestMapping("/get/{id}")
    public String get(@PathVariable("id") int id) {
        return "get";
    }

}
