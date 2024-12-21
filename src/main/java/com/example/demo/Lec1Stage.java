package com.example.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;

public class Lec1Stage extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(javafx.stage.Stage stage) throws Exception {
        Group root = new Group();
        Scene scene= new Scene(root, Color.BLUEVIOLET);

        stage.setTitle("Stage Demo Program is set");
        stage.setWidth(420);
        stage.setHeight(420);
        stage.setResizable(false);
//        stage.setX(50);
//        stage.setY(50);
        stage.setFullScreen(true);


        stage.setScene(scene);
        stage.show();

    }
}
