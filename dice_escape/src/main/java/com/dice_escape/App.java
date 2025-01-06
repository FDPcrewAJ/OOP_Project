package com.dice_escape;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import com.dice_escape.board_squares.BoardSquare;
import com.dice_escape.board_squares.CombatSquare;
import com.dice_escape.board_squares.HealthSquare;
import com.dice_escape.board_squares.ReverseSquare;
import com.dice_escape.board_squares.RevivalSquare;
import com.dice_escape.roles.Doctor;
import com.dice_escape.roles.Freerunner;
import com.dice_escape.roles.Player;
import com.dice_escape.roles.Soldier;
import com.dice_escape.roles.Spy;

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
                System.out.println();
                Player noRole = new Player("gray", 
                                            "no", 
                                            4);
                System.out.println(noRole);

                Soldier pSoldier = new Soldier("red", 
                                                "soldier",
                                                4,
                                                4, 
                                                2, 
                                                true);
                System.out.println(pSoldier);

                Freerunner pFreerunner = new Freerunner("blue", 
                                                        "freerunner",
                                                        4, 
                                                        6,
                                                        4, 
                                                        5, 
                                                        4);
                System.out.println(pFreerunner);

                Doctor pDoctor = new Doctor("green", 
                                            "doctor", 
                                            4, 
                                            20, 
                                            8, 
                                            5, 
                                            2);
                System.out.println(pDoctor);

                Spy pSpy = new Spy("black", 
                                    "spy", 
                                    4, 
                                    4, 
                                    6, 
                                    5);
                System.out.println(pSpy);


                Die d6 = new Die(6);
                System.out.println(d6);
                Die d4 = new Die(4);
                System.out.println(d4);


                BoardSquare basicSquare = new BoardSquare("gray", 
                                                            "default");
                System.out.println(basicSquare);

                HealthSquare healingSquare = new HealthSquare("green", 
                                                                "health", 
                                                                6, 
                                                                10);
                System.out.println(healingSquare);

                ReverseSquare reverseSquare = new ReverseSquare("orange", 
                                                                "reverse", 
                                                                6, 
                                                                4);
                System.out.println(reverseSquare);

                CombatSquare combatSquare = new CombatSquare("red", 
                                                            "combat", 
                                                            20, 
                                                            4);
                System.out.println(combatSquare);

                RevivalSquare revivalSquare = new RevivalSquare("blue", 
                                                                "revival", 
                                                                "odd");
                System.out.println(revivalSquare);

                launch();
    }

}