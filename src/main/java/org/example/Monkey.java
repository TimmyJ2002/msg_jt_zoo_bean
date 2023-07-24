package org.example;

public class Monkey {
    Zooworker zooworker;
    public Monkey(Zooworker zookeeper){
        this.zooworker = zookeeper;
    }

    public void feed(String food){
       zooworker.feed("Monkey",food);
    }
}
