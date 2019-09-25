package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;

@ComponentScan(basePackages = "com.stackroute")
public class Main {

    public static void main(String[] args) {



//        using ApplicationContext
        System.out.println("Using ApplicationContext");
        ApplicationContext context=new AnnotationConfigApplicationContext(javaconfig.class);
        Movie movie=context.getBean("movie1",Movie.class);
        movie.getdetails();
//        Movie movie1=context.getBean("movie",Movie.class);
//        movie1.getdetails();
//        Movie movie2=context.getBean("movie2",Movie.class);
//        movie2.getdetails();
//        Movie movie3=context.getBean("movie3",Movie.class);
//        movie3.getdetails();
//        System.out.println(movie1==movie3);


    }
}
