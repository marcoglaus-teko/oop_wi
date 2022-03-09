package ch.teko.oop.prüfung.teil2_2.aufgabe2;

public class Pasta extends Menue {
    private String sosse;

    public Pasta(String name, double preis, String sosse) {
        super(name, preis);
        this.sosse = sosse;
    }

    public String getSosse() {
        return sosse;
    }

    @Override
    public void printMenue() {
        System.out.println("Eine " + this.getName() + " mit " + this.getSosse() + " kostet " + this.getPreis() + ".-");
    }
}
