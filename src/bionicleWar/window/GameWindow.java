package bionicleWar.window;

import bionicleWar.mechanics.SceneChanger;
import bionicleWar.music.MusicPlayer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GameWindow extends Application {

    
    private SceneChanger changeScene;             
    private Pane root;
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
        changeScene = new SceneChanger(stage); 
        root = new Pane();
        changeScene.displayMenu(root);
        scene = new Scene(root);

        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.setTitle("Bionicle War");
        stage.setResizable(false);
        
        stage.show();
    }

}
