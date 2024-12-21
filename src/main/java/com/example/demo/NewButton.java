package com.example.demo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class NewButton extends Application {
    Label response;
    public static void main(String[] args)
    {
        launch(args);
    }


    @Override
    public void start(Stage stage) throws Exception {

        FlowPane node = new FlowPane(10,10);
        Scene myscene = new Scene(node,400,400);
        node.setAlignment(Pos.CENTER); // sets all child elements at the center
//  Earlier we used to add Color while declaring Scene but the same thing is not possible while using Flowpane.. we can
//  either add by external css or using setbackground method
        node.setStyle("-fx-background-color: blue-violet;");
//        node.setBackground(new Background(new BackgroundFill(Color.BLUE-VIOLET, CornerRadii.EMPTY, Insets.EMPTY)));

        response = new Label("No button was clicked");
        response.setTextFill(Color.ORANGE);

        Button btnalpha = new Button("Alpha");
        Button btnbeta = new Button("Beta");
        btnalpha.setTextFill(Color.BLACK);
        btnbeta.setTextFill(Color.BLACK);
        btnalpha.setBorder(new Border(new BorderStroke(
                Color.BLACK,                       // Border color
                BorderStrokeStyle.SOLID,         // Border style
                new CornerRadii(5),              // Corner radii
                new BorderWidths(2)              // Border thickness
        )));
        btnalpha.setStyle("-fx-background-color:red");
        btnbeta.setStyle("-fx-background-color:red");

        btnalpha.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
               response.setText("Button Alpha was Pressed");
            }
        } );

        btnbeta.setOnAction(new EventHandler<ActionEvent>()
        {
            public void handle(ActionEvent actionEvent)
            {
                response.setText("Button Beta was pressed");
            }
        });
//        btnalpha.setLayoutX(200);
//        btnalpha.setLayoutY(200);
//        btnbeta.setLayoutX(250);
//        btnbeta.setLayoutY(200);


        node.getChildren().add(btnalpha);
        node.getChildren().add(btnbeta);
        node.getChildren().add(response);
        stage.setScene(myscene);
        stage.show();


    }
}
