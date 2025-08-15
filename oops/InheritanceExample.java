public class InheritanceExample {

    // Parent class
    static class Animal {
        void eat() {
            System.out.println("Animal is eating");
        }
    }

    // Child class
    static class Cat extends Animal {
        void run() {
            System.out.println("Cat is running");
        }
    }

    public static void main(String[] args) {
        Cat pussy = new Cat(); // Object of child class
        pussy.eat();           // Inherited from Animal
        pussy.run();           // Cat's own method
    }
}
