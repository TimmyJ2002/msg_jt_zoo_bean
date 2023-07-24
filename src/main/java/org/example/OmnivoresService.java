package org.example;


import org.springframework.stereotype.Component;

@Component
public class OmnivoresService implements FoodService{

    @Override
    public String getFood(int quantityKg){
        return quantityKg + "kg of delicious chicken breast and Salad";
    }
}
