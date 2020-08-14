package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ChangeBackgroundController implements Initializable {
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
    }
    public void addStyleClasses(){
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
    void backgroundChosen(MouseEvent actionEvent) throws Exception {
        Stage mainStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        mainStage.hide();
    }

    @FXML
    void backgroundPressed2(MouseEvent actionEvent) throws Exception {
        Stage mainStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        mainStage.hide();
    }
}
