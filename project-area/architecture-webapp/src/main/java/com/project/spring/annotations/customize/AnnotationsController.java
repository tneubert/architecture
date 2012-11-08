package com.project.spring.annotations.customize;

import com.coremedia.architecture.spring.api.NameService;
import com.coremedia.architecture.spring.api.SantaClause;
import com.coremedia.architecture.spring.api.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;

import java.util.Collections;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class AnnotationsController {
  @Inject
  private UserService userService;

  @Inject
  private NameService nameService;

  @Inject
  private SantaClause santaClause;

  @RequestMapping(value = "/customizeAnnotations", method = GET)
  public ModelAndView displayMenu() {
    return new ModelAndView("customizeAnnotations");
  }

  @RequestMapping(value = "/replaceBean", method = GET)
  public @ResponseBody String replaceBean() {
    return userService.findUserById("0815").getSurName();
  }

  @RequestMapping(value = "/appendValues", method = GET, produces = "application/json")
  public @ResponseBody List<String> getWhishes() {
    List<String> wishes = santaClause.getWishesOf("0815");
    return wishes != null ? wishes : Collections.<String>emptyList();
  }
}
