import javax.sound.sampled.*;
import java.io.*;

public class PlayAudio {

    public void playAudio(String audioFilePath) {
        try {
            // Membuka file suara
            File file = new File(audioFilePath);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

            // Mendapatkan format audio dan informasi
            AudioFormat format = audioStream.getFormat();
            DataLine.Info info = new DataLine.Info(Clip.class, format);

            // Membuat objek Clip dan membuka audio stream
            Clip audioClip = (Clip) AudioSystem.getLine(info);
            audioClip.open(audioStream);

            // Memulai pemutaran suara
            audioClip.start();

            // Menunggu sampai suara selesai diputar
            while (!audioClip.isRunning())
                Thread.sleep(1000);
            while (audioClip.isRunning())
                Thread.sleep(1000);

            // Menutup clip dan audio stream
            audioClip.close();
            audioStream.close();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
