/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafx2;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Mahmoud
 */
public class Javafx2 extends Application {
    
    @Override
    public void start(Stage primaryStage) throws IOException {
       

     
       FXMLLoader loader = new FXMLLoader(getClass().getResource("/javafx2/conroller/Scene.fxml"));
//       loader.setController(this);
        FlowPane flowPane = loader.load();
        
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