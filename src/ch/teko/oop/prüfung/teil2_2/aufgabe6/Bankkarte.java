package ch.teko.oop.prüfung.teil2_2.aufgabe6;

public class Bankkarte extends Karte {
    private String bank;

    public Bankkarte(int id, String besitzer, String bank) {
        super(id, besitzer);
        this.bank = bank;
    }

    public String getBank() {
        return bank;
    }
}
