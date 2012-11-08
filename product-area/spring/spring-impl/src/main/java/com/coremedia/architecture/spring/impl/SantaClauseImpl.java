package com.coremedia.architecture.spring.impl;

import com.coremedia.architecture.spring.api.SantaClause;

import javax.annotation.Resource;
import javax.inject.Named;
import java.util.List;

@Named("santaClause")
public class SantaClauseImpl implements SantaClause {
  @Resource(name="wishList")
  private List<String> wishes;

  public List<String> getWishesOf(String userId) {
    return wishes;
  }
}
