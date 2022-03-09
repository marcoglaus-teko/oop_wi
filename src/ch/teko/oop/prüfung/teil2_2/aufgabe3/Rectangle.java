package ch.teko.oop.prüfung.teil2_2.aufgabe3;

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
    public double calculatePerimeter() {
        return 2*(this.getLength()+this.getWidth());
    }
}
