package ch.teko.oop.prüfung.teil2_2.aufgabe4;

public class Main {
    public static void main(String[] args) {
        for (Wochentag tag : Wochentag.values()) {
            switch (tag) {
                case MONTAG:
                case DIENSTAG:
                case MITTWOCH:
                case DONNERSTAG:
                    System.out.println("Am " + tag.name() + " muss ich arbeiten.");
                    break;
                case FREITAG:
                    System.out.println("TGIF :)");
                    break;
                case SAMSTAG:
                case SONNTAG:
                    System.out.println("Wochenende ...");
                    break;
                default:
                    System.out.println("Welcher Tag ist das???");
                    break;
            }
        }
    }
}
