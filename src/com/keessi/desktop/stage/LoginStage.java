package com.keessi.desktop.stage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class LoginStage extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(this.getClass().getResource("../fxml/login.fxml"));
        primaryStage.setTitle("Login Form");
        primaryStage.getIcons().add(new Image("http://oanl5xf7d.bkt.clouddn.com/keessi/logo.png"));
        Scene scene = new Scene(root, 400, 275);
        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }
}
