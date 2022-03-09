package ch.teko.oop.prüfung.teil2.aufgabe8;

public class Main {
    public static void main(String[] args) {
        // Potentielle Kunden
        Kunde k1 = new Kunde("Teko Luzern", "Pilatusstrasse 38");
        Kunde k2 = new Kunde("Bäckerei Macchi", "Pilatusstrasse 5");
        Kunde k3 = new Kunde("Glasi Hergiswil", "Seestrasse 12");

        // Abteilung Vertrieb
        Vertrieb vertrieb = new Vertrieb();

        // Kunden hinzufügen
        vertrieb.hinzufuegen(1234, k1);
        vertrieb.hinzufuegen(1235, k2);
        vertrieb.hinzufuegen(1236, k3);

        // Kundenstamm drucken
        vertrieb.druckeKunden();

        // Telefonat mit der Glasi Hergiswil
        System.out.println("---");

        // Kunde Glasi Hergiswil hat kein interesse ...
        vertrieb.entfernen("Glasi Hergiswil");

        // Kundenstamm drucken
        vertrieb.druckeKunden();
    }
}
