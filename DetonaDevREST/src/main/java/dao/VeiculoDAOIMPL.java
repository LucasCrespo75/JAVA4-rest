package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entidade.Cliente;
import entidade.Ordem_Servico;
import entidade.Veiculo;
import util.JpaUtil;

public class VeiculoDAOIMPL implements VeiculoDAO {

	@Override
	public void inserirVeiculo(Veiculo veiculo) {
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		tx.begin();
		
		ent.persist(veiculo);
		
		tx.commit();
		ent.close();
		
		
	}

	@Override
	public void alterarVeiculo(String placa) {
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		tx.begin();
		
		ent.merge(placa);
		//ent.merge(id_cliente);
		
		tx.commit();
		ent.close();
		
	}

	@Override
	public Veiculo pesquisarVeiculo(String placa) {
		EntityManager ent = JpaUtil.getEntityManager();
		Veiculo veiculo = ent.find(Veiculo.class,placa);
		
		return veiculo;
	}

	@Override
	public void excluirVeiculo(String placa) {
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		tx.begin();
		
		ent.remove(placa);
		
		tx.commit();
		ent.close();
		
		
	}

	@Override
	public List<Veiculo> listarVeiculos() {
		String sql = "FROM VEICULO V";
		
		List<Veiculo> listarVeiculos = new ArrayList<Veiculo>();
		
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		tx.begin();
		
		listarVeiculos = ent.createNamedQuery("FROM VEICULO V").getResultList();
	
		
		return listarVeiculos;
	}

}
