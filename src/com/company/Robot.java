package com.company;

public class Robot implements Runable, Jumpable{
    String name;
    int jumpHeight;
    int runDistance;
    public Robot(String name, int jumpHeight, int runDistance) {
    this.name = name;
    this.jumpHeight = jumpHeight;
    this.runDistance = runDistance;
    }

    @Override
    public void run(Treadmill treadmill) {
        if(runDistance>=treadmill.runDistance)
            System.out.println("Робот " + name + " пробежал дистанцию!");
        else
            System.out.println("Робот " + name + " не справился!");
    }

    @Override
    public void jump(Wall wall) {
        if(jumpHeight>=wall.height)
            System.out.println("Робот " + name + " перепрыгнул стену!");
        else
            System.out.println("Робот " + name + " не справился!");
    }
}
