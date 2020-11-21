package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entidade.Ordem_Servico;
import util.JpaUtil;

public class Ordem_ServicoDAOIMPL implements Ordem_ServicoDAO {

	@Override
	public void inserirOrdem_Servico(Ordem_Servico ordem_servico) {
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		tx.begin();
		
		ent.persist(ordem_servico);
		
		tx.commit();
		ent.close();
		
	}

	

	@Override
	public void alterarOrdem_Servico(int id_ordemServico) {
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		tx.begin();
		
		ent.merge(id_ordemServico);
		
		tx.commit();
		ent.close();
		
	}

	@Override
	public Ordem_Servico pesquisarOrdem_Servico(int id_ordemServico) {
		EntityManager ent = JpaUtil.getEntityManager();
		Ordem_Servico ordem_ervico = ent.find(Ordem_Servico.class,id_ordemServico);
		
		return ordem_ervico;
		
	}

	@Override
	public void excluirOrdem_Servico(int id_ordemServico) {
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		tx.begin();
		
		ent.remove(id_ordemServico);
		
		tx.commit();
		ent.close();
		
		
	}

	@Override
	public List<Ordem_Servico> listarOrdens() {
		String sql = "FROM ORDENS O";
		
		List<Ordem_Servico> listarOrdens = new ArrayList<Ordem_Servico>();
		
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		tx.begin();
		
		listarOrdens = ent.createNamedQuery("FROM ORDENS O").getResultList();
	
		
		return listarOrdens;
	}
	

}
