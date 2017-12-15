package io.berkel.incomingrequest.controller;

import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * http://localhost:8080/incomingrequest/articles/get
 *
 */
@Controller
@RequestMapping("/articles")
public class ArticleController {
	
	@GetMapping("/get")
	public String get(Locale locale, Model model) {
		return "get";
	}
	
}
