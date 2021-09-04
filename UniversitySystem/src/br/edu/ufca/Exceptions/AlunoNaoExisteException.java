/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ufca.Exceptions;

/**
 *
 * @author wesley
 */
public class AlunoNaoExisteException extends Exception {
    
    @Override
    public String getMessage(){
        return "Este aluno não existe";
    }
    
}
