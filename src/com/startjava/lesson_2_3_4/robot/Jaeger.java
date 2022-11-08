package com.startjava.lesson_2_3_4.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int speed;
    private int strength;
    private int armor;

    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, String origin, float height,
            float weight, int speed, int strength, int armor) {
        this.setModelName(modelName);
        this.setMark(mark);
        this.setOrigin(origin);
        this.setHeight(height);
        this.setWeight(weight);
        this.setSpeed(speed);
        this.setStrength(strength);
        this.setArmor(armor);
    }

    public void setModelName(String modelName) {
        if (modelName == "") {
            System.out.println("\nError: Пустая строка");
        } else {
            System.out.println("\nModelName: " + modelName);
            this.modelName = modelName;
        }
    }

    public void setMark(String mark) {
        if (mark == "") {
            System.out.println("Error: Пустая строка");
        } else {
            System.out.println("Mark: " + mark);
            this.mark = mark;
        }
    }

    public void setOrigin(String origin) {
        if (origin == "") {
            System.out.println("Error: Пустая строка");
        } else {
            System.out.println("Origin: " + origin);
            this.origin = origin;
        }
    }

    public void setHeight(float height) {
        if (height <= 50F) {
            System.out.println("Error: Неверно задана высота");
        } else {
            System.out.println("Height: " + height + " m");
            this.height = height;
        }
    }

    public void setWeight(float weight) {
        if (weight <= 1F) {
            System.out.println("Error: Неверно задан вес");
        } else {
            System.out.println("Weight: " + weight + " tons");
            this.weight = weight;
        }
    }

    public void setSpeed(int speed) {
        if (speed < 1 || speed > 10) {
            System.out.println("Error: Неверно задана скорость");
        } else {
            System.out.println("Speed: " + speed);
            this.speed = speed;
        }
    }

    public void setStrength(int strength) {
        if (strength < 1 || strength > 10) {
            System.out.println("Error: Неверно задана сила");
        } else {
            System.out.println("Strength: " + strength);
            this.strength = strength;
        }
    }

    public void setArmor(int armor) {
        if (armor < 0 || armor > 10) {
            System.out.println("Error: Неверно задана броня");
        } else {
            System.out.println("Armor: " + armor);
            this.armor = armor;
        }
    }

    public boolean drift() {
        System.out.println("Вы вошли в дрифт");
        return true;
    }

    public void move() {
        System.out.println("Вы прошли 5 шагов");
    }

    public String scanKaiju() {
        return "nothing";
    }

    public void useVortexCannon(boolean i) {
        if (i == true) {
            System.out.println("VortexCannon: деактивирована");
        } else {
            System.out.println("VortexCannon: активирована");
        }
    }

    public String topSrting() {
        return "modelName = " + modelName + " mark = " + mark;
    }
}