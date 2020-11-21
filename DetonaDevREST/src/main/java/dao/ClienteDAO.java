package dao;

import java.util.List;

import entidade.Cliente;

public interface ClienteDAO {
	
	public void inserirCliente(Cliente cliente);
	
	public void alterarCliente(String cpf);
	
	public Cliente pesquisarCliente(String cpf);
	
	public void excluirCliente(String cpf);
	
	public List<Cliente> listarTodos();

}
