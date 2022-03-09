package ch.teko.oop.prüfung.teil2.aufgabe8;

public interface IVertrieb {
    /**
     * Potentielle Kunden, die gespeichert werden.
     * @param k
     */
    void hinzufuegen(int i, Kunde k);

    /**
     * Liste der potentiellen Kunden ausdrucken (auf die Konsole).
     */
    void druckeKunden();

    /**
     * Entfernen der Kunden, da negative Antwort.
     * @param name
     */
    void entfernen(String name);
}
