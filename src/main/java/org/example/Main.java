package org.example;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    private static ClassPathXmlApplicationContext applicationContext;


    public static void main(String[] args) {
        applicationContext = new ClassPathXmlApplicationContext("aplicationContext.xml");


        Zooworker theZookeeper = applicationContext.getBean("theZookeeper", Zooworker.class);

        System.out.println(theZookeeper.cleanup("monkey.cage"));

        System.out.println("\n");
   Monkey kingKong = new Monkey(new Zookeeper());
   kingKong.feed("Shaorma");

   Monkey gorilla =new Monkey(new Feeder());
    gorilla.feed("Banana");
    }
}