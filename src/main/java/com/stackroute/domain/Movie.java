package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {


    Actor actor;

    @Autowired
    public Movie(Actor actor) {
        this.actor=actor;
    }



    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public void getdetails() {
        System.out.println(
                " actorName= " + actor.getName() +" age= "+actor.getAge()+" gender= "+actor.getGender());
    }

    @Override
    public String toString() {
        return "actor=" + actor.getName() + " age: "+actor.getAge() +" gender: "+actor.getGender();
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {

        System.out.println("Beanfactory: "+beanFactory);
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("BeanName: "+s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

        System.out.println("ApplicationContext: "+applicationContext);
    }
}
