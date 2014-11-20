/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldfx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Ohjelmistokehitys
 */
public class HelloWorldFX extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        // The root is the main layout
        VBox root = new VBox();
        
        // Components for textfield layout
        Label nameLabel = new Label("Name");
        //nameLabel.setStyle("-fx-padding:15 0 0 0px");
        TextField nameField = new TextField();
        Label addressLabel = new Label("Address");
        addressLabel.setStyle("-fx-padding:15 0 0 0px");
        TextField addressField = new TextField();
        Label phoneLabel = new Label("Phone number");
        phoneLabel.setStyle("-fx-padding:15 0 0 0px");
        TextField phoneField = new TextField();
        
        // Layout for textfield components
        VBox textFieldLayout = new VBox();
        textFieldLayout.getChildren().add(nameLabel);
        textFieldLayout.getChildren().add(nameField);
        textFieldLayout.getChildren().add(addressLabel);
        textFieldLayout.getChildren().add(addressField);
        textFieldLayout.getChildren().add(phoneLabel);
        textFieldLayout.getChildren().add(phoneField);
        textFieldLayout.setStyle("-fx-padding:10px");

        // Components for button layout
        Button saveBtn = new Button("Save");
        Button closeBtn = new Button("Close");
        saveBtn.setStyle("-fx-color:green");
        closeBtn.setStyle("-fx-color:red");
        
        // Layout for buttons
        HBox buttonLayout = new HBox();
        buttonLayout.getChildren().add(saveBtn);
        buttonLayout.getChildren().add(closeBtn);
        //buttonLayout.setAlignment(Pos.CENTER);
        buttonLayout.setStyle("-fx-padding:15px; -fx-spacing:10px");
        
        // Add layouts to the root layout
        root.getChildren().add(textFieldLayout);
        root.getChildren().add(buttonLayout);
        //root.setAlignment(Pos.CENTER);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Idea");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
