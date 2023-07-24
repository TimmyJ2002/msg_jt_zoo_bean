package org.example;

public class Feeder implements Zooworker {
    public void feed(String animal, String food) {
        System.out.println("The " + animal + " was fed by the feeder with " + food + "\n");
    }

    @Override
    public boolean cleanup(String s) {
        return false;
    }
}
