package com.ll.javafxlearning;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {


    Scene1C scene1C;
    Scene2C scene2C;
    Scene scene1;
    Scene scene2;
    Stage stage;

    @Override
    public void start(Stage stage) throws IOException {
        this.stage = stage;
        //Loaders==========================================================================================================================================

        FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("Scene1.fxml"));
        Parent root1 = fxmlLoader1.load();
        scene1C = fxmlLoader1.getController();
        scene1 = new Scene(root1);


        FXMLLoader fxmlLoader2 = new FXMLLoader(getClass().getResource("Scene2.fxml"));
        Parent root2 = fxmlLoader2.load();
        scene2C = fxmlLoader2.getController();
        scene2 = new Scene(root2);


        //Injections==========================================================================================================================================

        scene1C.setScene2C(scene2C);
        scene1C.setMainapp(this);
        scene2C.setSceneMain(this);


        //Setting up scene==========================================================================================================================================

        stage.setScene(scene1);
        stage.show();


    }

    //Scene changing==========================================================================================================================================

    public void changeScene1() {
        stage.setScene(scene1);
    }

    public void changeScene2() {
        stage.setScene(scene2);
    }


    public static void main(String[] args) {
        launch();
    }
}