package controller;

import com.sun.tools.javac.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import java.io.IOException;
import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.scene.input.MouseEvent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class HomeController implements Initializable {
    @FXML private ImageView image1;
    @FXML private ImageView image2;
    @FXML private ImageView image3;
    @FXML private ImageView image4;
    @FXML private ImageView image5;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            image1.setImage(new Image(new FileInputStream("images/scan_object.png")));
            image2.setImage(new Image(new FileInputStream("images/start_new_canvas.png")));
            image3.setImage(new Image(new FileInputStream("images/load_saved_canvas.png")));
            image4.setImage(new Image(new FileInputStream("images/setttings.png")));
            image5.setImage(new Image(new FileInputStream("images/help.png")));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    //Scan object page
    @FXML
    public void scanObjectButton(ActionEvent actionEvent) throws Exception {
        Parent scanView = FXMLLoader.load(getClass().getResource("../view/scan_area.fxml"));
        Scene scanScene = new Scene(scanView);
        Stage mainStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        mainStage.setScene(scanScene);
        mainStage.show();

    }

    //Canvas Load menu
    @FXML
    void canvasLoad(ActionEvent actionEvent) throws Exception {
        Parent loadView = FXMLLoader.load(getClass().getResource("../view/canvas_load.fxml"));
        Scene loadScene = new Scene(loadView);
        Stage mainStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        mainStage.setScene(loadScene);
        mainStage.show();
    }

    //Help Page
    @FXML
    void helpPressed(MouseEvent actionEvent) throws Exception {
        Parent helpView = FXMLLoader.load(getClass().getResource("../view/help.fxml"));
        Scene helpScene = new Scene(helpView);
        Stage mainStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        mainStage.setScene(helpScene);
        mainStage.show();
    }

    //New canvas select screen
    @FXML
    void newCanvas(ActionEvent actionEvent) throws Exception {
        Parent newCanvasView = FXMLLoader.load(getClass().getResource("../view/canvas_type.fxml"));
        Scene newCanvasScene = new Scene(newCanvasView);
        Stage mainStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        mainStage.setScene(newCanvasScene);
        mainStage.show();
    }

    //Settings area
    @FXML
    void settingsPressed(MouseEvent actionEvent) throws Exception {
        Parent newCanvasView = FXMLLoader.load(getClass().getResource("../view/settings.fxml"));
        Scene newCanvasScene = new Scene(newCanvasView);
        Stage mainStage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        mainStage.setScene(newCanvasScene);
        mainStage.show();
    }


}
