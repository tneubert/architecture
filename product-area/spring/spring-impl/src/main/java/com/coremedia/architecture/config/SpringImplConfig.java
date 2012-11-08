package com.coremedia.architecture.config;

import org.springframework.beans.factory.config.ListFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan( basePackages = "com.coremedia.architecture.spring" )
public class SpringImplConfig {
  @Bean(name = "wishList")
  public List<String> initWishList() {
    List<String> wishes = new ArrayList<String>();
    wishes.add("Icecream");

    return wishes;
  }
}
