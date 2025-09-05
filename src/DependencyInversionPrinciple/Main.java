package DependencyInversionPrinciple;
//high level Modules should not depend on the low level modules. Both should depend on abstractions

//class WiredKeyboard {
//    void connect() { System.out.println("Connected via wire."); }
//}
//
//class Computer {
//    private WiredKeyboard keyboard = new WiredKeyboard(); // Direct dependency
//}

//The above-mentioned approach is wrong because wired keyboard directly depends on the computer

interface Keyboard {
    void connect();
}

class WiredKeyboard implements Keyboard {
    public void connect() { System.out.println("Connected via wire."); }
}

class WirelessKeyboard implements Keyboard {
    public void connect() { System.out.println("Connected via Bluetooth."); }
}

class Computer {
    private Keyboard keyboard;

    Computer(Keyboard keyboard) { this.keyboard = keyboard; }

    void start() {
        keyboard.connect();
        System.out.println("Computer is running...");
    }

}
//This is correct because Computer doesn't know which type of keyboard is being used.

public class Main {
    public static void main(String[] args) {
      Computer computer = new Computer(new WiredKeyboard());
      computer.start();

      Computer computer1 = new Computer(new WirelessKeyboard());
      computer1.start();
    }
}
