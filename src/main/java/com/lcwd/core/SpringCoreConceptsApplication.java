package com.lcwd.core;

import com.lcwd.core.couple.*;
import com.lcwd.core.scope.Pepsi;
import com.lcwd.core.scope.Soda;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;
import test.Test;

@SpringBootApplication
//@ComponentScan(basePackages ={"",""})
@ComponentScan(basePackages = {"com.lcwd.core", "test"})
public class SpringCoreConceptsApplication {

    public static void main(String[] args) {

        //about the beans
        //@Component
        //about the dependencies
        //@Autowired
        //where to scan for beans
        //com.lcwd.core.couple
        //@ComponentScan()

//        Animal animal = new Cat();
//        Person p = new Person(animal);
//        p.playWithAnimal();


        ConfigurableApplicationContext context = SpringApplication.run(SpringCoreConceptsApplication.class, args);

//        Person personBean = context.getBean(Person.class);
//        personBean.playWithAnimal();
//        System.out.println(personBean);
//
//        Test testBean = context.getBean(Test.class);
//        testBean.testing();
//        Animal cat = context.getBean("cat", Animal.class);
//        Animal dog = context.getBean("dog", Animal.class);
//        cat.play();
//        dog.play();

        //bean scope
        //first request for Pepsi bean
//        Pepsi bean = context.getBean(Pepsi.class);
//
//        System.out.println(bean);

        //bean.drink();

        //second request for Pepsi bean
//        Pepsi bean1 = context.getBean(Pepsi.class);
//        System.out.println(bean1);
//
//        //third request for Pepsi bean
//        Pepsi bean2 = context.getBean(Pepsi.class);
//        System.out.println(bean2);

//        Pepsi pepsi = context.getBean(Pepsi.class);
//        System.out.println(pepsi);
//        Soda soda = pepsi.getSoda();
//        System.out.println(soda);
//
//        Pepsi pepsi1 = context.getBean(Pepsi.class);
//        System.out.println(pepsi1);
//        Soda soda1 = pepsi1.getSoda();
//        System.out.println(soda1);
//
//        Pepsi pepsi2 = context.getBean(Pepsi.class);
//        System.out.println(pepsi2);
//        System.out.println(pepsi2.getSoda());


    }


}
