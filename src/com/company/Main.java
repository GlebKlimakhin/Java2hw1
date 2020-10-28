package com.company;

public class Main {

    public static void main(String[] args) {
	//Robot robot = new Robot("Fedor", 15);
	//Cat cat = new Cat("Melon", 5,6);
	//Human human = new Human("Steve", 20, 32);
	//Treadmill treadmill = new Treadmill(14);
	//Wall wall = new Wall(14);
	//cat.run(treadmill);
	//human.jump(wall);
	task3();
}
protected static void task3()
{
	Object [] obstacles = {
			new Treadmill(10),
			new Wall(4),
			new Treadmill(12),
			new Wall(16)
	};
	Object [] subjects = {
			new Cat("Mustafa", 5, 2),
			new Robot("R2", 32),
			new Human("Daniel", 20, 50),
	};

	for (Object subject : subjects) {
		for (Object obstacle : obstacles) {
			if (obstacle instanceof Treadmill) {
				if (!(((Runable) subject).run((Treadmill) obstacle)))
					break;
			} else {
				if (!(subject instanceof Jumpable)) {
					System.out.println(((Robot) subject).name + " сошёл с дистанции!");
						/*
						не придумал как сделать так, чтобы если объект другого класса не умел прыгать,
						то выводить его имя без (ИМЯ_КЛАССА), в котором нет этого метода :(
						*/
					System.out.println();
					break;
				} else {
					if (!(((Jumpable) subject).jump((Wall) obstacle))) {
						System.out.println();
						break;
					}
				}
			}

			System.out.println();
		}
	}
}
}

