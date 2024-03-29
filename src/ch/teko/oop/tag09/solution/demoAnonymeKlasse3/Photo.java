package ch.teko.oop.tag09.solution.demoAnonymeKlasse3;

import java.io.File;
import java.io.FilenameFilter;

public class Photo {
    private File basedir;

    public Photo(File basedir) {
        this.basedir = basedir;
    }

    public File[] getPictures() {
        // new <Interface> --> anonymeKlasse {...}
        FilenameFilter picFilter = new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().endsWith(".jpg" ) || name.toLowerCase().endsWith(".jpeg" ) || name.toLowerCase().endsWith(".png");
            }
        };
        return basedir.listFiles(picFilter);
    }


    // Aufgabe: Diese "innere Klasse" in der Methode getPictures() als anonyme Klasse implementieren.
    /*
    class PicFilter implements FilenameFilter {
        public boolean accept(File f, String s) {
            return s.toLowerCase().endsWith(".jpg" ) || s.toLowerCase().endsWith(".jpeg" ) || s.toLowerCase().endsWith(".png");
        }
    }
     */


    public static void main(String[] args) {
        // Mac
        Photo photo = new Photo(new File("./src/ch/teko/oop/tag09/input/AnonymeKlasse/demoAnonymeKlasse3"));
        // Windows
        // Photo photo = new Photo(new File(".\\src\\ch\\teko\\oop\\tag09\\input\\AnonymeKlasse\\demoAnonymeKlasse3"));
        for (File f: photo.getPictures()) {
            System.out.println(f.getName());
        }
    }
}
