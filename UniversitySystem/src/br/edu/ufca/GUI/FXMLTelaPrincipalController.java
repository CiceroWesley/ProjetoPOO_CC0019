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
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author wesley
 */
public class FXMLTelaPrincipalController implements Initializable {
    
    private Universidade universidade;

    /*
    public FXMLTelaPrincipalController(Universidade fachada){
        this.telacadastroaluno = new FXMLTelaCadastroAlunoController(fachada);
    }
    
    public Universidade getUniversidade(){
        return universidade;
    }
    */
    
     @FXML
    private Button botaoProfessor;

    @FXML
    private Button botaoAluno;
    
    @FXML
    void abrirTelaProfessor(ActionEvent event) throws IOException {
        Stage stage = (Stage) botaoProfessor.getScene().getWindow();
        //stage.close();
        
        //FXMLLoader fxmlLoader = new FXMLLoader();
        //fxmlLoader.setLocation(getClass().getResource("FXMLTelaAluno.fxml"));
        /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLTelaProfessor.fxml"));
        Parent root = loader.load();
        //System.out.println(universidade);
        FXMLTelaProfessorController controller = loader.getController();
        controller.setUniversidade(universidade);
        
        
        Scene scene = new Scene(root);
        //Stage stage = new Stage();
        stage.setTitle("Sistema Universitario");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    private void abrirTelaAluno(ActionEvent event) throws IOException {
        Stage stage = (Stage) botaoAluno.getScene().getWindow();
        //stage.close();
        
        //FXMLLoader fxmlLoader = new FXMLLoader();
        //fxmlLoader.setLocation(getClass().getResource("FXMLTelaAluno.fxml"));
        /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLTelaAluno.fxml"));
        Parent root = loader.load();
        //System.out.println(universidade);
        FXMLTelaAlunoController controller = loader.getController();
        controller.setUniversidade(universidade);
        
        
        Scene scene = new Scene(root);
        //Stage stage = new Stage();
        stage.setTitle("Sistema Universitario");
        stage.setScene(scene);
        stage.show();
    }
    
    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
