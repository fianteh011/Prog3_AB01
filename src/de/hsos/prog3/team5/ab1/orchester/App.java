package de.hsos.prog3.team5.ab1.orchester;


import java.io.IOException;

public class App {
        public static void main(String[] args) {
                String audioDatei = "/All_Together.wav";
                Orchester orchester = new Orchester("HSOS Titty Twister Orchestra", audioDatei);

                Dirigent karajan = new Dirigent("Karjan");
                orchester.addDirigentIn(karajan);

                MusikerIn trompete = new MusikerIn("Dirk Die Lunge Mueller", Instrument.SAXOPHON);
                MusikerIn akkordion = new MusikerIn("Akki Taste", Instrument.AKKORDION);
                MusikerIn drum = new MusikerIn("Das Biest", Instrument.SCHLAGZEUG);

                orchester.addMusikerIn(trompete);
                orchester.addMusikerIn(akkordion);
                orchester.addMusikerIn(drum);

                orchester.proben(orchester);
                try {
                        orchester.spielen();
                } catch (IOException e) {
                        e.printStackTrace();
                }

                orchester.auftreten(orchester);

                try {
                        orchester.spielen();
                } catch (IOException e) {
                        e.printStackTrace();
                }
        }
}

