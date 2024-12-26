package com.example.demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class CountryComboBoxDemo extends Application {
    @Override
    public void start(Stage stage) {
        // Set the title of the stage
        stage.setTitle("User Registration Form");

        // Create a label
        Label label = new Label("Select your country:");

        // Create a ComboBox
        ComboBox<String> countryComboBox = new ComboBox<>();
        countryComboBox.getItems().addAll(
                "India",
                "United States",
                "Canada",
                "United Kingdom",
                "Australia",
                "Germany",
                "France"
        );

        // Set a placeholder text
        countryComboBox.setPromptText("Choose a country");

        // Add an event listener for selection
        Label selectedCountry = new Label();
        countryComboBox.setOnAction(e -> {
            String country = countryComboBox.getValue();
            selectedCountry.setText("Selected Country: " + country);
        });

        // Arrange components in a VBox
        VBox vbox = new VBox(10, label, countryComboBox, selectedCountry);
        vbox.setStyle("-fx-padding: 20; -fx-alignment: center;");

        // Create and set the scene
        Scene scene = new Scene(vbox, 300, 200);
        stage.setScene(scene);

        // Show the stage
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

