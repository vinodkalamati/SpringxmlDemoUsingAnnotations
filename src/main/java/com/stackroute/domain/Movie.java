package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {


    Actor actor;

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
}
