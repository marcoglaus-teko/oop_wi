package ch.teko.oop.tag10.solution.ue_oop_10_02_02;

public class Artikel {
    // EAN = European Article Number
    private long ean;
    private String name;

    public Artikel(long ean, String name) {
        this.ean = ean;
        this.name = name;
    }

    public long getEan() {
        return ean;
    }

    public String getName() {
        return name;
    }

}
