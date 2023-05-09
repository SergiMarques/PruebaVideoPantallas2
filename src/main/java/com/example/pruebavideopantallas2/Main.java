package com.example.pruebavideopantallas2;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
  FXMLLoader loader = new FXMLLoader(getClass().getResource("Window1.fxml"));
      Parent root = loader.load();
  Scene scene = new Scene(root);
    primaryStage.setScene(scene);
        Window1Controller controller = loader.getController();
        controller.setStage(primaryStage);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}