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
public class FXMLTelaAlunoController implements Initializable {
    @FXML
    private Button botaoCadastrar;

    @FXML
    private Button botaoVoltar;

    @FXML
    void cadastrarPerfil(ActionEvent event) throws IOException {
        Stage stage = (Stage) botaoCadastrar.getScene().getWindow();
        stage.close();
        
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(getClass().getResource("FXMLTelaCadastroAluno.fxml"));
        /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage1 = new Stage();
        stage1.setTitle("Cadastrar perfil");
        stage1.setScene(scene);
        stage1.show();
    }
 
    @FXML
    void voltarMenu(ActionEvent event) throws IOException {
        Stage stage = (Stage) botaoVoltar.getScene().getWindow();
        //stage.close();
       /*
       FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("FXMLTelaPrincipal.fxml"));
       Parent root1 = (Parent) fxmlLoader.load();
      // Stage stage = new Stage();
       stage.setScene(new Scene(root1));
       stage.show();
       */
       FXMLLoader fxmlLoader = new FXMLLoader();
       fxmlLoader.setLocation(getClass().getResource("FXMLTelaPrincipal.fxml"));
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
