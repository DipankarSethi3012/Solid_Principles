package OpenClosedPrinciple;
//It states that the class should be open for extension but closed for the modification.

//The naive way as this
//class Rectangle {
//    double length;
//    double width;
//    Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//    public void area() {
//        System.out.println("Area: " + length*width);
//    }
//}
//
//class Circle {
//    double radius;
//
//    Circle(double radius) {
//        this.radius = radius;
//    }
//
//    public void calculateArea(){
//        System.out.println("Area: " + Math.PI * radius * radius);
//    }
//}

//The above-mentioned approach is wrong.

interface Shape {
    void calculateArea();
}

class Rectangle implements Shape{
    double length;
    double width;
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public void calculateArea() {
        System.out.println("Area: " + length*width);
    }
}
class Circle implements Shape{
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateArea(){
        System.out.println("Area: " + Math.PI * radius * radius);
    }
}
public class Main {
    public static void main(String[] args) {
        //this is wrong because for every new shape we are modifying the Main class and the different method call is going for different classes
//        Rectangle r = new Rectangle(12,3);
//        r.calculateArea();
//
//        Circle c = new Circle(12);
//        c.calculateArea();

        Shape rectangle = new Rectangle(12, 3);
        rectangle.calculateArea();

        Shape circle = new Circle(112.3);
        circle.calculateArea();


    }
}
