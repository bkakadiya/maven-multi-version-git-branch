package com.child2;

import com.child1.Car;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car(1, "Honda");
        Car car2 = new Car(1, "BMW");

        System.out.println("Hello Child 2");

        System.out.println("First Car Name " + car1.getName());

        System.out.println("Second Car Name " + car2.getName());

    }
}
