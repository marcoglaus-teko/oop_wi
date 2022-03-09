package ch.teko.oop.prüfung.teil2_2.aufgabe6;

public class Portemonnaie<A, B, C> {
    private A varA;
    private B varB;
    private C varC;

    public Portemonnaie(A varA, B varB, C varC) {
        this.varA = varA;
        this.varB = varB;
        this.varC = varC;
    }

    public A getVarA() {
        return varA;
    }

    public B getVarB() {
        return varB;
    }

    public C getVarC() {
        return varC;
    }
}
