package br.edu.ufca.Modelo;

public class NegocioAluno {
	private RepositorioAlunosArrayList repositorio;
	
	
	public NegocioAluno(RepositorioAlunosArrayList repositorio) {
		this.repositorio = repositorio;
	}
	
	public void adicionar(Aluno discente) {
		int existe = repositorio.existe(discente);
		if(existe == 0) {
			repositorio.adicionar(discente);
		} else {
			//lançar exceção ja existe
		}
	}
	
	public void remover(Aluno discente) {
		Aluno dis = repositorio.consultar(discente.getNome());
		if(dis != null) {
			repositorio.remover(discente);
		} else {
			//conta nao existe exceção
		}
	}
	
	public void atualizar(Aluno discente,String nome,int matricula, int idade) {
		int existe = repositorio.existe(discente);
		if(existe == 1) {
			repositorio.atualizar(discente, nome, matricula, idade);
		} else {
			//conta nao existe exceção
		}
	}
	
	public void trancar(String nome) {
		Aluno discente = repositorio.consultar(nome);
		if(discente != null) {
			discente.trancarCruso();
		} else {
			//aluno nao existe exceção
		}
	}
	
}
