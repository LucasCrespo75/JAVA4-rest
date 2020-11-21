package entidade;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FUNCIONARIO")
public class Funcionario {
	
		@Id
		@Column(name = "ID_CODIGO", nullable = false)
		private int id_codigo;
		
		@Column(name = "SENHA", nullable = false)
		private String senha;
		
		@Column(name = "TELEFONE", nullable = false)
		private Double telefone;
		
		@Column(name = "EMAIL", nullable = false)
		private String email;
		
		@OneToMany
		private List<Ordem_Servico> ordemServico;

		public int getId_codigo() {
			return id_codigo;
		}

		public String getSenha() {
			return senha;
		}

		public Double getTelefone() {
			return telefone;
		}

		public String getEmail() {
			return email;
		}

		public List<Ordem_Servico> getOrdemServico() {
			return ordemServico;
		}

		public void setId_codigo(int id_codigo) {
			this.id_codigo = id_codigo;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public void setTelefone(Double telefone) {
			this.telefone = telefone;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public void setOrdemServico(List<Ordem_Servico> ordemServico) {
			this.ordemServico = ordemServico;
		}
		
		
		
		
}