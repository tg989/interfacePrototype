package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class CanvasTypeController implements Initializable {
    @FXML
    private ImageView image1;
    @FXML
    private ImageView image2;
    @FXML
    private ImageView image3;
    @FXML
    private ImageView image4;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            image1.setImage(new Image(new FileInputStream("images/collaborative_canvas.png")));
            image2.setImage(new Image(new FileInputStream("images/individual_canvas.png")));
            image3.setImage(new Image(new FileInputStream("images/home.png")));
            image4.setImage(new Image(new FileInputStream("images/help.png")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void collaborativeCanvasPressed(ActionEvent actionEvent) throws Exception {
        Parent collaborativeView = FXMLLoader.load(getClass().getResource("../view/collaborative_mode.fxml"));
        Scene collaborativeScene = new Scene(collaborativeView);
        Stage mainStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        mainStage.setScene(collaborativeScene);
        mainStage.show();
    }

    @FXML
    void helpButtonPressed(MouseEvent actionEvent) throws Exception {
        Parent helpView = FXMLLoader.load(getClass().getResource("../view/help.fxml"));
        Scene helpScene = new Scene(helpView);
        Stage mainStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        mainStage.setScene(helpScene);
        mainStage.show();
    }

    @FXML
    void homeButtonPressed(MouseEvent actionEvent) throws Exception {
        Parent homeView = FXMLLoader.load(getClass().getResource("../view/home.fxml"));
        Scene homeScene = new Scene(homeView);
        Stage mainStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        mainStage.setScene(homeScene);
        mainStage.show();
    }

    @FXML
    void individualCanvasPressed(ActionEvent actionEvent) throws Exception {
        Parent individualView = FXMLLoader.load(getClass().getResource("../view/collaborative_mode.fxml"));
        Scene individualScene = new Scene(individualView);
        Stage mainStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        mainStage.setScene(individualScene);
        mainStage.show();
    }
}
