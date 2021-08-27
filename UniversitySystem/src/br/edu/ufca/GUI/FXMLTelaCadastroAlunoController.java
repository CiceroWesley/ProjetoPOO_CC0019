/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufca.GUI;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author wesley
 */
public class FXMLTelaCadastroAlunoController implements Initializable {
    
    @FXML
    private Button botaoVoltar;

    @FXML
    void voltarAluno(ActionEvent event) throws IOException {
        Stage stage = (Stage) botaoVoltar.getScene().getWindow();
        //stage.close();
       
       

       FXMLLoader fxmlLoader = new FXMLLoader();
       fxmlLoader.setLocation(getClass().getResource("FXMLTelaAluno.fxml"));
        /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
        Scene scene = new Scene(fxmlLoader.load());
        //Stage stage = new Stage();
        stage.setTitle("Sistema Universitario");
        stage.setScene(scene);
        stage.show();
       
       
       
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
