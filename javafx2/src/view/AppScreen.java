/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import java.io.IOException;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Mahmoud
 */
public class AppScreen extends Stage {
    private static final double CONVERSION_RATE = 0.012; 
      @FXML
    private Button logout;

    @FXML
    private TextField textusd;

    @FXML
    private Button convertsub;

    @FXML
    private TextField textnis;

    public AppScreen() {
  

    
    
    
        
       
       FXMLLoader loader = new FXMLLoader(getClass().getResource("scene2.fxml"));
         loader.setController(this);
//        FlowPane flowPane = loader.load();
        
        
      
         convertsub.setOnAction(event ->{
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
         
         
         
         });
  }

    public static void main(String[] args) {
        launch(args);
    }

    
    
}
