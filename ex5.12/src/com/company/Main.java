/*Create a class called Tank that can be filled and emptied, and has a
termination condition that it must be empty when the object is cleaned up. Write a
finalize( ) that verifies this termination condition. In main( ), test the possible scenarios
that can occur when your Tank is used. */
package com.company;

public class Main {

    public static void main(String[] args) {
        Tank tank1 = new Tank();
        Tank tank2 = new Tank(3);
        Tank tank3 = new Tank(5);
        tank2.empty();
        new Tank(6);
        System.out.println("Check tanks:");
        System.out.println("tank1: ");
        tank1.sayHowFull();
        System.out.println("tank2: ");
        tank2.sayHowFull();
        System.out.println("tank3: ");
        tank3.sayHowFull();
        System.out.println("first forced gc():");
        System.gc();
        System.out.println("try deprecated runFinalizersOnExit(true):");
        System.runFinalizersOnExit(true);
        System.out.println("last forced gc():");
        System.gc();
    }

}
