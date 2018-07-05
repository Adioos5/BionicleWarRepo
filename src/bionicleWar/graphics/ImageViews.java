package bionicleWar.graphics;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImageViews {
    private ImageReader imageReader = new ImageReader();
    private ImageView menuBackground;
    private ImageView leaderChoosingBackground;
    private ImageView tipImage;
    /**
     * 
     * @return ImageView menuBackground
     */
    public ImageView getMenuBackground() {

        menuBackground = new ImageView(new Image(imageReader.getMenuBackgroundPath()));
        menuBackground.setX(0);
        menuBackground.setY(0);
        menuBackground.setFitWidth(1370);
        menuBackground.setFitHeight(800);
        
        return menuBackground;
    }
    /**
     * 
     * @return ImageView leaderChoosingBackground
     */
    public ImageView getLeaderChoosingBackground() {
        leaderChoosingBackground = new ImageView(new Image(imageReader.getLeaderChoosingWindowBackgroundPath()));
        leaderChoosingBackground.setX(0);
        leaderChoosingBackground.setY(0);
        leaderChoosingBackground.setFitWidth(1370);
        leaderChoosingBackground.setFitHeight(800);
        
        return leaderChoosingBackground;
    }
    /**
     * 
     * @return ImageView tipImage
     */
    public ImageView getTipImage() {
        tipImage = new ImageView(new Image(imageReader.getTipBarPath()));
        tipImage.setX(0);
        tipImage.setY(670);
        tipImage.setFitWidth(1370);
        tipImage.setFitHeight(100);
        
        return tipImage;
    }
}
