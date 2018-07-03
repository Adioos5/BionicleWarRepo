package logic;

import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class Creator {

    private Pane root;
   
    private Image mataNui = new Image("images/MataNui.jpg");
    private Image start = new Image("images/start.png");
    private Image biopedia = new Image("images/biopedia.png");
    private Image quit = new Image("images/quit.png");
    
    /**
     * This class creates all elements needed for windows.
     * @param root
     * @param start
     * @param settings
     * @param quit
     */
    public Creator(Pane root, Button start, Button settings, Button quit) {
        this.root = root;
       
    }
    /**
     * This method creates components like root and initializes buttons.
     * 
     * @return root
     */
    public Parent createComponents() {
        
        root = new Pane();
        
        //Background
        ImageView iv = new ImageView(mataNui);
        iv.setX(0);
        iv.setY(0);
        iv.setFitWidth(1370);
        iv.setFitHeight(800);
        
        //start button
        Button start = new Button();
        start.setStyle("-fx-background-image: url(images/start.png)");
        start.setTranslateX(160);
        start.setTranslateY(500);
        start.setPrefWidth(250);
        start.setPrefHeight(150);
        start.setOnMouseClicked(event ->{
            System.out.println("Start");
        });
        
        //biopedia button
        Button biopedia = new Button();
        biopedia.setStyle("-fx-background-image: url(images/biopedia.png)");
        biopedia.setTranslateX(560);
        biopedia.setTranslateY(500);
        biopedia.setPrefWidth(250);
        biopedia.setPrefHeight(150);
        biopedia.setOnMouseClicked(event ->{
            System.out.println("Biopedia");
        });
        
        //quit button
        Button quit = new Button();
        quit.setStyle("-fx-background-image: url(images/quit.png)");
        quit.setTranslateX(960);
        quit.setTranslateY(500);
        quit.setPrefWidth(250);
        quit.setPrefHeight(150);
        quit.setOnMouseClicked(event ->{
            System.out.println("Quit");
        });
        
        root.getChildren().add(iv);
        root.getChildren().add(start);
        root.getChildren().add(biopedia);
        root.getChildren().add(quit);
        
        return root;
    }
    
    
}
