package de.hsos.prog3.team5.ab1.audio;

import de.hsos.prog3.team5.ab1.audio.adapter.SimpleAudioPlayerAdapter;

import java.io.IOException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        // write your code here
        URL url = Main.class.getResource("/Baritone.wav");
        SimpleAudioPlayerAdapter player = new SimpleAudioPlayerAdapter();

        //set ton aus
        player.tonAus();

        //play one_time song
        player.einmaligAbspielen(url);

        //play more_times song
        player.wiederholtAbspielen(url, 1);


    }
}
