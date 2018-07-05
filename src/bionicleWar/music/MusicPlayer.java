package bionicleWar.music;

import java.io.File;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class MusicPlayer {

    private MusicReader musicReader = new MusicReader();

    /**
     * Plays music depending on what song title will be passed to the parameter.
     * 
     * @param String
     *            songTitle
     */
    public void playMusic(String songTitle) {
        JFXPanel panel = new JFXPanel();

        if (songTitle.equals("Menu song")) {

            String songPath = musicReader.getMenuMusicPath();
            Media sound = new Media(new File(songPath).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.setOnEndOfMedia(new Runnable() {

                @Override
                public void run() {
                    mediaPlayer.seek(Duration.ZERO);

                }
            });

            mediaPlayer.play();
        }
    }
}
