package ch.teko.oop.prüfung.teil2.aufgabe8;

public class Kunde {
    private String name;
    private String adresse;

    public Kunde(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public String getAdresse() {
        return adresse;
    }
}
