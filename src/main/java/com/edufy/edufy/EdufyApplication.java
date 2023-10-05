package com.edufy.edufy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class EdufyApplication {
    /**
     * ska album ha one to many med track?? / se album
     * ska music ha one to many med track /se music
     * eller one to one (om track är en singel) /se music
     */
    public static void main(String[] args) {
        SpringApplication.run(EdufyApplication.class, args);
    }

}
