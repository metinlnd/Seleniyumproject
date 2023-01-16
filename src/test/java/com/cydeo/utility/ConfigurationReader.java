package com.cydeo.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {


    //1. create the object of properties

    private  static Properties properties= new Properties();

    static {



        try {
            //2- We need to open the file in java memory:       FileInputStream
            FileInputStream file= new FileInputStream("configuration.propeties");

            //3 load the propeties object using FILEiNPUTStream object

            properties.load(file);

            //close the file
            file.close();

        } catch (IOException e) {
            System.out.println("file not found in the configurationreader class");
        e.printStackTrace();
        }


    }




public static String getProperty(String keyword){

        return properties.getProperty(keyword);


}




}
