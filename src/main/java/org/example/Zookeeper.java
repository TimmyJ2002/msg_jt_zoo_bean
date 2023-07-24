package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("theZookeeper")
@Scope("singleton")
public class Zookeeper implements Zooworker {

    @Qualifier("carnivoresService")
    @Autowired
    FoodService meatDelivery;

    @Autowired
    public Zookeeper(@Qualifier("carnivoresService") FoodService foodServiceWired){
        meatDelivery = foodServiceWired;
    }

    public void feed(String animal, String food) {
        System.out.println("The " + animal + " was fed with " + food + "\n");
    }

    @Override
    public boolean cleanup(String clean) {
        return true;
    }

    @Override
    public String getFood(int quantityKg){
        return "Food" + quantityKg;
    }
}

