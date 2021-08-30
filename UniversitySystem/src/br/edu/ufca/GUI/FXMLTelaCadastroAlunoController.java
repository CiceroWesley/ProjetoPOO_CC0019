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
public class FXMLTelaCadastroAlunoController implements Initializable {
    private Universidade universidade;
    @FXML
    private Button botaoVoltar;

    @FXML
    private TextField insereNome;

    @FXML
    private TextField insereMatricula;

    @FXML
    private TextField insereIdade;

    @FXML
    private Button botaoCadastrar;
    
    @FXML
    private Label labelResultado;

    @FXML
    void cadastrarAluno(ActionEvent event) {
        //FXMLTelaPrincipalController telaPrincipal = new FXMLTelaPrincipalController();
        //Universidade universidade = telaPrincipal.getUniversidade();
        String nome = insereNome.getText();
        int matricula =  Integer.parseInt(insereMatricula.getText());
        int idade = Integer.parseInt(insereIdade.getText());
        System.out.println(universidade);
        this.universidade.adicionarAluno(nome,matricula ,idade);
        //System.out.println(universidade);
        labelResultado.setText("Cadastro realizado com sucesso");
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
    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
