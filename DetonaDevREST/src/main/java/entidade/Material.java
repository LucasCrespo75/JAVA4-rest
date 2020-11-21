package entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = " MATERIAL")
public class Material {

		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_MATERIAL")
		@SequenceGenerator(name = "S_MATERIAL", sequenceName = "S_MATERIAL", initialValue = 1, allocationSize = 1)
		@Column(name = "ID", nullable = false)
		private int id_material;
		
		@Column(name = "DESCRICAO", nullable = false)
		private String descricao;
		
		@Column(name = "CODIGO", nullable = false)
		private int codigo;
		
		@Column(name = "FABRICANTE", nullable = false)
		private String fabricante;
		
		@Column(name = "CLASSIFICACAO", nullable = false)
		private String classificacao;
		
		@Column(name = "VALOR_UNITARIO", nullable = false)
		private double valor_unitario;
		
		@OneToMany(mappedBy = "MATERIAL", cascade = CascadeType.ALL)
		private List<ItemServico> itemServico;

		public int getId_material() {
			return id_material;
		}

		public String getDescricao() {
			return descricao;
		}

		public int getCodigo() {
			return codigo;
		}

		public String getFabricante() {
			return fabricante;
		}

		public String getClassificacao() {
			return classificacao;
		}

		public double getValor_unitario() {
			return valor_unitario;
		}

		public void setId_material(int id_material) {
			this.id_material = id_material;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}

		public void setClassificacao(String classificacao) {
			this.classificacao = classificacao;
		}

		public void setValor_unitario(double valor_unitario) {
			this.valor_unitario = valor_unitario;
		}
		
	}	

