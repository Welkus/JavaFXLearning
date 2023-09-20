package com.ll.javafxlearning;

import javafx.beans.binding.StringBinding;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Slider;
import javafx.scene.control.Label;
import java.net.URL;
import java.util.ResourceBundle;

public class Scene2C implements Initializable {

    private HelloApplication mainApp;


    //Injection =========================================================================================================

    public void setSceneMain(HelloApplication mainApp){
        this.mainApp = mainApp;

    }



    //FXML elements =========================================================================================================
    @FXML
    private Label labeForPre;

    @FXML
    private Slider slider;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public void changeToScene1 (){
        slider.valueProperty() .addListener((observable,oldValue, newValue) -> {

            double sliderNumb = newValue.doubleValue();

            labeForPre.textProperty().bind(StringBinding);
            if(sliderNumb > 50){
                mainApp.changeScene1();
            }
        });
    }
}
