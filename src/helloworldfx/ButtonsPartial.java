/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldfx;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 *
 * @author Ohjelmistokehitys
 */
public class ButtonsPartial extends HBox implements EventHandler<ActionEvent>{
    
        // Components for button layout
        Button saveBtn = new Button("Save");
        Button closeBtn = new Button("Close");
        Button printBtn = new Button("Print");
        TextFieldsPartial textFields = new TextFieldsPartial();
        UserInfo user = new UserInfo(textFields);
        
    public ButtonsPartial(UserInfo u) {
        user = u;
        VBox.setMargin(this, new Insets(0,10,10,10));
        saveBtn.setStyle("-fx-color:green");
        closeBtn.setStyle("-fx-color:red");
        printBtn.setStyle("-fx-color:blue");
        this.getChildren().add(saveBtn);
        this.getChildren().add(closeBtn);
        this.getChildren().add(printBtn);
        
        saveBtn.setOnAction(this);
        printBtn.setOnAction(this);
        // Inline implementation for EventHandler interface
        closeBtn.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent t) {
                Platform.exit();
            }
        });
    }

    @Override
    public void handle(ActionEvent t) {
        if (t.getSource().equals(saveBtn))
            user.saveUser();
        else if (t.getSource().equals(printBtn)) {
            user.printInfo();
        }
                
    }
}
