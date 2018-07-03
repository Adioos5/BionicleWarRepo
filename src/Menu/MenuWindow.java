package Menu;

import java.io.File;

import javafx.application.Application;
import javafx.embed.swing.JFXPanel;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import logic.Creator;

public class MenuWindow extends Application {

    private Pane root;
    private Button start;
    private Button settings;
    private Button quit;
    private Creator creator;
    private Scene scene;
    private boolean choosingLeader = false;
    
    @Override
    public void start(Stage stage) throws Exception {

        creator = new Creator(root, start, settings, quit);
        if(choosingLeader) {
            scene = new Scene(creator.chooseLeader());
        } else {
            scene = new Scene(creator.createComponents());
            
        }

        stage.setScene(scene);
        stage.setTitle("Bionicle War");
        stage.setResizable(false);
        stage.setFullScreen(true);
        stage.show();
    }

    public void run() {
        JFXPanel panel = new JFXPanel();

        String ssound = "resources/music/Fallout-4-OST-Only-One-Survives-yoodownload.com (1).mp3";
        Media sound = new Media(new File(ssound).toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(sound);

        mediaPlayer.play();
        
        launch(MenuWindow.class);
    }
    
    public void setNewScene(String message) {
        if(message.equals("choosing leader")) {
            choosingLeader = true;
        }
        
    }
}
