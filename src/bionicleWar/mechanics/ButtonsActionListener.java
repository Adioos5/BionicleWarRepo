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

    /**
     * Handles mouse events sent on button click. Depending on which button user
     * chooses, this method sets specified scene for the primary stage.
     * 
     * @param mevent
     *           
     */
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
