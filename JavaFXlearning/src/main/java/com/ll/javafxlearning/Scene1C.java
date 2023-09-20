package com.ll.javafxlearning;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class Scene1C implements Initializable {

    private Scene2C scene2C;
    private HelloApplication mainapp;

    //Injection =========================================================================================================
    public void setScene2C(Scene2C scene2C){
        this.scene2C = scene2C;
    }

    public void setMainapp( HelloApplication mainapp){
        this.mainapp = mainapp;
    }

    //FXML elements =========================================================================================================
    @FXML
    private Button button;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        button.setOnAction(e -> mainapp.changeScene2());

    }
}
