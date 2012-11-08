package com.project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class MenuController {
  @RequestMapping(value = "/menu", method = GET)
  public ModelAndView displayMenu() {
    return new ModelAndView("menu");
  }
}
