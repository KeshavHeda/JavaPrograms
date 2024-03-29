package com.keshav.styled;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppMain extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainwindow.fxml"));
//        setUserAgentStylesheet(STYLESHEET_CASPIAN);
        setUserAgentStylesheet(STYLESHEET_MODENA);
        primaryStage.setTitle("Style Check");
        primaryStage.setScene(new Scene(root, 600, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
