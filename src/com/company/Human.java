package com.company;

public class Human implements Runable, Jumpable{
    String name;
    int jumpHeight;
    int runDistance;
    public Human(String name, int jumpHeight, int runDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    @Override
    public void jump(Wall wall) {
        if(jumpHeight>=wall.height)
            System.out.println("Человек " + name + " перепрыгнул стену!");
        else
            System.out.println("Человек " + name + " не справился!");
    }

    @Override
    public void run(Treadmill treadmill) {
        if(runDistance>=treadmill.runDistance)
            System.out.println("Человек " + name + " пробежал дистанцию!");
        else
        System.out.println("Человек " + name + " не справился!");
    }
}
