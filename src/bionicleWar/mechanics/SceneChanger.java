package bionicleWar.mechanics;

import bionicleWar.graphics.ImageViews;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class SceneChanger {

    private Pane root;    
    
    private ImageView menuBackground;
    private ImageView leaderChoosingBackground;
    private ImageView tipImage;
    
    private Button start;
    private Button biopedia;
    private Button quit;
    private Button heroFactory;
    private Button matorans;
    private Button crossBreeds;
    private Button brotherhoodOfMakuta;
    
    private ImageViews imageViews;
    private ButtonCreator buttonCreator;
    
    
    public SceneChanger(Stage stage) {
        imageViews= new ImageViews();    
        buttonCreator= new ButtonCreator(stage);
    }
    
    
    public Pane displayMenu() {        

        root = new Pane();
                
        menuBackground = imageViews.getMenuBackground(); 
                
        start = buttonCreator.initButton("start");
        
        biopedia = buttonCreator.initButton("biopedia");

        quit = buttonCreator.initButton("quit");
    
        root.getChildren().add(menuBackground);
        root.getChildren().add(start);
        root.getChildren().add(biopedia);
        root.getChildren().add(quit);
        
        return root;        
    }
    
    public Pane displayLeaderChoosingWindow() {
        
        root = new Pane();
        
        leaderChoosingBackground = imageViews.getLeaderChoosingBackground();
        tipImage = imageViews.getTipImage();
        
        heroFactory = buttonCreator.initButton("heroFactory");
        matorans = buttonCreator.initButton("matorans");
        crossBreeds = buttonCreator.initButton("crossBreeds");
        brotherhoodOfMakuta = buttonCreator.initButton("brotherhoodOfMakuta");
        
        root.getChildren().add(leaderChoosingBackground);
        root.getChildren().add(tipImage);
        root.getChildren().add(heroFactory);
        root.getChildren().add(matorans);
        root.getChildren().add(crossBreeds);
        root.getChildren().add(brotherhoodOfMakuta);
        
        return root;
    }
    
    public Pane displayBiopedia() {
        root = new Pane();
        
        return root;
    }
}
