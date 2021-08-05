package com.keshav.styled;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.DropShadow;
import javafx.scene.layout.GridPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class Controller {

    @FXML
    private Label labelEffects;
    @FXML
    private Button button4;
    @FXML
    private GridPane gridPaneControl;
    @FXML
    private WebView webViewControl;

    public void initialize() {
        button4.setEffect(new DropShadow());
    }

    @FXML
    public void handleMouseEnter() {
        labelEffects.setScaleX(2.0);
        labelEffects.setScaleY(2.0);
    }

    @FXML
    public void handleMouseExit() {
        labelEffects.setScaleX(1.0);
        labelEffects.setScaleY(1.0);
    }

    @FXML
    public void handleDirClick() {
        DirectoryChooser chooser = new DirectoryChooser();
        File file = chooser.showDialog(gridPaneControl.getScene().getWindow());
        if(file != null) {
            System.out.println(file.getPath());
        } else {
            System.out.println("Chooser was cancelled");
        }
    }

    @FXML
    public void handleFileClick() {
        FileChooser chooser = new FileChooser();
        chooser.setTitle("Save Application File");
        chooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Text", "*.txt"),
                new FileChooser.ExtensionFilter("Image Files", "*.jpg", "*.jpeg", "*.png"),
                new FileChooser.ExtensionFilter("PDF", "*.pdf"),
                new FileChooser.ExtensionFilter("All Files", "*.*")
        );
//        File file = chooser.showOpenDialog(gridPaneControl.getScene().getWindow());
        List<File> files = chooser.showOpenMultipleDialog(gridPaneControl.getScene().getWindow());
//        File file = chooser.showSaveDialog(gridPaneControl.getScene().getWindow());
        if(files != null) {
            for(int i=0; i< files.size(); i++) {
                System.out.println(files.get(i));
            }
//            System.out.println(file.getPath());
        } else {
            System.out.println("Chooser was cancelled");
        }
    }

    @FXML
    public void handleLinkClick()
    {
        System.out.println("The link was clicked");
        WebEngine engine = webViewControl.getEngine();
        engine.load("http://www.javafx.com");
//        try
//        {
//            Desktop.getDesktop().browse(new URI("http://www.javafx.com"));
//        } catch(IOException e) {
//            e.printStackTrace();
//        } catch(URISyntaxException e) {
//            e.printStackTrace();
//        }
    }

}
