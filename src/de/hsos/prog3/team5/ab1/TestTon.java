package de.hsos.prog3.team5.ab1;


import de.hsos.prog3.audio.SimpleAudioPlayer;

import java.io.IOException;
import java.net.URL;

public class TestTon {
    public static void main(String[] args) throws IOException {
        // write your code here
        URL url = TestTon.class.getResource("/Baritone.wav");
        SimpleAudioPlayer player = new SimpleAudioPlayer(url);
        //ton anmachen
        player.setDebug(false);
        //rückmeldung ausgeben
        player.verboseLogging(true);
        //wiederholung
        player.play(0);
    }
}
