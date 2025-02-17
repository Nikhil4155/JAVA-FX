package com.example.demo;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Program5CheckBox extends Application {
    CheckBox cbWeb;
    CheckBox cbDesktop;
    CheckBox cbMobile;
    Label response;
    Label allTargets;
    String targets = "";

    public static void main(String[] args) {
        // Start the JavaFX application by calling launch().
        launch(args);
    }

    // Override the start() method.
    @Override
    public void start(Stage myStage) {
        // Set stage title.
        myStage.setTitle("Demonstrate Checkboxes");

        // Use a FlowPane for the root node with gaps.
        FlowPane rootNode = new FlowPane(10, 10);
        rootNode.setAlignment(Pos.CENTER); // Center the controls.

        // Create a scene.
        Scene myScene = new Scene(rootNode, 230, 140);
        myStage.setScene(myScene); // Set the scene on the stage.

        // Create labels.
        Label heading = new Label("Select Subjects");
        response = new Label("        No Subjects Selected         ");
        allTargets = new Label("Target List: <none>");

        // Create the checkboxes.
        cbWeb = new CheckBox("C++");
        cbDesktop = new CheckBox("Java");
        cbMobile = new CheckBox("Python");

        // Handle action events for the checkboxes.
        cbWeb.setOnAction((ae) -> {
            if (cbWeb.isSelected())
                response.setText("  C++ selected.");
            else
                response.setText("  C++ cleared.");
            showAll();
        });

        cbDesktop.setOnAction((ae) -> {
            if (cbDesktop.isSelected())
                response.setText("Java selected.");
            else
                response.setText("Java cleared.");
            showAll();
        });

        cbMobile.setOnAction((ae) -> {
            if (cbMobile.isSelected())
                response.setText(" Python selected.");
            else
                response.setText("Python cleared.");
            showAll();
        });

        // Use a separator to better organize the layout.
        Separator separator = new Separator();
        separator.setPrefWidth(200);

        // Add controls to the scene graph.
        rootNode.getChildren().addAll(heading, separator, cbWeb, cbDesktop,
                cbMobile, response, allTargets);

        // Show the stage.
        myStage.show();
    }

    // Update and show the targets list.
    void showAll() {
        targets = "";
        if (cbWeb.isSelected()) targets = "C++ ";
        if (cbDesktop.isSelected()) targets += "Java ";
        if (cbMobile.isSelected()) targets += "Python";
        if (targets.equals("")) targets = "<none>";
        allTargets.setText("Target List: " + targets);
    }
}