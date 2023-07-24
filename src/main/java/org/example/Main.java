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
  // Monkey kingKong = new Monkey(new Zookeeper());
  // kingKong.feed("Shaorma");

        Monkey gorilla =new Monkey(new Feeder());
        gorilla.feed("Banana");

        System.out.println(theZookeeper.getFood(3));

    }
}