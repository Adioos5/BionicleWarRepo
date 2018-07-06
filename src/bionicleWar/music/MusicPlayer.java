package bionicleWar.music;

import java.io.File;

import javafx.embed.swing.JFXPanel;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class MusicPlayer {

    private MusicReader musicReader = new MusicReader();

    /**
     * Chooses which song will be played using Math.random() method.
     */
    public void randomMusic() {
        int number = (int) (Math.random() * 10);
        
        if (number == 1 || number == 2) {
            playMusic("Only One Survives");
        }        
        if (number == 3 || number == 4) {
            playMusic("Escalation");
        }
        if (number == 5 || number == 6) {
            playMusic("Matoran Enclave");
        }
        if (number == 7 || number == 8) {
            playMusic("All Who Follow");
        }
        if (number == 9 || number == 0) {
            playMusic("Friends In High Places");
        }
    }

    /**
     * Plays music depending on what song title will be passed to the parameter.
     * 
     * @param String
     *            songTitle
     */
    private void playMusic(String songTitle) {
        JFXPanel panel = new JFXPanel();

        if (songTitle.equals("Only One Survives")) {

            String songPath = musicReader.getOnlyOneSurvivesPath();
            Media sound = new Media(new File(songPath).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.setOnEndOfMedia(new Runnable() {

                @Override
                public void run() {
                    randomMusic();

                }
            });

            mediaPlayer.play();
        }
        
        if (songTitle.equals("Escalation")) {

            String songPath = musicReader.getEscalationPath();
            Media sound = new Media(new File(songPath).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.setOnEndOfMedia(new Runnable() {

                @Override
                public void run() {
                    randomMusic();

                }
            });

            mediaPlayer.play();
        }
        
        if (songTitle.equals("Matoran Enclave")) {

            String songPath = musicReader.getMatoranEnclavePath();
            Media sound = new Media(new File(songPath).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.setOnEndOfMedia(new Runnable() {

                @Override
                public void run() {
                    randomMusic();

                }
            });

            mediaPlayer.play();
        }
        
        if (songTitle.equals("All Who Follow")) {

            String songPath = musicReader.getAllWhoFollowPath();
            Media sound = new Media(new File(songPath).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.setOnEndOfMedia(new Runnable() {

                @Override
                public void run() {
                    randomMusic();

                }
            });

            mediaPlayer.play();
        }
        
        if (songTitle.equals("Friends In High Places")) {

            String songPath = musicReader.getFriendsInHighPlacesPath();
            Media sound = new Media(new File(songPath).toURI().toString());
            MediaPlayer mediaPlayer = new MediaPlayer(sound);
            mediaPlayer.setOnEndOfMedia(new Runnable() {

                @Override
                public void run() {
                    randomMusic();

                }
            });

            mediaPlayer.play();
        }
    }
}
