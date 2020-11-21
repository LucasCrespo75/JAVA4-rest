package dao;

import java.util.List;

import entidade.Material;

public interface MaterialDAO {
	
	public void inserirMaterial(Material material);
	
	public void alterarMaterial(int id_material);
	
	public Material pesquisarMaterial(int id_material);
	
	public void excluirMaterial(int id_material);
	
	public List<Material> listarMateriais();

}
