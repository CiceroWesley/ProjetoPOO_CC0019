package br.edu.ufca.Modelo;

//import java.util.ArrayList;

public class Aluno extends Pessoa{
	private int matricula;
	private boolean trancou;
	//private ArrayList<Disciplina> cadeiras;
	
	public Aluno(String nome, int matricula, int idade){
		super(nome,idade);
		this.matricula = matricula;
		this.trancou = false;
	}


	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public boolean isTrancou() {
		return trancou;
	}

	public void trancarCruso() {
		this.trancou = true;
	}
	/*
	public void informarSe(String cadeira) {
		//tenho que verificar se a cadeira existe, se existir pegar os dados daquela cadeira
		//porem necessita do repositorio disciplinas e do metodo da disciplina
		}
		*/
	}


