package com.example.fxlesson3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {
    @FXML
    Button loginButton, registrationButton;

    @FXML
    TextField emailTextField, passwordTextField;

    @FXML
    Text LoginText;



    public void registerButtonClicked(ActionEvent event){
        try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("registration.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 313,427);
            Stage stage  =new Stage();
            stage.setTitle("Registration form");
            stage.setScene(scene);
            stage.show();
            ((Node)(event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void loginButtonClicked(ActionEvent event){
        if (emailTextField.getText().equals("dina@jihc.kz") && passwordTextField.getText().equals("123"))
            try {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("welcomepage.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 299,402);
            Stage stage  =new Stage();
            stage.setTitle("WELCOME PAGE");
            stage.setScene(scene);
            stage.show();
            ((Node)(event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}