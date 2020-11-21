package entidade;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente")

public class Cliente {
	@Id
	@Column(name = "CPF_ID", nullable = false)
	private String cpf_id;
	
	@Column(name = "NOME", nullable = false)
	private String nome;
	
	@Column(name = "TELEFONE", nullable = false)
	private double telefone;
	
	@Column(name = "EMAIL", nullable = false)
	private String email;
	
	
	@OneToMany(mappedBy = "CLIENTE", cascade = CascadeType.ALL)
	private List<Veiculo> veiculos;

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	public String getCpf_id() {
		return cpf_id;
	}

	public String getNome() {
		return nome;
	}

	public Double getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setCpf_id(String cpf_id) {
		this.cpf_id = cpf_id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTelefone(Double telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	

}
