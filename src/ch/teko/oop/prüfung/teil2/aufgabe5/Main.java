package ch.teko.oop.prüfung.teil2.aufgabe5;

public class Main {
    public static void main(String[] args) {
        Rechner rechner = new Rechner();
        System.out.println(rechner.addition(10.0,11.0));
        System.out.println(rechner.subtraktion(11.0,1.0));
        System.out.println(rechner.multiplikation(10.0, 5.0));
        System.out.println(rechner.division(10.0,2.0));
    }
}
