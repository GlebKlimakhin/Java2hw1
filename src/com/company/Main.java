package com.company;

public class Main {

    public static void main(String[] args) {
	Robot robot = new Robot("Fedor", 15, 10);
	Cat cat = new Cat("Melon", 5,6);
	Human human = new Human("Charles", 20, 32);
	Treadmill treadmill = new Treadmill(14);
	Wall wall = new Wall(14);
	cat.run(treadmill);
	human.jump(wall);
    }
}
