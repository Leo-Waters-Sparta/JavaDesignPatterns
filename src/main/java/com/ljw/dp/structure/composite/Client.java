package com.ljw.dp.structure.composite;

public class Client {
    public static void main(String[] args) {
        Composite Car = new Composite("Car");
        
        Component wheel1 = new Component("wheel", 100);
        Component wheel2 = new Component("wheel", 100);
        Component wheel3 = new Component("wheel", 100);
        Component wheel4 = new Component("wheel", 100);
        
        Component steeringWheel = new Component("steering wheel", 250);
        
        Composite engine = new Composite("engine");
        
        Component alternator = new Component("Alternator", 300);
        Component turbo = new Component("Turbo", 500);
        Component piston = new Component("Piston", 150);
        Component manifold = new Component("Manifold", 500);

        engine.add(alternator).add(turbo).add(piston).add(manifold);
        
        Car.add(wheel1).add(wheel2).add(wheel3).add(wheel4);
        Car.add(steeringWheel).add(engine);

        System.out.println("Car price: " + Car.getPrice());
    }
}
