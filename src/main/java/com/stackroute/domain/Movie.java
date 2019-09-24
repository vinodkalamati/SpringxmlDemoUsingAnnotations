package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Movie {

    @Autowired
    Actor actor;

    @Autowired
    public void setActor() {
        actor.setName("Prabhas");
        actor.setAge(46);
        actor.setGender("Male");
    }

    public void getdetails() {
        System.out.println(
                " actorName= " + actor.getName() +" age= "+actor.getAge()+" gender= "+actor.getGender());
    }
}
