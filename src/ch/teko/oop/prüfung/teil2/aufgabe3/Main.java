package ch.teko.oop.prüfung.teil2.aufgabe3;

public class Main {
    public static void main(String[] args) {
        // circle
        Circle circle = new Circle("Green", 5.0);
        System.out.println(circle.calculateArea());

        // rectangle
        Rectangle rectangle = new Rectangle("Red", 5.0,5.0);
        System.out.println(rectangle.calculateArea());
    }
}
