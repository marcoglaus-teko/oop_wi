package ch.teko.oop.prüfung.teil2_2.aufgabe6;

public class Karte {
    private int id;
    private String besitzer;

    public Karte(int id, String besitzer) {
        this.id = id;
        this.besitzer = besitzer;
    }

    public int getId() {
        return id;
    }

    public String getBesitzer() {
        return besitzer;
    }
}
