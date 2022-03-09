package ch.teko.oop.prüfung.teil2.aufgabe7;

public class Main {
    public static void main(String[] args) {
        // Reisende warten auf den Bus
        Person p1 = new Person("Meier");
        Person p2 = new Person("Huber");
        Person p3 = new Person("Stalder");

        // Reisende steigen ein
        Bus bus = new Bus();
        bus.einsteigen(p1);
        bus.einsteigen(p2);
        bus.einsteigen(p3);

        // Diese Reisende sind an board
        bus.printReisende();

        // Bus fährt ...
        System.out.println("---");

        // Reisender Huber steigt aus
        bus.aussteigen("Huber");

        // Diese Reisende sind noch an board
        bus.printReisende();
    }
}
