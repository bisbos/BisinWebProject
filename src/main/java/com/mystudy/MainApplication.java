package com.mystudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Created by bbose on 7/22/16.
 */

@SpringBootApplication
@EnableConfigurationProperties
public class MainApplication {

    public static void main(String[] args){
        SpringApplication.run(MainApplication.class,args);
    }
}
