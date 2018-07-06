package bionicleWar.mechanics;

import bionicleWar.graphics.ImageReader;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class ButtonCreator {

    private Button start= new Button();
    private Button biopedia= new Button();
    private Button quit= new Button();
    private Button heroFactory= new Button();
    private Button matorans= new Button();
    private Button crossBreeds= new Button();
    private Button brotherhoodOfMakuta= new Button();
    private Button backL= new Button();
    
    private ButtonsActionListener buttonActionListener;
    private ImageReader imageReader;
    
    public ButtonCreator(Stage stage) {
        buttonActionListener= new ButtonsActionListener(stage, start, biopedia, quit, backL);
        imageReader= new ImageReader();
    }

    /**
     * Initializes button depending on what button text will be passed to the parameter.
     * @param buttonText
     * @return button
     */
    
    public Button initButton(String buttonText) {

        if (buttonText.equals("start")) {
            start.setStyle("-fx-background-image: url(images/start.png)");
            start.setTranslateX(160);
            start.setTranslateY(500);
            start.setPrefWidth(250);
            start.setPrefHeight(150);

            start.setOnMouseClicked(event -> {
                buttonActionListener.handleMouseEvent(event);
            });
            return start;
        }
        if (buttonText.equals("biopedia")) {
            biopedia.setStyle("-fx-background-image: url(images/biopedia.png)");
            biopedia.setTranslateX(560);
            biopedia.setTranslateY(500);
            biopedia.setPrefWidth(250);
            biopedia.setPrefHeight(150);
            
            biopedia.setOnMouseClicked(event -> {
                buttonActionListener.handleMouseEvent(event);
            });
            return biopedia;
        }
        if (buttonText.equals("quit")) {
            quit.setStyle("-fx-background-image: url(images/quit.png)");
            quit.setTranslateX(960);
            quit.setTranslateY(500);
            quit.setPrefWidth(250);
            quit.setPrefHeight(150);

            quit.setOnMouseClicked(event -> {
                buttonActionListener.handleMouseEvent(event);
            });
            return quit;
        }
        if (buttonText.equals("heroFactory")) {
            heroFactory.setStyle("-fx-background-image: url("+imageReader.getHeroFactoryLeaderImagePath()+")");
            heroFactory.setTranslateX(0);
            heroFactory.setTranslateY(30);
            heroFactory.setPrefWidth(300);
            heroFactory.setPrefHeight(550);

            return heroFactory;
        }
        if (buttonText.equals("matorans")) {
            matorans.setStyle("-fx-background-image: url("+imageReader.getMatoransLeaderImagePath()+")");
            matorans.setTranslateX(360);
            matorans.setTranslateY(30);
            matorans.setPrefWidth(300);
            matorans.setPrefHeight(550); 

            return matorans;
        }
        if (buttonText.equals("crossBreeds")) {
            crossBreeds.setStyle("-fx-background-image: url("+imageReader.getCrossbreedsLeaderImagePath()+")");
            crossBreeds.setTranslateX(720);
            crossBreeds.setTranslateY(30);
            crossBreeds.setPrefWidth(300);
            crossBreeds.setPrefHeight(550);

           
            return crossBreeds;
        }
        if (buttonText.equals("brotherhoodOfMakuta")) {
            brotherhoodOfMakuta.setStyle("-fx-background-image: url("+imageReader.getTheBrotherHoodOfMakutaLeaderImagePath()+")");
            brotherhoodOfMakuta.setTranslateX(1080);
            brotherhoodOfMakuta.setTranslateY(30);
            brotherhoodOfMakuta.setPrefWidth(300);
            brotherhoodOfMakuta.setPrefHeight(550);

            
            return brotherhoodOfMakuta;
        }
        if (buttonText.equals("backL")) {
            backL.setStyle("-fx-background-image: url("+imageReader.getBackLPath()+")");
            backL.setTranslateX(0);
            backL.setTranslateY(670);
            backL.setPrefWidth(200);
            backL.setPrefHeight(100);

            backL.setOnMouseClicked(event -> {
                buttonActionListener.handleMouseEvent(event);
            });
            
            return backL;
        }
        
        return null;

    }

}
