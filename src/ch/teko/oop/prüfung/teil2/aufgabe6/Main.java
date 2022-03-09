package ch.teko.oop.prüfung.teil2.aufgabe6;

public class Main {
    public static void main(String[] args) {
        // Vervollständigen Sie
        Etui<Kugelschreiber, Stift> etui = new Etui<>(new Kugelschreiber("Schwarz"), new Stift("Blau"));
        System.out.println(etui.getVarA().getFarbe());
        System.out.println(etui.getVarB().getFarbe());
    }
}
