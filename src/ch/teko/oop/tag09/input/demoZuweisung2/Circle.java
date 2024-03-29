package ch.teko.oop.tag09.input.demoZuweisung2;

public class Circle implements IPolygon {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return radius * radius * Math.PI;
    }
}
