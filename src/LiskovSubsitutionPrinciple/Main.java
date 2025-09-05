package LiskovSubsitutionPrinciple;
//the subclass doesn't break the functionality of the parent class

//class Bird {
//    public void fly() {
//        System.out.println("Flying: ");
//    }
//}
//
//class Penguin extends Bird {
//    public void fly() {
//        throw new UnsupportedOperationException("I can't fly");
//    }
//}
//The above mention code doesn't follow the LSP because Penguin is breaking the functionality of the Bird class

interface flyable {
    void fly();
}

interface eatable {
    void eat();
}
class Bird implements flyable, eatable{

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }

    @Override
    public void eat() {
        System.out.println("Bird is eating: ");
    }

}

class Penguin implements eatable {
    @Override
    public void eat() {
        System.out.println("Penguin is eating: ");
    }
}
public class Main {
    public static void main(String[] args) {
        //This is wrong
//        Bird bird = new Bird();
//        Penguin penguin = new Penguin();
//        penguin.fly(); //throws an exception

        Bird bird = new Bird();
        bird.fly();
        bird.eat();

        Penguin penguin = new Penguin();
        penguin.eat();
    }
}
