/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufca.GUI;

import br.edu.ufca.Modelo.Universidade;
import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author wesley
 */
public class TelaPrincipal extends Application {
    //private Universidade universidade;
    
    /*
    private FXMLTelaCadastroAlunoController telacadastroaluno;
    
    public TelaPrincipal(Universidade fachada){
        this.telacadastroaluno = new FXMLTelaCadastroAlunoController(fachada);
    }
    */
    
    
    
    @Override
    public void start(Stage stage) throws Exception {
        Universidade universidade = new Universidade();
        //Parent root = FXMLLoader.load(getClass().getResource("FXMLTelaPrincipal.fxml"));
        FXMLLoader loader = new FXMLLoader(getClass().getResource("FXMLTelaPrincipal.fxml"));
        Parent root = loader.load();
        //System.out.println(universidade);
        FXMLTelaPrincipalController controller = loader.getController();
        controller.setUniversidade(universidade);
        
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
