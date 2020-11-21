package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import entidade.Material;
import util.JpaUtil;

public class MaterialDAOIMPL implements MaterialDAO {

	@Override
	public void inserirMaterial(Material material) {
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		tx.begin();
		
		ent.persist(material);
		
		tx.commit();
		ent.close();
		
	}

	@Override
	public void alterarMaterial(int id_material) {
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		tx.begin();
		
		ent.merge(id_material);
		
		tx.commit();
		ent.close();
		
		
	}

	@Override
	public Material pesquisarMaterial(int id_material) {
		EntityManager ent = JpaUtil.getEntityManager();
		Material material = ent.find(Material.class, id_material);
		
		return material;
		
	}

	@Override
	public void excluirMaterial(int id_material) {
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		tx.begin();
		
		ent.remove(id_material);
		
		tx.commit();
		ent.close();
		
	}

	@Override
	public List<Material> listarMateriais() {
		String sql = "FROM MATERIAL M";
		
		List<Material> listarTodos = new ArrayList<Material>();
		
		EntityManager ent = JpaUtil.getEntityManager();
		EntityTransaction tx = ent.getTransaction();
		tx.begin();
		
		listarTodos = ent.createNamedQuery("FROM MATERIAL M").getResultList();
	
		
		return listarTodos;
	}



	}


