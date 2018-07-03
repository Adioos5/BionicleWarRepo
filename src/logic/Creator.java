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
    private Pane chooseLeaderRoot;
    
    private Image mataNui = new Image("images/MataNui.jpg");
    private Button start;
    private Button biopedia;
    private Button quit;
    
    public Creator(Pane root, Button start, Button settings, Button quit) {
        this.root = root;

    }

    public Parent createComponents() {
        root = new Pane();

        // Background
        ImageView iv = new ImageView(mataNui);
        iv.setX(0);
        iv.setY(0);
        iv.setFitWidth(1370);
        iv.setFitHeight(800);

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

        root.getChildren().add(iv);
        root.getChildren().add(start);
        root.getChildren().add(biopedia);
        root.getChildren().add(quit);

        return root;
    }
    public Pane chooseLeader() {
        Pane root = new Pane();
        return root;
    }
    

    private void handleMouseEvent(MouseEvent mevent) {
        if (mevent.getSource() == start) {
           root.getChildren().clear();
        }
        if (mevent.getSource() == biopedia) {
            root.getChildren().clear();
        }
        if (mevent.getSource() == quit) {
            System.exit(0);
        }

    }

}
