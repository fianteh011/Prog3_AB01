package de.hsos.prog3.team5.ab1.orchester;

import java.io.IOException;
import java.net.URL;
import java.util.HashSet;

public class Orchester {
    private String bezeichnung, audioDateiKonzert;
    private Dirigent dirigent;
    private Verhalten verhalten;
    private HashSet<MusikerIn> musikerInnen = new HashSet<>();

    public Orchester(String bezeichnung, String audioDateiKonzert) {
        this.bezeichnung = bezeichnung;
        this.audioDateiKonzert = audioDateiKonzert;
    }

    public void addDirigentIn(Dirigent dirigent) {
        if (dirigent != null)
            this.dirigent = dirigent;
    }

    public void addMusikerIn(MusikerIn musikerIn) {
        if (musikerIn != null)
            musikerInnen.add(musikerIn);
    }

    public HashSet<MusikerIn> getMusikerInnen() {
        return musikerInnen;
    }

    public URL getAudiodateiKonzert() throws IOException {
        URL url = Orchester.class.getResource(audioDateiKonzert);
        return url;
    }

    public void proben(Orchester orchester) {
        // write ur code here
        verhalten = new Probe();
    }

    public void auftreten(Orchester orchester) {
        // write ur code here
        verhalten = new Konzert();
    }

    public void spielen() throws IOException {
        verhalten.spielen(this);
    }

}
