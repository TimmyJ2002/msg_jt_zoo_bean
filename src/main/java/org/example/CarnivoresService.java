package org.example;

import org.springframework.stereotype.Component;

@Component("carnivoresService")
public class CarnivoresService implements FoodService{

    @Override
    public String getFood(int quantityKg){
        return quantityKg + "kg of delicious chicken breast";
    }
}
