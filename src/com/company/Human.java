package com.company;

public class Human implements Runable, Jumpable{
    protected String name;
    protected int jumpHeight;
    protected int runDistance;
    protected Human(String name, int jumpHeight, int runDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    @Override
    public boolean jump(Wall wall) {
        if(jumpHeight>=wall.getHeight())
        {
            System.out.println("Человек " + name + " прыгнул на " + jumpHeight + " и перепрыгнул стену!");
            return true;}
        else {
            System.out.println("Человек " + name + " не справился со стеной высотой " + wall.getHeight() + " и выбыл!");
            return false;
        }
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if(runDistance>=treadmill.getRunDistance()){
            System.out.println("Человек " + name + " пробежал дистанцию " + runDistance+ " !");
            return true;}
        else{
        System.out.println("Человек " + name + " не справился с дистанцией" + treadmill.getRunDistance() + " и выбыл!");
        return false;}
    }
}
