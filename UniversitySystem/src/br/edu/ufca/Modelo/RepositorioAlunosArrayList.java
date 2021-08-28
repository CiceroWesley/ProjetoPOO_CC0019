package br.edu.ufca.Modelo;

import java.util.ArrayList;

public class RepositorioAlunosArrayList implements IRepositorioAlunos {
	
	private ArrayList<Aluno> array;
        
        public RepositorioAlunosArrayList(){
            this.array = new ArrayList<Aluno>();
        }
	
	@Override
	public void adicionar(Aluno discente) {
		// TODO Auto-generated method stub
		array.add(discente);
		}


	@Override
	public void remover(Aluno discente) {
		array.remove(discente);
	}

	@Override
	public Aluno consultar(String nome) {
		for(int i = 0;i < array.size();i++) {
			if(array.get(i).getNome().equals(nome)) {
				return array.get(i);
			}
		}
		return null;
	}
	
	@Override
	public int existe(Aluno discente) {
            int indice = -1;
            for(int i = 0; i < array.size();i++){
                if(discente.getNome().equals(array.get(i).getNome()))
                    indice = 0;
            }
            
		//int indice = array.indexOf(discente);
		if(indice == -1) {
                    //System.out.println("Nao existe");
                    return 0;
                        
		} else {
                    //System.out.println(" existe");
                    return 1;
		}
	}

	@Override
	public void atualizar(Aluno discente,String nome, int matricula, int idade) {
		discente.setNome(nome);
		discente.setIdade(idade);
		discente.setMatricula(matricula);
				
	} 
}
