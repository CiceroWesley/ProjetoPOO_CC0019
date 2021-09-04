/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufca.GUI;

import br.edu.ufca.Exceptions.AlunoNaoExisteException;
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
    private Universidade universidade;
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
        String nome = insereNome.getText();
        //System.out.println(universidade);
        try{
           this.universidade.removerAluno(nome);
           labelResultado.setText("Remoção realizada com sucesso");
        } catch(AlunoNaoExisteException e){
            labelResultado.setText(e.getMessage());
        }
        
    }

    @FXML
    void voltarAluno(ActionEvent event) throws IOException {
        Stage stage = (Stage) botaoVoltar.getScene().getWindow();
        stage.close();
       
       
       FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLTelaProfessor.fxml"));
       Parent root = loader.load();
       //System.out.println(universidade);
       FXMLTelaProfessorController controller = loader.getController();
       System.out.println(universidade);
       controller.setUniversidade(universidade);
       System.out.println(universidade);
       //FXMLLoader fxmlLoader = new FXMLLoader();
       //fxmlLoader.setLocation(getClass().getResource("FXMLTelaPrincipal.fxml"));
        /* 
         * if "fx:controller" is not set in fxml
         * fxmlLoader.setController(NewWindowController);
         */
        Scene scene = new Scene(root);
        Stage stage1 = new Stage();
        stage1.setTitle("Sistema universitário");
        stage1.setScene(scene);
        stage1.show();
       
    }
    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
