package br.edu.ufca.Modelo;
import br.edu.ufca.Exceptions.AlunoJaExisteException;
import br.edu.ufca.Exceptions.AlunoNaoExisteException;

public class NegocioAluno {
	private RepositorioAlunosArrayList repositorio;
	
	
	public NegocioAluno(RepositorioAlunosArrayList repositorio) {
		this.repositorio = repositorio;
	}
	
	public void adicionar(Aluno discente) throws AlunoJaExisteException  {
		int existe = repositorio.existe(discente);
		if(existe == 0) {
                    repositorio.adicionar(discente);
                    //System.out.println("AQUIIIII");
		} else {
                    throw new AlunoJaExisteException();
                    //lançar exceção ja existe
                    //System.out.println("ERRO");
		}
	}
	
	public void remover(String nome) throws AlunoNaoExisteException {
		Aluno dis = repositorio.consultar(nome);
		if(dis != null) {
                        System.out.println("negocio");
			repositorio.remover(dis);
		} else {
                    throw new AlunoNaoExisteException();
			//conta nao existe exceção
		}
	}
	
	public void atualizar(String nome1,String nome,int matricula, int idade) throws AlunoNaoExisteException {
		Aluno dis = repositorio.consultar(nome1);
		if(dis != null) {
                    repositorio.atualizar(dis, nome, matricula, idade);
		} else {
                    throw new AlunoNaoExisteException();
                    //conta nao existe exceção
		}
	}
	
	public void trancar(String nome) throws AlunoNaoExisteException {
		Aluno discente = repositorio.consultar(nome);
		if(discente != null) {
                    discente.trancarCruso();
		} else {
                    throw new AlunoNaoExisteException();
                    //aluno nao existe exceção
		}
	}
        
        public Aluno consultar(String nome) throws AlunoNaoExisteException{
            Aluno discente = repositorio.consultar(nome);
            if(discente != null){
                return discente;
            } else{
                throw new AlunoNaoExisteException();
                //return null;
                //aluno não existe exceção
            }
        }
	
}
