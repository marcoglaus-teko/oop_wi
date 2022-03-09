package ch.teko.oop.prüfung.teil2_2.aufgabe6;

public class Main {
    public static void main(String[] args) {
        // Vervollständigen sie
        Portemonnaie<Banknote, Bankkarte, Versicherungskarte> portemonnaie = new Portemonnaie(new Banknote("CHF", 100), new Bankkarte(123, "Peter Meier", "LUKB"), new Versicherungskarte(124, "Peter Meier", "CSS Versicherungen"));
        System.out.printf("Im Portemonnaie befinden sich eine %ser Note, eine Karte von der %s und eine Karte von der %s.", portemonnaie.getVarA().getWert(), portemonnaie.getVarB().getBank(), portemonnaie.getVarC().getVersicherung());
    }
}
