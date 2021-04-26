package de.hsos.prog3.team5.ab1.orchester;

import de.hsos.prog3.team5.ab1.audio.StdAudioPlayer;
import de.hsos.prog3.team5.ab1.audio.adapter.SimpleAudioPlayerAdapter;

import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;

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
        return this.musikerInnen;
    }

    public URL getAudiodateiKonzert() throws IOException {
        return Orchester.class.getResource(this.audioDateiKonzert);
    }

    public void proben(Orchester orchester) {
        this.verhalten = new Probe();
    }

    public void auftreten(Orchester orchester) {
        this.verhalten = new Konzert();
    }

    public void spielen() throws IOException {
        this.verhalten.spielen(this);
    }

    //Frage: wenn eine KLasse von Orchester erbt, hat sie dann auch Zugriff auf die inneren Klassen?
    private class Probe implements Verhalten{

        @Override
        public void spielen(Orchester orchester) throws IOException{
            //nicht mehr nötig bei diesem Ansatz
            //Collection<MusikerIn> musikerInnen = orchester.getMusikerInnen();
            Iterator<MusikerIn> value = musikerInnen.iterator();

            while(value.hasNext()){

                try {
                    URL url = de.hsos.prog3.team5.ab1.ausgelagert.Probe.class.getResource(value.next().getInstrument().getAudiodatei());
                    StdAudioPlayer player = new SimpleAudioPlayerAdapter();
                    player.einmaligAbspielen(url);
                }
                catch(IOException io){
                    throw new IOException("Probe wird abgebrochen");
                }
            }
        }
    }

    private class Konzert implements Verhalten{

        @Override
        public void spielen(Orchester orchester) throws IOException {
            try {
                URL url = orchester.getAudiodateiKonzert();
                SimpleAudioPlayerAdapter player = new SimpleAudioPlayerAdapter();
                player.einmaligAbspielen(url);
            }
            catch (IOException io){
                throw new IOException("Auftritt wird abgebrochen");
            }
        }
    }

    /*
    Vorteile innerer Klasse:
    - weniger "kleine" Klassen insgesamt
    - wird sowieso von keiner anderen Klasse gebraucht, also fehlende Sichtbarkeit von außen
    kein Problem
    - weniger Methodenaufruf, sondern direkte Zugriffe auf Objektvariablen vom Orchester (Vorteil?)

    Nachteile innere Klasse:
    - Falls wir nochmal andere "Orchester" (Kapelle, Kammerorchester,...) haben wollen,
    die auh proben und auftreten, blöd. Aber da wir das nicht haben und aktuell auch nicht
    vorhaben, -> YAGNI
     */

}
