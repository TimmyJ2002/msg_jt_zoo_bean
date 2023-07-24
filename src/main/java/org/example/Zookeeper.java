package org.example;

import org.springframework.stereotype.Component;

@Component("theZookeeper")
public class Zookeeper implements Zooworker {
    public void feed(String animal, String food){
        System.out.println("The " + animal + " was fed with " + food + "\n");
    }

    @Override
    public boolean cleanup(String clean) {
        return true;
    }

}

