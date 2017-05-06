package hu.jinghis.bookpoint.sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class Controller {

    @FXML
    private Button mybutton;

    public void myButtonAction (ActionEvent e){
        mybutton.setText("takonymokus");
    }
}
