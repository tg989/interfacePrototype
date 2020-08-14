package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelpController implements Initializable {
    @FXML private ImageView imageView1;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            imageView1.setImage(new Image(new FileInputStream("images/home.png")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void HomePressed(MouseEvent actionEvent) throws Exception {
        Parent homeView = FXMLLoader.load(getClass().getResource("../view/home.fxml"));
        Scene homeScene = new Scene(homeView);
        Stage mainStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        mainStage.setScene(homeScene);
        mainStage.show();
    }

}
