## ue_oop_03_01
### Aufgabe 1
nach bekanntem Muster: Attribute, Konstruktoren, Methoden definieren. Thema Sichtbarkeit beachten. Kann auf ein Attribut, dass mit private deklariert wurde, ausserhalb der Klasse direkt zugegriffen werden?

### Aufgabe 2
In dieser Aufgabe möchten wir zum ersten Mal mehrere Klassen schreiben und mit mehreren Objekten arbeiten. Gemäss Abbildung eignet sich eine Aufteilung des Problems/ Aufgabenstellung in 3 Klassen.

Erstellt werden die Objekte von Calculate und Input in einer "leeren" Main-Class die nur die static main-Methode hält.

Als erstes erstelle ich je ein Objekt der Klasse Input und Calculate.

Meine Klasse Input hat ein Attribut (myScanner) von Typ **Scanner**. Es handelt sich hier also nicht um einen primitiven Datentyp, sondern um einen Klassentyp.

Im Konstruktor von der Klasse Input initialisiere ich das Attribut, in dem ich ein neues Objekt von Scanner erstelle.

Die Klasse Input hat auch Methoden. Hier z.B. eine mit dem Namen readIntFromCommandLine() welche dann die entsprechende Methode vom Scanner aufruft.

Die Klasse Calculate enthält nur Logik für die Berechnung. Hier z.B. die Methode **sum**, um die Summer zu berechnen und wieder zurückzugeben.

Dies eine von vielen möglichen Lösungen. 