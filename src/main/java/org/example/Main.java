package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Program human = new Human();
        Program cat = new Cat();
        Program robot = new Robot();
        human.run();
        human.jump();
        cat.run();
        cat.jump();
        robot.run();
        robot.jump();
    }
}