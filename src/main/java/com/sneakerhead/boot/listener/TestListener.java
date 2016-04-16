package com.sneakerhead.boot.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;
import org.springframework.stereotype.Component;

/**
 * Created by wanghuiwu on 2016/4/13.
 */
@Component
public class TestListener implements ApplicationListener {
    private static final Logger LOGGER = LoggerFactory.getLogger(TestListener.class);
    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        if (applicationEvent instanceof ContextRefreshedEvent){
            LOGGER.info("==============================================TYPE:{},TIME:{}","REFRESHED",applicationEvent.getTimestamp());
        }
        if (applicationEvent instanceof ContextStartedEvent){
            LOGGER.info("==============================================TYPE:{},TIME:{}","START",applicationEvent.getTimestamp());
        }
        if (applicationEvent instanceof ContextStoppedEvent){
            LOGGER.info("==============================================TYPE:{},TIME:{}","STOP",applicationEvent.getTimestamp());
        }
        if (applicationEvent instanceof ContextClosedEvent){
            LOGGER.info("==============================================TYPE:{},TIME:{}","CLOSE",applicationEvent.getTimestamp());
        }
    }
}
