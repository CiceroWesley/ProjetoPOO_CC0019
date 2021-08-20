package br.edu.ufca.Modelo;

public interface IRepositorioAlunos {
	void adicionar(Aluno discente);
		
	void remover(Aluno discente);
	
	Aluno consultar(String nome);
	
	int existe(Aluno discente);
	
	public void atualizar(Aluno discente, String nome, int matricula, int idade);
		
}
