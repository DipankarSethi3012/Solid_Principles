package SingleResponsibilityPrinciple;
//It states that the class should only have one reason to change

//Breaking SRP
//class Temp{
//    public void print(){
//
//    }
//
//    public void scan() {
//
//    }
//}

//The above codes does not follow the SRP because Temp has 2 functionalities to change.

class Printer{
    public void print(){
        System.out.println("Printing the data: ");
    }
}

class Scanner {
    public void scan() {
        System.out.println("Scanning the data: ");
    }
}
public class Main {
    public static void main(String[] args) {
        //Doesn't follow the SRP
//        Temp temp = new Temp();
//        temp.print();
//        temp.scan();

        //correct way
        Printer printer = new Printer();
        printer.print();

        Scanner scanner = new Scanner();
        scanner.scan();
    }
}
