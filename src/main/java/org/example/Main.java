package org.example;


import org.springframework.context.annotation.*;

@ComponentScan("org.example")
@Configuration
public class Main {

    private static AnnotationConfigApplicationContext applicationContext;



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

        Zooworker theZookeeper2 = applicationContext.getBean("theZookeeper", Zookeeper.class);
        Zooworker theFeeder2 = applicationContext.getBean("Feeder", Feeder.class);
        Zooworker theZookeeper3 = applicationContext.getBean("theZookeeper", Zookeeper.class);

        System.out.println(theZookeeper + " " + theZookeeper3);
        System.out.println(theZookeeper2 + " " + theFeeder2);
    }
}