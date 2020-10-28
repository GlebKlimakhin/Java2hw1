package com.company;

public class Cat implements Runable, Jumpable{
    String name;
    int jumpHeight;
    int runDistance;
    public Cat(String name, int jumpHeight, int runDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    @Override
    public void jump(Wall wall) {
        if(jumpHeight>=wall.height)
            System.out.println("Кот " + name + " перепрыгнул стену!");
        else
            System.out.println("Кот " + name + " не справился!");
    }

    @Override
    public void run(Treadmill treadmill) {
        if(runDistance>=treadmill.runDistance)
            System.out.println("Кот " + name + " пробежал дистанцию!");
        else
            System.out.println("Кот " + name + " не справился!");
    }
}
