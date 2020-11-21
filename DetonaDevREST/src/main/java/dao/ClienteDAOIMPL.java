package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entidade.Cliente;
import util.JpaUtil;

public class ClienteDAOIMPL implements ClienteDAO {

	@Override
	public void inserirCliente(Cliente cliente) {

		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		tx.begin();
		
		ent.persist(cliente);
		
		tx.commit();
		ent.close();
	}

	@Override
	public void alterarCliente(String cpf) {

		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		tx.begin();
		
		ent.merge(cpf);
		
		tx.commit();
		ent.close();
		
	}

	@Override
	public Cliente pesquisarCliente(String cpf) {

		EntityManager ent = JpaUtil.getEntityManager();
		Cliente cliente = ent.find(Cliente.class, cpf);
		
		return cliente;
		
	}

	@Override
	public List<Cliente> listarTodos() {
		String sql = "FROM CLIENTE C";
		
		List<Cliente> listarTodos = new ArrayList<Cliente>();
		
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		tx.begin();
		
		listarTodos = ent.createNamedQuery("FROM CLIENTE C").getResultList();
	
		
		return listarTodos;
	}

	@Override
	public void excluirCliente(String cpf) {
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		tx.begin();
		
		ent.remove(cpf);
		
		tx.commit();
		ent.close();
	}

}
