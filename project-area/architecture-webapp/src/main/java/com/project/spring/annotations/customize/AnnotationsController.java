package com.project.spring.annotations.customize;

import com.coremedia.architecture.spring.api.NameService;
import com.coremedia.architecture.spring.api.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.inject.Inject;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class AnnotationsController {
  @Inject
  private UserService userService;

  @Inject
  private NameService nameService;

  @RequestMapping(value = "/customizeAnnotations", method = GET)
  public ModelAndView displayMenu() {
    return new ModelAndView("customizeAnnotations");
  }

  @RequestMapping(value = "/replaceBean", method = GET)
  public @ResponseBody String replaceBean() {
    return userService.findUserById("0815").getSurName();
  }
}
