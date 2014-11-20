/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldfx;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class ButtonsPartial extends HBox {
    
        // Components for button layout
        Button saveBtn = new Button("Save");
        Button closeBtn = new Button("Close");
        
    public ButtonsPartial() {
        VBox.setMargin(this, new Insets(0,10,10,10));
        saveBtn.setStyle("-fx-color:green");
        closeBtn.setStyle("-fx-color:red");
        this.getChildren().add(saveBtn);
        this.getChildren().add(closeBtn);
        //buttonLayout.setAlignment(Pos.CENTER);
        //this.setStyle("-fx-padding:15px; -fx-spacing:10px");
    }
    
}
