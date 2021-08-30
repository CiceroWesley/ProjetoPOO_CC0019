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
            System.out.println("Univerisda");
            discentes.remover(nome);
        }
        public void atualizarAluno(String nome1, int matricula1, int idade1, String nome2, int matricula2, int idade2){
            Aluno dis = new Aluno(nome1,matricula1,idade1);
            discentes.atualizar(dis, nome2, matricula2, idade2);
        }
}
