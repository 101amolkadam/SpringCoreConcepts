package com.lcwd.core.couple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("person")
public class Person {

    @Autowired
    Animal animal;
    @Autowired
    Student student;

    @Autowired
    @Qualifier("samosa2")
    Samosa samosa;


    //constructor based injection: mend.
    //@Autowired
//    public Person(Animal animal,Student student) {
//        System.out.println("calling constructor..autowiring");
//        this.animal = animal;
//        this.student=student;
//    }


    //for optional : setter injection
    //using autowired on setter:animal

//  @Autowired

    public void setAnimal(Animal animal) {
        System.out.println("setting animal");
        this.animal = animal;
    }

    public Student getStudent() {
        return student;
    }

    //using autowired on setter : student
//    @Autowired
    public void setStudent(Student student) {
        System.out.println("setting student");
        this.student = student;
    }

    public void playWithAnimal() {
        //using animal
        animal.play();
        student.detail();
        samosa.eat();
    }


}
