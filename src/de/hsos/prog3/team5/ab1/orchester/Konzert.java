package de.hsos.prog3.team5.ab1.orchester;

import de.hsos.prog3.team5.ab1.audio.adapter.SimpleAudioPlayerAdapter;

import java.io.IOException;
import java.net.URL;

public class Konzert implements Verhalten {

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
