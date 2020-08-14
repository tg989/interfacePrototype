package controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class CollaborativeModeController implements Initializable {
    @FXML private ImageView image1;
    @FXML private ImageView image2;
    @FXML private ImageView image3;
    @FXML private ImageView image4;
    @FXML private ImageView image5;
    @FXML private ImageView image6;
    @FXML private ImageView image7;
    @FXML private ImageView image8;

    @FXML private Pane pane1;
    @FXML private Pane pane2;
    @FXML private Pane pane3;
    @FXML private Pane pane4;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        pickPanes();
        try {
            image1.setImage(new Image(new FileInputStream("images/change_background.png")));
            image2.setImage(new Image(new FileInputStream("images/random_icon_line1.png")));
            image3.setImage(new Image(new FileInputStream("images/cut_tool_straight.png")));
            image4.setImage(new Image(new FileInputStream("images/erase_tool_straight.png")));
            image5.setImage(new Image(new FileInputStream("images/cut_tool_straight.png")));
            image6.setImage(new Image(new FileInputStream("images/erase_tool_straight.png")));
            image7.setImage(new Image(new FileInputStream("images/home.png")));
            image8.setImage(new Image(new FileInputStream("images/random_icon_line2.png")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void pickPanes(){
        pane1.getStyleClass().add("pane1");
        pane2.getStyleClass().add("pane2");
        pane3.getStyleClass().add("pane3");
        pane4.getStyleClass().add("pane4");
    }


    @FXML
    void HomePressed(MouseEvent event) {

    }

    @FXML
    void backgroundPressed(MouseEvent actionEvent) throws Exception {
        Parent backgroundView = FXMLLoader.load(getClass().getResource("../view/change_background.fxml"));
        Stage newStage = new Stage();

        newStage.setScene(new Scene(backgroundView, 800, 600));
        newStage.show();
    }

    @FXML
    void homePressed(MouseEvent actionEvent) throws Exception  {
        ButtonType yes = new ButtonType("Yes", ButtonBar.ButtonData.YES);
        ButtonType no = new ButtonType("No", ButtonBar.ButtonData.NO);
        Alert alert = new Alert(Alert.AlertType.WARNING, "Do you want to save your canvas?", yes, no);
        alert.setTitle("Save Canvas?");
        alert.setHeaderText("Canvas Save");

        Optional<ButtonType> result = alert.showAndWait();

        //If the user selects ok, the canvas is saved and they are returned home
        if(result.isPresent() && result.get() == ButtonType.YES){
            Parent homeView = FXMLLoader.load(getClass().getResource("../view/home.fxml"));
            Scene homeScene = new Scene(homeView);
            Stage mainStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
            mainStage.setScene(homeScene);
            mainStage.show();
        }
        //If the user selects Cancel, the canvas is not saved and they are returned home
        else {
            Parent homeView = FXMLLoader.load(getClass().getResource("../view/home.fxml"));
            Scene homeScene = new Scene(homeView);
            Stage mainStage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
            mainStage.setScene(homeScene);
            mainStage.show();
        }
    }
}
