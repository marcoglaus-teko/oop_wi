package ch.teko.oop.prüfung.teil2.aufgabe3;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double calculateArea() {
        return this.getLength() * this.getWidth();
    }
}
