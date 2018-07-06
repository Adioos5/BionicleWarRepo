package bionicleWar.window;

import bionicleWar.mechanics.SceneChanger;
import bionicleWar.music.MusicPlayer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GameWindow extends Application {

    
    private SceneChanger changeRoot;             

    private Scene scene;

    /**
     * Opens game window and starts playing music.
     */
    public void run() {

        MusicPlayer musicPlayer = new MusicPlayer();
        musicPlayer.randomMusic();

        launch(GameWindow.class);
    }

    @Override
    public void start(Stage stage) throws Exception {
        changeRoot = new SceneChanger(stage); 
        
        scene = new Scene(changeRoot.displayMenu());

        stage.setScene(scene);
        
        stage.setTitle("Bionicle War");
        stage.setResizable(false);
        stage.setFullScreen(true);
        stage.show();
    }

}
