package ContainerApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ControlsMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("BasicControls.fxml")); // Label/Button/ComboBox/CheckBox
        Parent root = FXMLLoader.load(getClass().getResource("PickerControls.fxml")); // Slider/ColorPicker/DatePicker

        primaryStage.setTitle("JAVA FX Controls !!!");
        primaryStage.setScene(new Scene(root, 1000, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
