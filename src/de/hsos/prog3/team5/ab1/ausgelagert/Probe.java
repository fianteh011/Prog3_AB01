package de.hsos.prog3.team5.ab1.ausgelagert;

import de.hsos.prog3.team5.ab1.audio.StdAudioPlayer;
import de.hsos.prog3.team5.ab1.audio.adapter.SimpleAudioPlayerAdapter;
import de.hsos.prog3.team5.ab1.orchester.MusikerIn;
import de.hsos.prog3.team5.ab1.orchester.Orchester;
import de.hsos.prog3.team5.ab1.orchester.Verhalten;

import java.io.IOException;
import java.net.URL;
import java.util.HashSet;
import java.util.Iterator;

public class Probe implements Verhalten {

    @Override
    public void spielen(Orchester orchester) throws IOException {
        HashSet<MusikerIn> musikerInnen = orchester.getMusikerInnen();

        Iterator<MusikerIn> value = musikerInnen.iterator();

        while(value.hasNext()){

            try {
                MusikerIn tmp = value.next();
                String audio = tmp.getInstrument().getAudiodatei();
                URL url = Probe.class.getResource(audio);
                StdAudioPlayer player = new SimpleAudioPlayerAdapter();
                player.einmaligAbspielen(url);
            }

            catch(IOException io){
                throw new IOException("Probe wird abgebrochen");
            }
        }
    }
}
