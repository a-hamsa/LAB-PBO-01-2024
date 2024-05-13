package Sound;

import javax.sound.sampled.*;

public class SoundEffect {
    public static void playSound(String soundPath) {
        try {
            AudioInputStream sound = AudioSystem.getAudioInputStream(SoundEffect.class.getResourceAsStream(soundPath));
            AudioFormat format = sound.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);
            Clip clip = (Clip) AudioSystem.getLine(info);
            clip.open(sound);
            clip.start();
            clip.drain(); 

            sound.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
