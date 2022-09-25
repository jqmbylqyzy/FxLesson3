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

public class RegistrationController {
    @FXML
    Button registrationButton, cancelButton;

    @FXML
    TextField nameTextField, surnameTextField, groupTextField, classroomTextField, emailTextField, phoneTextField;

    @FXML
    Text RegistrText;

    public void cancelButtonClicked(ActionEvent event){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("login.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 315,273);
            Stage stage  =new Stage();
            stage.setTitle("Login form");
            stage.setScene(scene);
            stage.show();
            ((Node)(event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void registerButtonclicked (ActionEvent event){
        try{
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("welcomepage.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 299,402);
            Stage stage  =new Stage();
            stage.setTitle("WELCOME!");
            stage.setScene(scene);
            stage.show();
            ((Node)(event.getSource())).getScene().getWindow().hide();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }
    }



