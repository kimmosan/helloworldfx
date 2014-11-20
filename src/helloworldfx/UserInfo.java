/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworldfx;

import java.util.ArrayList;
import javafx.scene.control.TextArea;

/**
 *
 * @author Ohjelmistokehitys
 */
public class UserInfo extends TextArea{
    
    TextFieldsPartial textFields = new TextFieldsPartial();
    ArrayList<String> userlist = new ArrayList();
    
    public UserInfo(TextFieldsPartial t) {
        textFields = t;
        this.setMaxWidth(300);
        //VBox.setMargin(this, new Insets(10,10,10,10));
    }
    
    public void printInfo() {
        System.out.println("Print");
        this.clear();
        for (String s: userlist) {
            this.appendText(s);
        }
    }
    
    public void saveUser() {
        userlist.add("Name: " + textFields.getName() + "\n" + 
                "Address: " + textFields.getAddress() + "\n" + 
                "Phone: " + textFields.getPhone() + "\n\n");
    }
}
