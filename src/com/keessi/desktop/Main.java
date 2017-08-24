package com.keessi.desktop;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Login Form");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        final Text actionTarget = new Text();
        actionTarget.setId("action-target");
        grid.add(actionTarget, 1, 7);

        Text sceneTitle = new Text("Welcome to login Form");
        sceneTitle.setId("welcome-text");
        grid.add(sceneTitle, 0, 0, 2, 1);

        Label username = new Label("Username:");
        grid.add(username, 0, 2);

        TextField userTextField = new TextField();
        grid.add(userTextField, 1, 2);

        Label password = new Label("Password:");
        grid.add(password, 0, 3);

        PasswordField passwordField = new PasswordField();
        grid.add(passwordField, 1, 3);

        Button loginBtn = new Button("    Sign in    ");
        Button regBtn = new Button("    Register    ");
        loginBtn.setOnAction(event -> actionTarget.setText("Sign in button pressed"));
        regBtn.setOnAction(event -> actionTarget.setText("Register button pressed"));
        HBox hBox = new HBox(10);
        hBox.setAlignment(Pos.BOTTOM_RIGHT);
        hBox.getChildren().add(loginBtn);
        hBox.getChildren().add(regBtn);
        grid.add(hBox, 1, 5);

        Scene scene = new Scene(grid, 400, 275);
        primaryStage.setScene(scene);
        scene.getStylesheets().add(this.getClass().getResource("css/login.css").toExternalForm());
        primaryStage.setResizable(false);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
