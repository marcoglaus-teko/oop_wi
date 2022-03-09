package ch.teko.oop.prüfung.teil2.aufgabe3;

public abstract class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    // Abstrakte Methode calculateArea
    public abstract double calculateArea();
}
