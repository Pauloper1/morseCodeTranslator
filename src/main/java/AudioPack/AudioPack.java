package AudioPack;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import sun.audio.AudioStream;
import sun.audio.AudioPlayer;
import javax.swing.JOptionPane;

public class AudioPack {
    public static void playMusic(String filePath){
        System.out.println(filePath);
        InputStream music;
        try {
            music = new FileInputStream(new File(filePath));
            AudioStream audios = new AudioStream(music);
            AudioPlayer.player.start(audios);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null,e);
            System.out.println(e);
        }
    }
}