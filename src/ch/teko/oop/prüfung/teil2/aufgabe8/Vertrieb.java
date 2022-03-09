package ch.teko.oop.prüfung.teil2.aufgabe8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Vertrieb implements IVertrieb {
    private HashMap<Integer, Kunde> kundenHashMap = new HashMap<>();

    @Override
    public void hinzufuegen(int i, Kunde k) {
        // Implementieren Sie
        this.kundenHashMap.put(i, k);
    }

    @Override
    public void druckeKunden() {
        // Implementieren Sie
        for (Kunde k : this.kundenHashMap.values()) {
            System.out.println(k.getName() + " " + k.getAdresse());
        }

        // akzeptierte Alternative
        /*
        Iterator<Map.Entry<Integer, Kunde>> iterator = this.kundenHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Kunde> entry = iterator.next();
            Kunde k = entry.getValue();
            System.out.println(k.getName() + k.getAdresse());
        }
         */
    }

    @Override
    public void entfernen(String name) {
        Set<Map.Entry<Integer, Kunde>> entrySet = this.kundenHashMap.entrySet();
        // Implementieren Sie
        for (Map.Entry<Integer, Kunde> entry : entrySet) {
            if (entry.getValue().getName().equals(name)) {
                this.kundenHashMap.remove(entry.getKey());
            }
        }

        // akzeptierte Alternative
        /*
        Iterator<Map.Entry<Integer, Kunde>> iterator = entrySet.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Kunde> entry = iterator.next();
            if (name.equals(entry.getValue().getName())) {
                iterator.remove();
            }
        }
         */
    }
}
