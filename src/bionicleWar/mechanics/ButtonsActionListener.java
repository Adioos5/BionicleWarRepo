package bionicleWar.mechanics;

import bionicleWar.window.GameWindow;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ButtonsActionListener {

    private Button start;
    private Button biopedia;
    private Button quit;
    private Stage stage;
    
    public ButtonsActionListener(Stage stage, Button start, Button biopedia, Button quit) {
        
        this.stage = stage;
        this.start = start;
        this.biopedia = biopedia;
        this.quit = quit;

    }

    public void handleMouseEvent(MouseEvent mevent) {

        SceneChanger changeScene = new SceneChanger(stage);
        
        if (mevent.getSource() == start) {
            stage.setScene(new Scene(changeScene.displayLeaderChoosingWindow()));
            stage.setFullScreen(true);
        }
        if (mevent.getSource() == biopedia) {
            stage.setScene(new Scene(changeScene.displayBiopedia()));
            stage.setFullScreen(true);

        }
        if (mevent.getSource() == quit) {
            System.exit(0);
        }
    }

}
