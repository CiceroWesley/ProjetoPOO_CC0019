package br.edu.ufca.Modelo;

import java.util.ArrayList;

public class RepositorioAlunosArrayList implements IRepositorioAlunos {
	
	private ArrayList<Aluno> array;

	@Override
	public void adicionar(Aluno discente) {
		// TODO Auto-generated method stub
		int indice = array.indexOf(discente);
		if(indice == -1) {
			array.add(discente);
		} else {
			//lançar exceção, discente ja existe
		}
		
	}

	@Override
	public void remover(Aluno discente) {
		int indice = array.indexOf(discente);
		if(indice == -1) {
			//exceção discente nao existe
		} else {
			array.remove(indice);
		}
	}

	@Override
	public Aluno consultar(String nome) {
		for(int i = 0;i < array.size();i++) {
			if(array.get(i).getNome().equals(nome)) {
				return array.get(i);
			} else {
				//exceção discente nao encontrado
			
			}
		}
		return null;
	}

	@Override
	public void atualizar(String discenteNome, int matricula, int idade) {
		Aluno dis = this.consultar(discenteNome);
		dis.setNome(discenteNome);
		dis.setIdade(idade);
		dis.setMatricula(matricula);
		
		
		// tem que lançar exceção pra cima?
		
	} 
}
