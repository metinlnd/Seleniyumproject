package com.cydeo.tests.day9_JavaFaker_testbase_driverUtil;

public class Singleton {
    //1.create private constructor
  private Singleton(){}


    //2. create private static String
    //prevent access and provide a getter method.
    private static String word;


   // this utility method will return the word in the way we want to return.
    public static String getWord(){
        if(word==null){

            System.out.println("fist time call.word object is null" + "Assigning value to it  now.");

            word="something";
        } else {
            System.out.println("word already has a value");
        }
        return word;
    }











}
