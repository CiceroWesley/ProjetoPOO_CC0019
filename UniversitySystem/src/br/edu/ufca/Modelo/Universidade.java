package br.edu.ufca.Modelo;

public class Universidade {
	//private NegocioDisciplina cadeiras;
	private NegocioAluno discentes;
	//private NegocioProfessor docentes;
	
	public Universidade() {
		this.discentes = new NegocioAluno(new RepositorioAlunosArrayList());
	}
	
	public void adicionarAluno(String nome,int matricula,int idade) {
		//lançar exceções
		Aluno dis = new Aluno(nome,matricula,idade);
		discentes.adicionar(dis);
	}
        
        public void trancarCurso(String nome){
            discentes.trancar(nome);
        }
        
        public void removerAluno(String nome){
            discentes.remover(nome);
        }
}
