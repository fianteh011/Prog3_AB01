package de.hsos.prog3.team5.ab1.nachbarApp;

public class Nachbar {
    private String nachname;
    private String vorname;

    public Nachbar(String nachname, String vorname) {
        this.nachname = nachname;
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    @Override
    public String toString() {
        return  nachname + " " + vorname + '\'' ;
    }
}
