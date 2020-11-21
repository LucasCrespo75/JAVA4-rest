package dao;

import java.util.List;

import entidade.Cliente;
import entidade.Veiculo;

public interface VeiculoDAO {
	
	public void inserirVeiculo(Veiculo veiculo);
	
	public void alterarVeiculo(String placa);
	
	public Veiculo pesquisarVeiculo(String placa);
	
	public void excluirVeiculo(String placa);
	
	public List<Veiculo> listarVeiculos();

}
