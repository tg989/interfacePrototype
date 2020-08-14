package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class CanvasLoadController implements Initializable {
    @FXML private ImageView image1;
    @FXML private ImageView image2;
    @FXML private ImageView image3;
    @FXML private ImageView image4;


    @FXML private Pane mainPane;
    @FXML private Pane pane1;
    @FXML private Pane pane2;
    @FXML private Pane pane3;
    @FXML private Pane pane4;
    @FXML private Pane pane5;
    @FXML private Pane pane6;
    @FXML private Pane pane7;
    @FXML private Pane pane8;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
       addStyleClasses();
        try {
            image1.setImage(new Image(new FileInputStream("images/collaborative_indicator.png")));
            image2.setImage(new Image(new FileInputStream("images/individual_indicator.png")));
            image3.setImage(new Image(new FileInputStream("images/home.png")));
            image4.setImage(new Image(new FileInputStream("images/help.png")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addStyleClasses(){
        mainPane.getStyleClass().add("mainPane");
        pane1.getStyleClass().add("pane1");
        pane2.getStyleClass().add("pane2");
        pane3.getStyleClass().add("pane3");
        pane4.getStyleClass().add("pane4");
        pane5.getStyleClass().add("pane5");
        pane6.getStyleClass().add("pane6");
        pane7.getStyleClass().add("pane7");
        pane8.getStyleClass().add("pane8");
    }


    @FXML
    void helpPressed(MouseEvent actionEvent) throws Exception {
        Parent helpView = FXMLLoader.load(getClass().getResource("../view/help.fxml"));
        Scene helpScene = new Scene(helpView);
        Stage mainStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        mainStage.setScene(helpScene);
        mainStage.show();
    }

    @FXML
    void homePressed(MouseEvent actionEvent) throws Exception {
        Parent homeView = FXMLLoader.load(getClass().getResource("../view/home.fxml"));
        Scene homeScene = new Scene(homeView);
        Stage mainStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        mainStage.setScene(homeScene);
        mainStage.show();
    }

}
