package ch.teko.oop.prüfung.teil2.aufgabe7;

import java.util.ArrayList;
import java.util.Iterator;

public class Bus implements IBus {
    private ArrayList<Person> reisende = new ArrayList<>();

    @Override
    public void einsteigen(Person p) {
        this.reisende.add(p);
    }

    @Override
    public void aussteigen(String name) {
        Iterator<Person> iterator = this.reisende.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getName().equals(name)) {
                iterator.remove();
            }
        }

        // akzeptierte Alternative
        /*
        for (Person p: this.reisende) {
            if (p.getName().equals(name)) {
                this.reisende.remove(p);
            }
        }
         */

        // akzeptierte Alternative
        // reisende.removeIf((p) -> p.getName().equals(name));
    }

    @Override
    public void printReisende() {
        for (Person p : this.reisende) {
            System.out.println(p.getName());
        }

        // akzeptierte Alternative
        // reisende.forEach((p) -> System.out.println(p.getName()));
    }
}
