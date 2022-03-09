package ch.teko.oop.prüfung.teil2.aufgabe6;

public class Etui<A, B> {
    private A varA;
    private B varB;

    public Etui(A varA, B varB) {
        this.varA = varA;
        this.varB = varB;
    }

    public A getVarA() {
        return varA;
    }

    public B getVarB() {
        return varB;
    }
}
