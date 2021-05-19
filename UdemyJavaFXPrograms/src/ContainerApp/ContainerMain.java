package ContainerApp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ContainerMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
//        Parent root = FXMLLoader.load(getClass().getResource("HelloWorld.fxml")); // Hello World Label
//        Parent root = FXMLLoader.load(getClass().getResource("ContainerGridPane.fxml")); // Grid with row and column
//        Parent root = FXMLLoader.load(getClass().getResource("ContainerHBox.fxml")); // HBox with buttons
//        Parent root = FXMLLoader.load(getClass().getResource("ContainerVBox.fxml")); // VBox with buttons
//        Parent root = FXMLLoader.load(getClass().getResource("ContainerBorderPane.fxml")); // BorderPane with buttons
//        Parent root = FXMLLoader.load(getClass().getResource("ContainerFlowPane.fxml")); // FlowPane with buttons
//        Parent root = FXMLLoader.load(getClass().getResource("ContainerTilePane.fxml")); // TilePane with buttons
        Parent root = FXMLLoader.load(getClass().getResource("ContainerStackPane.fxml")); // StackPane with buttons

//        GridPane root = new GridPane();
//        root.setAlignment(Pos.CENTER);
//        root.setVgap(10);
//        root.setHgap(10);
//
//        Label greeting = new Label("Welcome to Java FX first program!!!");
//        greeting.setTextFill(Color.GREEN);
//        greeting.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 50));
//        root.getChildren().add(greeting);

        primaryStage.setTitle("Hello JAVA FX By Keshav !!!");
        primaryStage.setScene(new Scene(root, 500, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
