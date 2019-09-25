package com.stackroute;


import com.stackroute.domain.Movie;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.core.io.ClassPathResource;

@ComponentScan(basePackages = "com.stackroute")
@Scope
public class Main {

    public static void main(String[] args) {



//        using ApplicationContext
        System.out.println("Using ApplicationContext");
        ApplicationContext context=new AnnotationConfigApplicationContext(javaconfig.class);
        Movie movie=context.getBean("movie1",Movie.class);
        movie.getdetails();
        Movie movie1=context.getBean("movie",Movie.class);
        movie1.getdetails();
        Movie MovieA=context.getBean("MovieA",Movie.class);
        MovieA.getdetails();
        Movie MovieB=context.getBean("MovieB",Movie.class);
        MovieB.getdetails();
        Movie movie3=context.getBean("movie3",Movie.class);
        movie3.getdetails();
        System.out.println(MovieA==MovieB); //if its a singleton we will get true



    }
}
