package com.cydeo.tests.day9_JavaFaker_testbase_driverUtil;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerPractice {

    @Test
    public void test1(){

        Faker faker= new Faker();
        System.out.println(faker.name().firstName());

        System.out.println(faker.name().lastName());

        System.out.println(faker.howIMetYourMother().catchPhrase());

        System.out.println(faker.numerify("***,###,123?"));

        System.out.println(faker.letterify("????"));

        System.out.println(faker.bothify("##?#/#?*"));
        System.out.println(faker.chuckNorris().fact());

    }










}
