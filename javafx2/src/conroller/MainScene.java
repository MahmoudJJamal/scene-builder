/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conroller;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import view.AppScreen;

/**
 *
 * @author Mahmoud
 */
public class MainScene extends Application {
//    @FXML
//    private TextField password;
//
//    @FXML
//    private Button submit;
//
//    @FXML
//    private TextField username;
//    @FXML

    @Override
    public void start(Stage primaryStage) throws IOException {
     
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLSCENE.fxml"));
//////       Parent root = fxmlLoader.load();
       FlowPane flowPane = fxmlLoader.load();
  
        
        Scene scene = new Scene(flowPane);
        primaryStage.setScene(scene);
         primaryStage.setTitle("Scene Builder");
        primaryStage.show();
        
       
       
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

       
    
}