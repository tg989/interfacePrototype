package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class ScanAreaController implements Initializable {
    @FXML private AnchorPane background;
    @FXML private TextArea textArea;
    @FXML private ImageView image1;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        background.setStyle("text-area-background: #15C8D8");
        try {
            image1.setImage(new Image(new FileInputStream("images/home.png")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void homePressed(MouseEvent actionEvent) throws Exception {
        Parent homeView = FXMLLoader.load(getClass().getResource("../view/home.fxml"));
        Scene homeScene = new Scene(homeView);
        Stage mainStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        mainStage.setScene(homeScene);
        mainStage.show();
    }

    @FXML
    void scanObjectPressed(ActionEvent actionEvent) throws Exception{
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Scan Object");
        alert.setHeaderText("This button scans the object and stores it. Feature coming soon.");
        alert.showAndWait();
    }

}
