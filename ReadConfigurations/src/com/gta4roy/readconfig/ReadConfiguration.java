package com.gta4roy.readconfig;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfiguration {

    Properties properHandler = new Properties();
    public  static  final String SERVER_PORT = "SERVER_PORT";
    public  static  final String THREAD_POOL_COUNT = "THREAD_POOL_COUNT";
    public  static  final String ROOT_DIR = "ROOT_DIR";
    public ReadConfiguration(String propertyFilePath){

        FileInputStream propertyFileStream = null;
        try{
            propertyFileStream = new FileInputStream(propertyFilePath);
            properHandler.load(propertyFileStream);
            propertyFileStream.close();
        }catch (FileNotFoundException ex){
            ex.printStackTrace();
        }catch (IOException ex){
            ex.printStackTrace();
        }finally {
            if(propertyFileStream != null){
                try {
                    propertyFileStream.close();
                }catch (IOException ex){
                    ex.printStackTrace();
                }
            }
        }
    }
    String getValue(String key,String defaultValue){
        String value = properHandler.getProperty(key,defaultValue);
        return  value.trim();
    }
}
