package br.edu.ufca.Modelo;

public interface IRepositorioAlunos {
	public void adicionar(Aluno discente);
		
	public void remover(Aluno discente);
	
	public Aluno consultar(String nome);
	
	public int existe(Aluno discente);
	
	public void atualizar(Aluno discente, String nome, int matricula, int idade);
		
}
