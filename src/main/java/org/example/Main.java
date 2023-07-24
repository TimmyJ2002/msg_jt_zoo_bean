package org.example;


import org.springframework.context.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@ComponentScan("org.example")
@Configuration
public class Main {

    private static AnnotationConfigApplicationContext applicationContext;


    //PostConstruct PreDestroy
    @PostConstruct
    protected void init(){
        System.out.println("Wash hands before work");
    }

    @PreDestroy
    protected void cleanup(){
        System.out.println("Check if all cages are closed");
        System.out.println("Who let the dogs out?");
    }

    public static void main(String[] args) {
        //applicationContext = new ClassPathXmlApplicationContext("aplicationContext.xml");
        applicationContext = new AnnotationConfigApplicationContext(Main.class);

        Zooworker theZookeeper = applicationContext.getBean("theZookeeper", Zooworker.class);

        System.out.println(theZookeeper.cleanup("monkey.cage"));

        System.out.println("\n");
        /*Monkey kingKong = new Monkey(new Zookeeper());
        kingKong.feed("Shaorma");*/

        Monkey gorilla =new Monkey(new Feeder());
        gorilla.feed("Banana");

        System.out.println(theZookeeper.getFood(3));
        System.out.println("\n");

        Zooworker theZookeeper2 = applicationContext.getBean("theZookeeper", Zookeeper.class);
        Zooworker theFeeder2 = applicationContext.getBean("Feeder", Feeder.class);
        Zooworker theZookeeper3 = applicationContext.getBean("theZookeeper", Zookeeper.class);

        System.out.println(theZookeeper + " " + theZookeeper3);
        System.out.println(theZookeeper2 + " " + theFeeder2);




    }


}