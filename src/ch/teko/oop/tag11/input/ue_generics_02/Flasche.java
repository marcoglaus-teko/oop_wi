package ch.teko.oop.tag11.input.ue_generics_02;

public class Flasche {
    private Getraenk inhalt;

    public Flasche() {
    }

    public void fuellen(Getraenk inhalt) {
        this.inhalt = inhalt;
    }

    public Getraenk leeren() {
        Getraenk result = this.inhalt;
        this.inhalt = null;
        return result;
    }
}
