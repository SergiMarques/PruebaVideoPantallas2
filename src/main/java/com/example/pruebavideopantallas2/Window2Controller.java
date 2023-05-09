package com.example.pruebavideopantallas2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Window2Controller {


    private Window1Controller controllerWindow1;
    private Stage stage;
    @FXML
    private Label lbName;

    @FXML
    void showWindow1(ActionEvent event) {
controllerWindow1.show();
stage.close();

    }

    public void init(String text, Stage stage, Window1Controller window1Controller) {
        lbName.setText(text);
        this.controllerWindow1 = window1Controller;
        this.stage = stage;
    }
}
