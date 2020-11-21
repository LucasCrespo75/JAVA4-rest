package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entidade.Funcionario;
import util.JpaUtil;

public class FuncionarioDAOIMPL implements FuncionarioDAO {

	@Override
	public void inserirFuncionario(Funcionario funcionario) {

		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		tx.begin();
		
		ent.persist(funcionario);
		
		tx.commit();
		ent.close();
		
	}

	@Override
	public void alterarFuncionario(int codigo) {
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		tx.begin();
		
		ent.merge(codigo);
		
		tx.commit();
		ent.close();
		
		
	}

	@Override
	public Funcionario pesquisarDuncionario(int codigo) {
		EntityManager ent = JpaUtil.getEntityManager();
		Funcionario funcionario = ent.find(Funcionario.class, codigo);
		
		return funcionario;
	}

	@Override
	public void excluirFuncionario(int codigo) {
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		tx.begin();
		
		ent.remove(codigo);
		
		tx.commit();
		ent.close();
		
	}
	

}