package com.project.spring.annotations.customize;

import com.coremedia.architecture.spring.api.NameService;

import java.util.Date;
import java.util.Random;

public class EnhancedNameService implements NameService {
  private static final String[] givenNames = {
          "Peter", "Daniel", "Andreas", "Moritz", "Dennis", "Mark", "Frank", "Rolf"
  };
  private static final String[] surNames = {
          "Kaul", "Spilker", "Hubold", "Gawecki", "Homann", "Michaelis", "Watermann"
  };
  private Random random = new Random(new Date().getTime());

  public String getGivenName() {
    return givenNames[random.nextInt(givenNames.length)];
  }

  public String getSurName() {
    return surNames[random.nextInt(surNames.length)];
  }
}
