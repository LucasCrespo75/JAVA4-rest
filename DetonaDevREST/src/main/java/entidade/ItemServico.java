package entidade;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

public class ItemServico {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_ITEMSERVICO")
	@SequenceGenerator(name = "S_ITEMSERVICO", sequenceName = "S_ITEMSERVICO", initialValue = 1, allocationSize = 1)
	@Column(name = "ID", nullable = false)
	private int id_itemServico;
	
	@Column(name = "QTD", nullable = false)
	private int qtd;
	
	@ManyToOne
	@JoinColumn(name = "ID_MATERIAL", referencedColumnName = "ID_MATERIAL", nullable = false)
	private Material material;
	
	@ManyToOne
	@JoinColumn(name = "ID_ORDEMSERVICO", referencedColumnName = "ID_ORDEMSERVICO", nullable = false)
	private Ordem_Servico ordemServico;

	public int getId_itemServico() {
		return id_itemServico;
	}

	public int getQtd() {
		return qtd;
	}

	public Material getMaterial() {
		return material;
	}

	public Ordem_Servico getOrdemServico() {
		return ordemServico;
	}

	public void setId_itemServico(int id_itemServico) {
		this.id_itemServico = id_itemServico;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public void setOrdemServico(Ordem_Servico ordemServico) {
		this.ordemServico = ordemServico;
	}
	
	
}
