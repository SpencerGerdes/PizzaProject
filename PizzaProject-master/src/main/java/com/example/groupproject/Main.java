package com.example.groupproject;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {



    @Override
    public void start(Stage stage) throws IOException {
        GridPane myGrid = new GridPane();
        Scene myScene = new Scene(myGrid,400,300);

        Label header = new Label("Best Pizza");



        TextField myTextn1 = new TextField();

        myGrid.add(myTextn1,1,1);




        myGrid.add(header,7,0);








       //creates the button
        Button checkPhoneNumberButton = new Button("Check Phone Number");
        //this is the action when the button is pressed
        checkPhoneNumberButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                //if statement searching database for phone#

            }
        });

        myGrid.add(checkPhoneNumberButton,7,1);








        //adds the stage/scene and runs
        stage.setScene(myScene);
        stage.show();




    }

    public static void main(String[] args) {
        launch();
    }
}