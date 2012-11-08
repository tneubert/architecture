package com.coremedia.architecture.spring.impl;

import com.coremedia.architecture.spring.api.NameService;
import com.coremedia.architecture.spring.api.User;
import com.coremedia.architecture.spring.api.UserService;

import javax.annotation.ManagedBean;
import javax.inject.Inject;

@ManagedBean
public class UserServiceImpl implements UserService {
  @Inject
  private NameService nameService;

  public User findUserById(String id) {
    UserImpl user = new UserImpl();
    user.setId(id);
    user.setSurName(nameService.getSurName() + "-" + id);
    user.setGivenName(nameService.getGivenName() + "-" + id);

    return user;
  }
}
