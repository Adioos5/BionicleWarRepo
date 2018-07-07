package bionicleWar.mechanics;

import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ButtonsActionListener {

    private Button start;
    private Button biopedia;
    private Button quit;
    private Button backL;
    
    private Stage stage;

    public ButtonsActionListener(Stage stage, Button start, Button biopedia, Button quit, Button backL) {

        this.stage = stage;
        this.start = start;
        this.biopedia = biopedia;
        this.quit = quit;
        this.backL = backL;

    }

    /**
     * Handles mouse events sent on button click. Depending on which button user
     * chooses, this method sets specified scene for the primary stage.
     * 
     * @param mevent
     *           
     */
    public void handleMouseEvent(MouseEvent mevent) {

        RootModifier modifyRoot = new RootModifier(stage);
        
        if (mevent.getSource() == start) {    
            modifyRoot.displayLeaderChoosingWindow((Pane) stage.getScene().getRoot());           
        }
        if (mevent.getSource() == biopedia) {
            modifyRoot.displayBiopedia((Pane) stage.getScene().getRoot());  
        }
        if (mevent.getSource() == quit) {
            System.exit(0);
        }
        if (mevent.getSource() == backL) {
            modifyRoot.displayMenu((Pane) stage.getScene().getRoot());            
        }
     
    }

}
