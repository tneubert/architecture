package com.coremedia.architecture.spring.impl;

import com.coremedia.architecture.spring.api.NameService;

import javax.inject.Named;

@Named("nameService")
public class NameServiceImpl implements NameService {
  public String getGivenName() {
    return "Always-the-same";
  }

  public String getSurName() {
    return "Always-the-same";
  }
}
