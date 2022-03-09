package ch.teko.oop.prüfung.teil2_2.aufgabe6;

public class Banknote {
    private String währung;
    private int wert;

    public Banknote(String währung, int wert) {
        this.währung = währung;
        this.wert = wert;
    }

    public String getWährung() {
        return währung;
    }

    public int getWert() {
        return wert;
    }
}
