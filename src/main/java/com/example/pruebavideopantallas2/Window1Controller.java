package com.example.pruebavideopantallas2;

import com.almasb.fxgl.entity.action.Action;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Window1Controller {


private Stage stage;
    @FXML
    private TextField txtName;
    @FXML
    void showWindow2(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Window2.fxml"));
        Parent root = loader.load();
        Window2Controller controller = loader.getController();
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        controller.init(txtName.getText(), stage, this);
        stage.show();
        this.stage.close();
    }

    public void setStage(Stage primaryStage) {

        stage = primaryStage;
    }

    public void show() {
        stage.show();
    }
}