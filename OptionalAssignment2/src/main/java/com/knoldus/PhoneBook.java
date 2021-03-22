package com.knoldus;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * Phonebook class.
 */
public class PhoneBook {
  /**
   * Map.
   */
  private Map<String, String> map = new HashMap<String, String>() { {
      //adding values to the map
      put("deepak sarthi", "9654160268");
      put("anjana sarthi", "8375042352");
    } };
  // method through which we can access map in PhoneBookCrawler class

  /**
   * to return map.
   *
   * @return map map value
   *
   */
  public Map<String, String> getMap() {
    return map;
  }
  /* Exercise 1- Implement findPhoneByName in
  PhoneBook class that returns an optional.
   */

  /**
   * find phone number using name.
   *
   * @param name string type
   *
   *
   * @return optional value
   */
  Optional<String> findPhoneByName(final String name) {
    try {
      if (map.containsKey(name)) {

        return Optional.of(map.get(name));
      }
    } catch (Exception e) {
      System.out.println("exception " + e);
    }
    return Optional.empty();
  }

  /**
   * find the name using phone number.
   *
   * @param phoneNumber string value
   *
   * @return optional type
   */
  Optional<String> findNameByPhoneNumber(final String phoneNumber) {
    try {
      for (Map.Entry<String, String> phonebook : map.entrySet()) {
        if (phonebook.getValue().equals(phoneNumber)) {
          return Optional.of(phonebook.getKey());
        }
      }
    } catch (Exception e) {
      System.out.println("exception " + e);
    }
    return Optional.empty();
  }

  /**
   * override tostring.
   *
   * @return map data
   *
   */

  @Override
    public String toString() {
    System.out.println("Hello from PhoneBook's toString method");
    return "PhoneBook = " + map;
  }


}
