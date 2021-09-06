package br.edu.ufca.Modelo;

import br.edu.ufca.Exceptions.AlunoJaExisteException;
import br.edu.ufca.Exceptions.AlunoNaoExisteException;

public class Universidade {
	//private NegocioDisciplina cadeiras;
	private NegocioAluno discentes;
	//private NegocioProfessor docentes;
	
	public Universidade() {
		this.discentes = new NegocioAluno(new RepositorioAlunosArrayList());
	}
	
	public void adicionarAluno(String nome,int matricula,int idade) throws AlunoJaExisteException {
		//lançar exceções
		Aluno dis = new Aluno(nome,matricula,idade);
		discentes.adicionar(dis);
	}
        
        public void trancarCurso(String nome) throws AlunoNaoExisteException{
            discentes.trancar(nome);
        }
        
        public void removerAluno(String nome) throws AlunoNaoExisteException{
            //System.out.println("Univerisda");
            discentes.remover(nome);
        }
        public void atualizarAluno(String nome1, String nome2, int matricula2, int idade2) throws AlunoNaoExisteException{
            discentes.atualizar(nome1, nome2, matricula2, idade2);
        }
        
        public Aluno consultarAluno(String nome) throws AlunoNaoExisteException{
            Aluno discente = discentes.consultar(nome);
            return discente;
        }
}
