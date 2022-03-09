package ch.teko.oop.prüfung.teil2.aufgabe5;

public class Rechner implements IRechner{
    @Override
    public double addition(double a, double b) {
        return a + b;
    }

    @Override
    public double subtraktion(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplikation(double a, double b) {
        return a * b;
    }

    @Override
    public double division(double a, double b) {
        return a / b;
    }
}
