package com.SL_0720_animal;

public class Animal {   //
    String name;
    int age;
    Animal(){

    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void print() {
        System.out.println(name);
        System.out.println(age);
    }
}
