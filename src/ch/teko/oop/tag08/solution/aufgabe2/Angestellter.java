package ch.teko.oop.tag08.solution.aufgabe2;

public class Angestellter extends Mitarbeiter{
    private double grundGehalt;
    private double zulage;

    public Angestellter(int persNr, String name, int dienstalter, double grundGehalt, double zulage) {
        super(persNr, name, dienstalter);
        this.grundGehalt = grundGehalt;
        this.zulage = zulage;
    }

    @Override
    public double monatsBrutto() {
        return this.grundGehalt + this.zulage;
    }
}
