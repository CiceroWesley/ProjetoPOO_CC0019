/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufca.GUI;

import br.edu.ufca.Modelo.Universidade;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author wesley
 */
public class FXMLTelaRemoverAlunoController implements Initializable {
   
    @FXML
    private Button botaoVoltar;

    @FXML
    private TextField insereNome;

    @FXML
    private Button botaoRemover;

    @FXML
    private Label labelResultado;

    @FXML
    void removerAluno(ActionEvent event) {
        FXMLTelaPrincipalController telaPrincipal = new FXMLTelaPrincipalController();
        Universidade universidade = telaPrincipal.getUniversidade();
        String nome = insereNome.getText();
        universidade.removerAluno(nome);
        labelResultado.setText("Remoção realizada com sucesso");
    }

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
