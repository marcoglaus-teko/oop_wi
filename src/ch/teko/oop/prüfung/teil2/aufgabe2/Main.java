package ch.teko.oop.prüfung.teil2.aufgabe2;

public class Main {
    public static void main(String[] args) {
        // Tageskarte
        System.out.println("Die heutige Tageskarte: ");
        Menue menue1 = new Pasta("Pasta alla carbonara", 14.5, "Carbonara");
        Menue menue2 = new Pasta("Pasta verdure", 22.5, "Gemuese Sugo");
        Menue menue3 = new Menue("Schnippo", 17.5);
        menue1.printMenue();
        menue2.printMenue();
        menue3.printMenue();

        // Leerzeile
        System.out.println("");

        // Pizzakarte
        System.out.println("Pizzakarte: ");
        Menue menue4 = new Pizza("Margherita", 18.5, new String[]{"Tomaten", "Mozzarella"});
        Menue menue5 = new Pizza("Funghi", 19.5, new String[]{"Tomaten", "Mozzarella", "Champignons"});
        Menue menue6 = new Pizza("Quattro Stagione", 22.5, new String[]{"Tomaten", "Mozzarella", "Champignons", "Schinken", "Artischocken"});
        Menue menue7 = new Pizza("Pizza Speziale", 12.5, new String[]{"Tomaten"});
        menue4.printMenue();
        menue5.printMenue();
        menue6.printMenue();
        menue7.printMenue();
    }
}
