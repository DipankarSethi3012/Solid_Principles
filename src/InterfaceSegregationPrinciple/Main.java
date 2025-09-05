package InterfaceSegregationPrinciple;
//A class should not be force to implement the interfaces if no need.
//interface Work{
//    void work();
//    void eat();
//}
//
//class Robot implements Work{
//
//    @Override
//    public void work() {
//
//    }
//
//    @Override
//    public void eat() {
//        throw new UnsupportedOperationException("Robot can't eat");
//    }
//}
//The above-mentioned code is wrong because the Robot forced to implement the eat method even it doesn't make any sense.

import java.awt.*;

//conclusion: Separate the interfaces according to the need.
interface workable{
    void work();
}

interface eatable {
    void eat();
}

class Human implements workable, eatable {

    @Override
    public void eat() {
        System.out.println("Human is eating: ");
    }

    @Override
    public void work() {
        System.out.println("Human is working: ");
    }
}

class Robot implements workable {

    @Override
    public void work() {
        System.out.println("Robot is working: ");
    }
}
public class Main {
    public static void main(String[] args) {

        Human human = new Human();
        human.eat();
        human.work();

        Robot robot = new Robot();
        robot.work();
    }
}
