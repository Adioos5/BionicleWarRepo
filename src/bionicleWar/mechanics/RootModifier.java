package bionicleWar.mechanics;

import bionicleWar.graphics.ImageViews;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class RootModifier {

    private ImageView menuBackground;
    private ImageView leaderChoosingBackground;
    private ImageView tipImage;
    
    private Button backL;
    private Button start;
    private Button biopedia;
    private Button quit;
    private Button heroFactory;
    private Button matorans;
    private Button crossBreeds;
    private Button brotherhoodOfMakuta;

    private ImageViews imageViews;
    private ButtonCreator buttonCreator;

    public RootModifier(Stage stage) {
        imageViews = new ImageViews();
        buttonCreator = new ButtonCreator(stage);
    }

    /**
     * Displays game menu by adding needed resources to the root.
     * 
     * @return root
     */
    public void displayMenu(Pane root) {

        root.getChildren().clear();
        
        menuBackground = imageViews.getMenuBackground();

        start = buttonCreator.initButton("start");

        biopedia = buttonCreator.initButton("biopedia");

        quit = buttonCreator.initButton("quit");

        root.getChildren().add(menuBackground);
        root.getChildren().add(start);
        root.getChildren().add(biopedia);
        root.getChildren().add(quit);
        
    }

    /**
     * Displays leader choosing window by adding needed resources to the root.
     * 
     * @return root
     */
    public void displayLeaderChoosingWindow(Pane root) {        
        
        root.getChildren().clear();
        
        leaderChoosingBackground = imageViews.getLeaderChoosingBackground();
        tipImage = imageViews.getTipImage();

        backL = buttonCreator.initButton("backL");
        heroFactory = buttonCreator.initButton("heroFactory");
        matorans = buttonCreator.initButton("matorans");
        crossBreeds = buttonCreator.initButton("crossBreeds");
        brotherhoodOfMakuta = buttonCreator.initButton("brotherhoodOfMakuta");

        root.getChildren().add(leaderChoosingBackground);
        root.getChildren().add(tipImage);
        root.getChildren().add(backL);
        root.getChildren().add(heroFactory);
        root.getChildren().add(matorans);
        root.getChildren().add(crossBreeds);
        root.getChildren().add(brotherhoodOfMakuta);

        
    }

    /**
     * Displays biopedia by adding needed resources to the root.
     * 
     * @return root
     */
    public void displayBiopedia(Pane root) {
        
        root.getChildren().clear();

        
    }
}
