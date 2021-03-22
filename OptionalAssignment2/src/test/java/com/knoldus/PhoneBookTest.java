package com.knoldus;

import org.junit.Assert;
import org.junit.rules.ExpectedException;

import java.util.NoSuchElementException;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {
 PhoneBook phoneBookObject = new PhoneBook();


    @org.junit.jupiter.api.Test
    void findPhoneByName() {
String name ="anjana sarthi";
        Optional<String> phoneNum = phoneBookObject.findPhoneByName(name);
assert(phoneNum.get().equals("8375042352"));
    }

    @org.junit.jupiter.api.Test
    void findNameByPhoneNumber() {
String number ="9654160268";
Optional<String> name = phoneBookObject.findNameByPhoneNumber(number);
assert (name.get().equals("deepak sarthi"));
    }



}
