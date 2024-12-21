package com.example.demo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Lec2Shapes extends Application {
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Group root = new Group();
        Scene myscene = new Scene(root,800,800, Color.BLUEVIOLET);
//        stage.setFullScreen(true);
        stage.setTitle("Internet Connection is required");

        Text text = new Text();
        text.setX(250);
        text.setY(250);
        text.setText("Hello World");
        text.setFont(Font.font("Verdana",50));
//        text.setFont(Font.font("Bold",50));
        text.setFill(Color.ORANGE);

        Rectangle rectangle = new Rectangle();
        rectangle.setX(50);
        rectangle.setY(50);
        rectangle.setWidth(100);
        rectangle.setHeight(100);
        rectangle.setFill(Color.RED);
        rectangle.setStrokeWidth(5); // It is used to add a border
        rectangle.setStroke(Color.BLACK); // It is used to add a border colour


        Polygon triangle = new Polygon();
        triangle.getPoints().setAll(
                200.0, 100.0, // First vertex (x1, y1)
                150.0, 200.0, // Second vertex (x2, y2)
                250.0, 200.0  // Third vertex (x3, y3)
        );
        triangle.setFill(Color.LIMEGREEN);
        triangle.setStroke(Color.BLACK);
        triangle.setStrokeWidth(3);


        Circle circle = new Circle();
        circle.setCenterX(400);
        circle.setCenterY(400);
        circle.setRadius(50);
        circle.setFill(Color.YELLOWGREEN);
        circle.setStrokeWidth(5);
        circle.setStroke(Color.BLACK);


        root.getChildren().add(text);
        root.getChildren().add(rectangle);
        root.getChildren().add(triangle);
        root.getChildren().add(circle);
        stage.setScene(myscene);
        stage.show();
    }
}
