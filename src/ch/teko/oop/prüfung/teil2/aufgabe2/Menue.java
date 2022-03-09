package ch.teko.oop.prüfung.teil2.aufgabe2;

public class Menue {
    private String name;
    private double preis;

    public Menue(String name, double preis) {
        this.name = name;
        this.preis = preis;
    }

    public String getName() {
        return name;
    }

    public double getPreis() {
        return preis;
    }

    public void printMenue() {
        System.out.println("Ein(e) " + this.getName() + " kostet: " + this.getPreis() + ".-");
    }
}
