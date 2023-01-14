package com.cydeo.tests;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperites  {
    @Test

    public void reading_from_propeties() throws IOException {
        // 1- Create the object of Properties

        Properties properties= new Properties();

        //2- We need to open the file in java memory:       FileInputStream

        FileInputStream file= new FileInputStream("configuration.propeties");

        //3 load the propeties object using FILEiNPUTStream object
        properties.load(file);

        // uSE "propeties"object to read value

        System.out.println( properties.getProperty("browser"));;
        System.out.println(properties.getProperty("env") );

    }
}
