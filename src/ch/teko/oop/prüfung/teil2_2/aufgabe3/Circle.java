package ch.teko.oop.prüfung.teil2_2.aufgabe3;

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
    public double calculatePerimeter() {
        return 2*this.getRadius()*Math.PI;
    }
}
