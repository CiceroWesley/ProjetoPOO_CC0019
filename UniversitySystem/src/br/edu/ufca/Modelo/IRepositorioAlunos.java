package br.edu.ufca.Modelo;

public interface IRepositorioAlunos {
	void adicionar(Aluno discente);
		
	void remover(Aluno discente);
	
	Aluno consultar(String nome);
	
	public void atualizar(String discenteNome, int matricula, int idade);
		
}
