package ch.teko.oop.prüfung.teil1.aufgabe6;

public class Auto {
    private String besitzer;
    private String marke;

    public Auto(String besitzer, String marke) {
        this.besitzer = besitzer;
        this.marke = marke;
    }

    public String getBesitzer() {
        return besitzer;
    }

    public String getMarke() {
        return marke;
    }
}
