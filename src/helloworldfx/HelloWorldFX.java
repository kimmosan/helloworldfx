/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldfx;

import javafx.application.Application;
import javafx.geometry.Insets;
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
        
        TextFieldsPartial textFields = new TextFieldsPartial();
        UserInfo user = new UserInfo(textFields);

        HBox textAreas = new HBox();
        VBox.setMargin(textAreas, new Insets(10,10,10,10));
        textAreas.getChildren().add(textFields);
        textAreas.getChildren().add(user);
        
        // Add layouts to the root layout
        root.getChildren().add(textAreas);
        root.getChildren().add(new ButtonsPartial(user));
        
        Scene scene = new Scene(root, 400, 250);
        
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
