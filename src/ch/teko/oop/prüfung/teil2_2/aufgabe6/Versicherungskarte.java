package ch.teko.oop.prüfung.teil2_2.aufgabe6;

public class Versicherungskarte extends Karte{
    private String versicherung;

    public Versicherungskarte(int id, String besitzer, String versicherung) {
        super(id, besitzer);
        this.versicherung = versicherung;
    }

    public String getVersicherung() {
        return versicherung;
    }
}
