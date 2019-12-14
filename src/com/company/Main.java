package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
Set<Dog>dalmatian=new HashSet<>();
Dog d1=new Dog("Starfire",10);
Dog d2=new Dog("Fenix",2);

for(int i=1;i<=40;i++){
    System.out.println(i);
}

dalmatian.add(d1);
dalmatian.add(d2);
        System.out.println(dalmatian);
        System.out.println(dalmatian.contains(d2));


        }
    }

class Dog{
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                name.equals(dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

