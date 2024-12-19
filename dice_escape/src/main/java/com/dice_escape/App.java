package com.dice_escape;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import com.dice_escape.roles.Doctor;
import com.dice_escape.roles.Freerunner;
import com.dice_escape.roles.Player;
import com.dice_escape.roles.Soldier;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    
        
            @Override
            public void start(Stage stage) throws IOException {
                scene = new Scene(loadFXML("primary"), 640, 480);
                stage.setScene(scene);
                stage.show();
            }
        
            static void setRoot(String fxml) throws IOException {
                scene.setRoot(loadFXML(fxml));
            }
        
            private static Parent loadFXML(String fxml) throws IOException {
                FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
                return fxmlLoader.load();
            }
        
            public static void main(String[] args) {
                Player noRole = new Player("gray", "no", 4);
                System.out.println(noRole);

                Soldier pSoldier = new Soldier("red", "soldier",4 ,4, 2, true);
                System.out.println(pSoldier);

                Freerunner pFreerunner = new Freerunner("blue", "freerunner",4, 6, 4, 5, 4);
                System.out.println(pFreerunner);

                Doctor pDoctor = new Doctor("green", "doctor", 4, 20, 8, 5, 2);
                System.out.println(pDoctor);

                launch();
    }

}