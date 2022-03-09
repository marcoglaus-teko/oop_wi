package ch.teko.oop.prüfung.teil2.aufgabe3;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calculateArea() {
        return this.getRadius() * this.getRadius() * Math.PI;
    }
}
