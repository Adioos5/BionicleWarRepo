package logic;

import Menu.MenuWindow;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

public class Creator {

    private Pane root;

    private Image mataNui = new Image("images/MataNui.jpg");
    private Image mataNuis = new Image("images/leaderChoosingImage.jpg");
    private Image tipImg = new Image("images/tip.png");
    
    private Button start;
    private Button biopedia;
    private Button quit;
    private ImageView menuBackground;
    
    public Creator(Pane root, Button start, Button settings, Button quit) {
        this.root = root;

    }

    public void createComponents() {

        root = new Pane();

        // Background
        menuBackground = new ImageView(mataNui);
        menuBackground.setX(0);
        menuBackground.setY(0);
        menuBackground.setFitWidth(1370);
        menuBackground.setFitHeight(800);

        // start button
        start = new Button();
        start.setStyle("-fx-background-image: url(images/start.png)");
        start.setTranslateX(160);
        start.setTranslateY(500);
        start.setPrefWidth(250);
        start.setPrefHeight(150);

        start.setOnMouseClicked(event -> {
            handleMouseEvent(event);
        });

        // biopedia button
        biopedia = new Button();
        biopedia.setStyle("-fx-background-image: url(images/biopedia.png)");
        biopedia.setTranslateX(560);
        biopedia.setTranslateY(500);
        biopedia.setPrefWidth(250);
        biopedia.setPrefHeight(150);

        biopedia.setOnMouseClicked(event -> {
            handleMouseEvent(event);
        });

        // quit button
        quit = new Button();
        quit.setStyle("-fx-background-image: url(images/quit.png)");
        quit.setTranslateX(960);
        quit.setTranslateY(500);
        quit.setPrefWidth(250);
        quit.setPrefHeight(150);

        quit.setOnMouseClicked(event -> {
            handleMouseEvent(event);
        });
        

    }
    
    public Pane displayMenu() {
        createComponents();                
        
        root.getChildren().add(menuBackground);
        root.getChildren().add(start);
        root.getChildren().add(biopedia);
        root.getChildren().add(quit);
        
        return root;
    }
    
    public void displayLeaderChoosing() {
      
        //background
        ImageView leaderChoosingImage = new ImageView(mataNuis);
        leaderChoosingImage.setX(0);
        leaderChoosingImage.setY(0);
        leaderChoosingImage.setFitWidth(1370);
        leaderChoosingImage.setFitHeight(800);
        
        //tip
        ImageView tip = new ImageView(tipImg);
        tip.setX(0);
        tip.setY(670);
        tip.setFitWidth(1370);
        tip.setFitHeight(100);
        
        //buttons
        Button heroFactory = new Button();
        //matorans.setStyle("-fx-background-image: url(images/quit.png)");
        heroFactory.setTranslateX(0);
        heroFactory.setTranslateY(30);
        heroFactory.setPrefWidth(300);
        heroFactory.setPrefHeight(550);

        Button matorans = new Button();
        //matorans.setStyle("-fx-background-image: url(images/quit.png)");
        matorans.setTranslateX(360);
        matorans.setTranslateY(30);
        matorans.setPrefWidth(300);
        matorans.setPrefHeight(550);       
        
        Button crossBreeds = new Button();
        //matorans.setStyle("-fx-background-image: url(images/quit.png)");
        crossBreeds.setTranslateX(720);
        crossBreeds.setTranslateY(30);
        crossBreeds.setPrefWidth(300);
        crossBreeds.setPrefHeight(550);
        
        Button brotherhoodOfMakuta = new Button();
        //matorans.setStyle("-fx-background-image: url(images/quit.png)");
        brotherhoodOfMakuta.setTranslateX(1080);
        brotherhoodOfMakuta.setTranslateY(30);
        brotherhoodOfMakuta.setPrefWidth(300);
        brotherhoodOfMakuta.setPrefHeight(550);
        
        root.getChildren().clear();
        root.getChildren().add(leaderChoosingImage);
        root.getChildren().add(tip);
        root.getChildren().add(heroFactory);
        root.getChildren().add(matorans);
        root.getChildren().add(crossBreeds);
        root.getChildren().add(brotherhoodOfMakuta);
    }
    
    public void displayBiopedia() {
        root.getChildren().clear();
        
    }
    private void handleMouseEvent(MouseEvent mevent) {
        if (mevent.getSource() == start) {
            displayLeaderChoosing();
        }
        if (mevent.getSource() == biopedia) {
            displayBiopedia();
        }
        if (mevent.getSource() == quit) {
            System.exit(0);
        }

    }

}
