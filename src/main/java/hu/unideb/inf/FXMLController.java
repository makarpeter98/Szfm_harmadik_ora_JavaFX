package hu.unideb.inf;

import java.net.URL;
import java.util.ResourceBundle;

import com.sun.tools.javac.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class FXMLController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private ProgressBar clickCounter;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        Integer Counter = MainApp.Counter;
        System.out.println("Counter értéke: " + Counter);
        MainApp.Counter++;
    }

    @FXML
    private void handleButtonAction_ketto(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        Integer Counter = MainApp.Counter;
        System.out.println("Counter értéke: " + Counter);
        MainApp.Counter += 2;
    }
    @FXML
    private void progessBarLoader(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        Integer Counter = MainApp.Counter;
        System.out.println("Counter értéke: " + Counter);
        MainApp.ProgressBarCounter += 0.1;
        clickCounter.setProgress(MainApp.ProgressBarCounter);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
}
