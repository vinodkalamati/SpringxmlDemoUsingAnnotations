package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = "com.stackroute")
public class Main {

    public static void main(String[] args) {



//        using ApplicationContext
        System.out.println("Using ApplicationContext");
        ApplicationContext context=new AnnotationConfigApplicationContext(Main.class);
        Movie movie=context.getBean(Movie.class);
        movie.getdetails();


    }
}
