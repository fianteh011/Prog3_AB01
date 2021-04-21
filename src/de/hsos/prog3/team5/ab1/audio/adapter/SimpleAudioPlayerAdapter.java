package de.hsos.prog3.team5.ab1.audio.adapter;

import de.hsos.prog3.team5.ab1.audio.StdAudioPlayer;
import de.hsos.prog3.audio.SimpleAudioPlayer;

import java.io.IOException;
import java.net.URL;

public class SimpleAudioPlayerAdapter implements StdAudioPlayer {
    private SimpleAudioPlayer player;

    @Override
    public void einmaligAbspielen(URL url) throws IOException {
        player = new SimpleAudioPlayer(url);
        tonAn();
        player.play(0);
    }

    @Override
    public void wiederholtAbspielen(URL url, int wiederholungen) throws IOException {
        player = new SimpleAudioPlayer(url);
        tonAn();
        player.play(wiederholungen);
    }

    @Override
    public void tonAus() {
        player.setDebug(true);
        player.verboseLogging(true);
    }

    @Override
    public void tonAn() {
        player.setDebug(false);
        player.verboseLogging(true);
    }
}
