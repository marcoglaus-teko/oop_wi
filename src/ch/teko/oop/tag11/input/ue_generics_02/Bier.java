package ch.teko.oop.tag11.input.ue_generics_02;

public class Bier extends Getraenk {
    private String brauerei;

    public Bier(String brauerei) {
        this.brauerei = brauerei;
    }

    public String getBrauerei() {
        return brauerei;
    }
}
