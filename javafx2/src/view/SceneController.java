/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import conroller.MainScene;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author Mahmoud
 */
public class SceneController implements Initializable {

      private static final double CONVERSION_RATE = 0.012; 

   


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
     @FXML
    private Button logout;

    @FXML
    private TextField textusd;

    @FXML
    private Button convertsub;

    @FXML
    private TextField textnis;

  



  

    @FXML
    void LogoutHandle(MouseEvent event) {
          
        System.out.println("Logout clicked");
    }



    

    @FXML
    void convertHundle(ActionEvent event) {
             try {
            // Get input value from USD TextField
            double usd = Double.parseDouble(textusd.getText());

            // Convert USD to INS
            double ins = usd * CONVERSION_RATE;

            // Set the result in INS TextField
            textnis.setText(String.format("%.2f", ins));
            } catch (NumberFormatException e) {
            // Handle invalid input
            textnis.setText("Invalid input");
        }
    }



     
}
