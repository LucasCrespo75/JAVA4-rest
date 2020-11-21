package dao;

import entidade.Funcionario;

public interface FuncionarioDAO {
	
	public void inserirFuncionario(Funcionario funcionario);
	
	public void alterarFuncionario(int codigo);
	
	public Funcionario pesquisarDuncionario(int codigo);
	
	public void excluirFuncionario(int codigo);
	

}
