package ContainerApp;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField txtName;
    @FXML
    private Button btnHello;
    @FXML
    private Button btnBye;
    @FXML
    private CheckBox chkClear;
    @FXML
    private Label lblProcess;

    @FXML
    public void initialize(){
        handleKeyReleased();
    }

    @FXML
    public void onButtonClicked(ActionEvent e) {
        if(e.getSource().equals(btnHello)){
            System.out.println("Hello, " + txtName.getText());
        } else if(e.getSource().equals(btnBye)) {
            System.out.println("Bye, " + txtName.getText());
        }

        Runnable task = new Runnable() {
            @Override
            public void run() {
                try
                {
                    String threadPlace = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                    System.out.println("I am going to sleep on the: " + threadPlace);
                    Thread.sleep(10000);
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            String threadPlace = Platform.isFxApplicationThread() ? "UI Thread" : "Background Thread";
                            System.out.println("I am going to update label on the: " + threadPlace);
                            lblProcess.setText("Process completed !!!");
                        }
                    });
                } catch(InterruptedException event){
                    // don't process
                }
            }
        };

        new Thread(task).start();

        if(chkClear.isSelected()) {
            txtName.clear();
            handleKeyReleased();
        }
//        System.out.println("The Button pressed was: " + e.getSource());
    }

    @FXML
    public void handleKeyReleased() {
        String text= txtName.getText();
        boolean disableButtons = text.isEmpty() || text.trim().isEmpty();
        btnHello.setDisable(disableButtons);
        btnBye.setDisable(disableButtons);
    }

    @FXML
    public void handleClear() {
        System.out.println("The Checkbox is " + (chkClear.isSelected() ? "checked" : "unchecked"));
    }

}
