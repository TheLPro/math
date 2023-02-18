package me.thelpro.math.utils;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Audio {

    public static void main(String[] args) throws UnsupportedAudioFileException, LineUnavailableException, IOException, InterruptedException {
        playSound();
    }

    public static void playSound() throws LineUnavailableException, IOException, UnsupportedAudioFileException, InterruptedException {
        File f = new File("/Users/28potocki_l/Desktop/MavenTest/sounds/town-10169.wav");
        AudioInputStream audioIn = AudioSystem.getAudioInputStream(f.toURI().toURL());
        Clip clip = AudioSystem.getClip();
        clip.open(audioIn);
        clip.start();
        TimeUnit.SECONDS.sleep(100);
    }
}