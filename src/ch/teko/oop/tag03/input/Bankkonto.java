package ch.teko.oop.tag03.input;

public class Bankkonto {
    // Attribute
    private String kontonummer;
    private String kontoinhaber;
    private int kontostand;
    private int zaehler;

    public Bankkonto(String kontonummer, String kontoinhaber, int kontostand) {
        this.kontonummer = kontonummer;
        this.kontoinhaber = kontoinhaber;
        this.kontostand = kontostand;
        this.zaehler = 0;
    }

    // private Methode
    private void inkrementZaehler() {
        this.zaehler = this.zaehler + 1;
    }

    public void verarbeiteEinzahlung(int betrag) {
        // Aufruf der privaten Methode
        inkrementZaehler();
        kontostand = kontostand + betrag;
    }

    public void verarbeiteAuszahlung(int betrag) {
        int gebuehr;
        // Aufruf der privaten Methode
        inkrementZaehler();
        if (kontostand < 100000)
            gebuehr = 15;
        else
            gebuehr = 0;

        kontostand = kontostand - betrag - gebuehr;
    }
}
