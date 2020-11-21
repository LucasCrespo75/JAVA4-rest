package dao;

import java.util.List;

import entidade.Cliente;
import entidade.Ordem_Servico;

public interface Ordem_ServicoDAO {
	
	public void inserirOrdem_Servico(Ordem_Servico ordem_servico) ;
	
	public void alterarOrdem_Servico(int id_ordemServico);
	
	public Ordem_Servico pesquisarOrdem_Servico(int id_ordemServico);
	
	public void excluirOrdem_Servico(int id_ordemServico);
	
	public List<Ordem_Servico> listarOrdens();

}
