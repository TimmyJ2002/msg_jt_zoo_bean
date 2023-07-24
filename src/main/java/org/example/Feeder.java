package org.example;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("Feeder")
@Scope("prototype")
public class Feeder implements Zooworker {
    public void feed(String animal, String food) {
        System.out.println("The " + animal + " was fed by the feeder with " + food + "\n");
    }

    @Override
    public boolean cleanup(String s) {
        return false;
    }

    @Override
    public String getFood(int quantityKg) {
         return "Food" + quantityKg;
    }


}

