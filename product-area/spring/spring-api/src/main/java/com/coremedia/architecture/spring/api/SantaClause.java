package com.coremedia.architecture.spring.api;

import java.util.List;

public interface SantaClause {
  List<String> getWishesOf(String userId);
}
