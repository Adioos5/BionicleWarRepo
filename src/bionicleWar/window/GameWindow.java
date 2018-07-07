package bionicleWar.window;

import bionicleWar.mechanics.RootModifier;
import bionicleWar.music.MusicPlayer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class GameWindow extends Application {

    
    private RootModifier modifyRoot;             
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
        modifyRoot = new RootModifier(stage);
        root = new Pane();
        
        modifyRoot.displayMenu(root);
        scene = new Scene(root);

        stage.setScene(scene);
        stage.setFullScreen(true);
        stage.setTitle("Bionicle War");
        stage.setResizable(false);
        
        stage.show();
    }

}
