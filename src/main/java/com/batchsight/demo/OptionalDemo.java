package com.batchsight.demo;

import lombok.Getter;
import lombok.Setter;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Shanghai Batchsight Pharmaceutical Technologies, Inc. Copyright(c) 2016-2019</p>
 *
 * @author Zuo Yefeng
 * @version 1.0
 * <pre>Histroy:
 *       2019/1/17    Zuo Yefeng        Created
 * </pre>
 */

public class OptionalDemo {
  @Getter
  @Setter
  class User {
    private String name;
    private String id;
    private DateTime birthdate;
  }

  @Test
  void testOptional() {
    Optional<User> user = Optional.of(new User());
    user = null;
    String name = "Justin";
    user.orElseThrow(() -> new RuntimeException("User is null")).setName(name);
    System.out.println(user.map(User::getName).orElseThrow(() -> new RuntimeException("Username is null")));
  }

  @Test
  void testTypeCast() {
    try {
      Map<String, Object> map = new HashMap<>();
      map.put("int", 123);
      map.put("string", "456");

      Optional<String> str = Optional.ofNullable(map.get("test")).filter(String.class::isInstance).map(String.class::cast);
      System.out.println(str.orElse("error: null point"));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
