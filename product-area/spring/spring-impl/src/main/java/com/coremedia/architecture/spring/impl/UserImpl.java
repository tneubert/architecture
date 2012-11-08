package com.coremedia.architecture.spring.impl;


import com.coremedia.architecture.spring.api.User;

public class UserImpl implements User {
  private String id;
  private String givenName;
  private String surName;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public String getSurName() {
    return surName;
  }

  public void setSurName(String surName) {
    this.surName = surName;
  }
}
