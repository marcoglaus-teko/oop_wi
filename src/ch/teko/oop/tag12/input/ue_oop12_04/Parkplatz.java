package ch.teko.oop.tag12.input.ue_oop12_04;

public class Parkplatz {
    private boolean besetzt;
    private Auto auto;

    public Parkplatz() {
        this.besetzt = false;
    }

    public boolean isBesetzt() {
        return besetzt;
    }

    public void setBesetzt(boolean besetzt) {
        this.besetzt = besetzt;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        if (!isBesetzt()) {
            this.auto = auto;
            setBesetzt(true);
        } else {
            System.out.println("Parkplatz ist besetzt!");
        }
    }
}
