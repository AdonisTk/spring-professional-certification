package io.berkel.requestparam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * http://localhost:8080/requestparam/articles/get?id=20
 */
@Controller
@RequestMapping("/articles")
public class ArticleController {

    @RequestMapping("/get")
    public String get(@RequestParam("id") int id) {
        return "get";
    }

}
