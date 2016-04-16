package com.sneakerhead.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wanghuiwu on 2016/3/29.
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
public class StartBoot {
    public static void main(String args[]){
        SpringApplication application = new SpringApplication(StartBoot.class);
        application.setWebEnvironment(true);
//        application.setShowBanner(true);

//        Set<Object> set = new HashSet<Object>();
//        application.setSources(set);
        application.run(args);
    }
}
