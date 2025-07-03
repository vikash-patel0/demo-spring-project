package com.bomb;

public class Car {
    private final Engine engine;
    public Car(Engine engine){
        this.engine=engine;
    }

    public void drive(){
        System.out.println("Driving the car...");
        engine.start();
    }
}
