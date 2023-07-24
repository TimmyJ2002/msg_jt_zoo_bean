package org.example;

import org.springframework.context.annotation.Bean;

public interface Zooworker {
    public void feed(String animal, String food);

    boolean cleanup(String clean);

     String getFood(int quantity);
}
