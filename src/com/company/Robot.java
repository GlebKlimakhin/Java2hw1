package com.company;

public class Robot implements Runable{
    protected String name;
    protected int runDistance;
    protected Robot(String name, int runDistance) {
    this.name = name;
    this.runDistance = runDistance;
    }

    @Override
    public boolean run(Treadmill treadmill) {
        if(runDistance>=treadmill.getRunDistance())
        {
            System.out.println("Робот " + name + " пробежал дистанцию " + runDistance + " !");
            return true;}
        else
        {
            System.out.println("Робот " + name + " не справился с дистанцией " + treadmill.getRunDistance() +  " и выбыл!");
            return false;}
    }

}
