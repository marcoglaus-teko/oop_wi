package ch.teko.oop.tag10.input.ArrayList;

public class Teacher {
    private String surname;
    private String forename;

    public Teacher(String surname, String forename) {
        this.surname = surname;
        this.forename = forename;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }
}
