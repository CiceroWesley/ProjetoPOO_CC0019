package br.edu.ufca.Modelo;

//import java.util.ArrayList;

public class Aluno {
	private String nome;
	private int matricula;
	private int idade;
	private boolean trancou = false;
	//private ArrayList<Disciplina> cadeiras;
	
	Aluno(String nome, int matricula, int idade){
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
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


