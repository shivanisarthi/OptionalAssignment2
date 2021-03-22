package com.knoldus;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookCrawlerTest {
  PhoneBookCrawler crawler = new PhoneBookCrawler();

  String name ="anjana sarthi";
  String number ="9654160268";
    @Test
    void findPhoneNoByNameAndPunishIfNothingFound() {
String num = crawler.findPhoneNoByNameAndPunishIfNothingFound(name);
assert (num.equals("8375042352"));
    }

    @Test
    void findPhoneByNameAndPrintPhoneBookIfNothingFound() {
        String num = crawler.findPhoneByNameAndPrintPhoneBookIfNothingFound(name);
        assert (num.equals("8375042352"));
    }

    @Test
    void findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingToStringMethod() {
        String num = crawler.findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingToStringMethod(name);

        Assert.assertEquals(num,"8375042352");
    }

    @Test
    void findPhoneNumberByNameUsingStream() {
        String num= crawler.findPhoneNumberByNameUsingStream(name);
    Assert.assertEquals(num,"8375042352");
    }


    @Test
    void findPhoneByNameAndPrintPhoneBookIfNothingFoundUsingStreams() {
        String num = crawler.findPhoneNumberByNameUsingStream(name);
        Assert.assertEquals(num,"8375042352");
    }
    @Test
    void findPhoneNumberByNameOrNameByPhoneNumber(){
        String num = crawler.findPhoneNumberByNameOrNameByPhoneNumber(name,number);
        Assert.assertEquals(num,"8375042352");
    }
    @Test
    void findPhoneNumberByNameOrNameByPhoneNumber2(){
        name ="shiv";
        String nameBy = crawler.findPhoneNumberByNameOrNameByPhoneNumber(name,number);
        Assert.assertEquals(nameBy,"deepak sarthi");
    }
}
