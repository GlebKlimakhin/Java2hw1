package com.company;

public class Cat implements Runable, Jumpable{
    protected String name;
    protected int jumpHeight;
    protected int runDistance;
    protected Cat(String name, int jumpHeight, int runDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    @Override
    public boolean jump(Wall wall) {
        if(jumpHeight>=wall.getHeight())
        {
            System.out.println("Кот " + name + " перепрыгнул стену, прыгнув на " + jumpHeight + " !");
            return true;}
        else
        {
            System.out.println("Кот " + name + " не справился со стеной высотой + " + wall.getHeight() + " и выбыл!");
            System.out.println();
            return false;}
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if(runDistance>=treadmill.getRunDistance())
        {
            System.out.println("Кот " + name + " пробежал дистанцию " + runDistance + " !");
            return true;}
        else
        {
            System.out.println("Кот " + name + " не справился c дистанцией " + treadmill.getRunDistance() + " и выбыл!");
            System.out.println();
            return false;}
    }
}
