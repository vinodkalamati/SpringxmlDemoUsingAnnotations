package com.stackroute;

import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan("com.stackroute")
@Scope("prototype")

public class javaconfig {

    @Bean
    public Actor actor1(){
        return new Actor("Mahesh","Male",34);
    }

    @Bean
    public Actor actor(){
        return new Actor("Charan","Male",26);
    }

//    @Bean
//    public Actor actor2(){
//        return new Actor("Samantha","female",34);
//    }
//
//    @Bean
//    public Actor actor3(){
//        return new Actor("Charan","Male",26);
//    }

    @Bean
    public Movie movie3(){
        return new Movie(actor1());
    }

    @Bean
    public Movie movie(){
        return new Movie(actor());
    }
//    @Bean
//    public Movie movie1(){
//        return new Movie(actor1());
//    }
//
//    @Bean
//    public Movie movie2(){
//        return new Movie(actor2());
//    }
}

