package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Program6Password extends Application {

    // Start the JavaFX application
    public static void main(String[] args) {
        launch(args);
    }

    // Override the start() method
    @Override
    public void start(Stage myStage) {
        // Set the stage title
        myStage.setTitle("Login Page Validation");

        // Create a FlowPane layout with spacing
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER);

        // Create a Scene
        Scene myScene = new Scene(rootNode, 350, 200);
        myStage.setScene(myScene);

        // Create Labels
        Label response = new Label("Enter username and password");

        // Create TextField for username
        TextField usernameField = new TextField();
        usernameField.setPromptText("Enter Username");

        // Create PasswordField for password
        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter Password");

        // Create Login Button
        Button btnLogin = new Button("LOGIN");

        // Handle button click event
        btnLogin.setOnAction((ae) -> {
            String username = usernameField.getText();
            String password = passwordField.getText();

            if (username.equals("NITTE") && password.equals("NITTE123")) {
                response.setText("LOGIN SUCCESSFUL. WELCOME " + username);
            } else {
                response.setText("LOGIN FAILED. INVALID USERNAME OR PASSWORD");
            }
        });

        // Add elements to the layout
        rootNode.getChildren().addAll(usernameField, passwordField, btnLogin, response);

        // Show the stage
        myStage.show();
    }
}
