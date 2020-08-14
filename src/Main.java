import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("view/home.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("view/canvas_type.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("view/change_background.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("view/collaborative_mode.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("view/help.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("view/individual_mode.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("view/save_canvas.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("view/scan_area.fxml"));
        //Parent root = FXMLLoader.load(getClass().getResource("view/settings.fxml"));
        primaryStage.setTitle("Home Screen");
        primaryStage.setScene(new Scene(root, 800, 600));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
