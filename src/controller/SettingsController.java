package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

public class SettingsController implements Initializable {
    @FXML private ImageView homeImage;
    @FXML private Slider touchSensitivitySlider;
    @FXML private Slider screenSensitivitySlider;
    @FXML private Slider iconSizeSlider;
    @FXML private Slider brightnessSlider;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        touchSensitivitySlider.setValue(40.0);
        screenSensitivitySlider.setValue(40.0);
        iconSizeSlider.setValue(40.0);
        brightnessSlider.setValue(40.0);
        try {
            homeImage.setImage(new Image(new FileInputStream("images/home.png")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML

    //When settings button is pressed, a save prompt it issued
    void saveSettingsPressed(ActionEvent actionEvent) throws Exception{
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Save");
        alert.setHeaderText("Are you sure you want to save?");

        Optional<ButtonType> result = alert.showAndWait();

        if(result.isPresent() && result.get() == ButtonType.OK){
            Parent homeView = FXMLLoader.load(getClass().getResource("../view/home.fxml"));
            Scene homeScene = new Scene(homeView);
            Stage mainStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            mainStage.setScene(homeScene);
            mainStage.show();
        }
    }

    @FXML
    void homeButtonPressed(MouseEvent actionEvent) throws Exception {
        Parent homeView = FXMLLoader.load(getClass().getResource("../view/home.fxml"));
        Scene homeScene = new Scene(homeView);
        Stage mainStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        mainStage.setScene(homeScene);
        mainStage.show();
    }

}
