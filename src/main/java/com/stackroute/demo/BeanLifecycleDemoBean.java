package com.stackroute.demo;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("some destruction work");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("some initialization work");
    }

    //    Custom methods
    @PostConstruct
    public void customInit(){
        System.out.println("calling Init method");
    }
    @PreDestroy
    public void customDestroy(){
        System.out.println("calling Destroy Method");
    }
}