package lec12;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Person.Factory.newBaby("Alice", 1); // (1)
        Person.newBaby("Alice", 1); // (2)
    }
}
