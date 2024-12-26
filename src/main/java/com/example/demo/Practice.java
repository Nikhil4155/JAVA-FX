package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Practice extends Application {
    Label response;
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage mystage) throws Exception {

        FlowPane rootnode = new FlowPane(10,20);
        Scene myscene = new  Scene(rootnode,600,600);

//        mystage.setWidth(800); // This is used to set the height and widht of the stage
//        mystage.setHeight(800);
//        mystage.setX(50); // This is used to place the stage in our screen
//        mystage.setY(50);

        mystage.setTitle("Practice for javafx");
        rootnode.setAlignment(Pos.CENTER);
        rootnode.setStyle("-fx-background-color:lightblue;");

        Text text = new Text();
        text.setText("Welcome to Java FX Program");
        text.setFill(Color.BLACK);
//        text.setX(100); //Positioning wont work because because already center position is defined
//        text.setY(100);

        Button alpha = new Button("Alpha");
        alpha.setTextFill(Color.BLUEVIOLET);
        alpha.setStyle("-fx-background-color:orange;");
//        alpha.setText("Alpha2");

        Button beta = new Button("Beta");
        beta.setTextFill(Color.BLUEVIOLET);
        beta.setStyle("-fx-background-color:orange;");

        response = new Label("No button was Clicked");

        alpha.setOnAction(new EventHandler<ActionEvent>()
        {
            @Override
            public void handle(ActionEvent ae) {
                response.setText("Alpha was clicked");
            }
        });

        beta.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent ae) {
                response.setText("Beta was Clicked");
            }
        });



        rootnode.getChildren().add(text);
        rootnode.getChildren().add(alpha);
        rootnode.getChildren().add(beta);
        rootnode.getChildren().add(response);
        mystage.setScene(myscene);
        mystage.show();



    }
}
