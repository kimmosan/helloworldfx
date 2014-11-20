/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldfx;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class TextFieldsPartial extends VBox {
    
        // Components for textfield layout
        private final Label nameLabel = new Label("Name");
        private final TextField nameField = new TextField();
        private final Label addressLabel = new Label("Address");
        private final TextField addressField = new TextField();
        private final Label phoneLabel = new Label("Phone number");
        private final TextField phoneField = new TextField();
                
        public TextFieldsPartial() {
            VBox.setMargin(this, new Insets(10,10,10,10));
            this.getChildren().add(nameLabel);
            this.getChildren().add(nameField);
            this.getChildren().add(addressLabel);
            this.getChildren().add(addressField);
            this.getChildren().add(phoneLabel);
            this.getChildren().add(phoneField);
            //this.setStyle("-fx-padding:10px");
        }
}
