/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conroller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javax.xml.ws.Action;
import static sun.swing.SwingUtilities2.submit;
import view.AppScreen;


/**
 * FXML Controller class
 *
 * @author Mahmoud
 */
public class SceneController implements Initializable {




    @FXML
    private TextField password;

    @FXML
    private Button submit;

    @FXML
    private TextField username;
    @FXML
    private AnchorPane labelError;
   




    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
     
  
     
     @FXML
    public void Submit_handle(ActionEvent event){
        if(username.getText().equals("mahmoud")&&
                password.getText().equals("123"));
//            labelError.setText("Valid User");
        
            if(true)
               new AppScreen().show();

        }
        
}
