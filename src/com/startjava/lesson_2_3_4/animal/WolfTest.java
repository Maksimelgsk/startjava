package com.startjava.lesson_2_3_4.animal;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setGender("Волк");
        System.out.println("Пол: " + wolfOne.getGender());
        wolfOne.setName("Акела");
        System.out.println("Кличка: " + wolfOne.getName());
        wolfOne.setWeight(34.5F);
        System.out.println("Вес: " + wolfOne.getWeight());
        wolfOne.setAge(9);
        System.out.println("Возраст: " + wolfOne.getAge());
        wolfOne.setColor("Черный");
        System.out.println("Окрас: " + wolfOne.getColor());
        wolfOne.go();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}