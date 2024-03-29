package ch.teko.oop.tag12.solution.ue_oop12_04;

public class Parkplatz {
    private boolean besetzt;
    private Auto auto;
    private final int parkzeit;

    public Parkplatz() {
        this.besetzt = false;
        this.parkzeit = (int) (Math.random() * 43800);
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

    public int getParkzeit() {
        return parkzeit;
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
