package entidade;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = " ORDEM_SERVICO")

public class Ordem_Servico {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "S_ORDEMSERVICO")
	@SequenceGenerator(name = "S_ORDEMSERVICO", sequenceName = "S_ORDEMSERVICO", initialValue = 1, allocationSize = 1)
	@Column(name = "ID", nullable = false)
	private int id_ordemServico;
	
	@Column(name = "DATA_INICIO", nullable = false)
	private Date data_inicio;
	
	@Column(name = "DATA_ENTRADA", nullable = false)
	private Date data_entrada;
	
	@Column(name = "DATA_SERVICO_FIM", nullable = false)
	private Date data_servico_fim;
	
	@Column(name = "VALOR_TOTAL", nullable = false)
	private double valor_total;
	
	@Column(name = "VALOR_MAODEOBRA", nullable = false)
	private double valor_moadeobra;
	
	@Column(name = "QUILOMETRAGEM", nullable = false)
	private int quilometragem;
	
	@Column(name = "OBS", nullable = false)
	private String obs;
	
	@Column(name = "STATUS", nullable = false)
	private String status;
	
	@Column(name = "VALIDADE", nullable = false)
	private Date validade;
	
	@ManyToOne
	@JoinColumn(name = "FUNCIONARIO", referencedColumnName = "ID_CODIGO", nullable = false)
	private Funcionario funcionario;
	
	@OneToMany
	@JoinColumn(name = "VEICULO", referencedColumnName = "ID_PLACA", nullable = false)
	private Veiculo veiculo;

	public int getId_ordemServico() {
		return id_ordemServico;
	}

	public Date getData_inicio() {
		return data_inicio;
	}

	public Date getData_entrada() {
		return data_entrada;
	}

	public Date getData_servico_fim() {
		return data_servico_fim;
	}

	public double getValor_total() {
		return valor_total;
	}

	public double getValor_moadeobra() {
		return valor_moadeobra;
	}

	public int getQuilometragem() {
		return quilometragem;
	}

	public String getObs() {
		return obs;
	}

	public String getStatus() {
		return status;
	}

	public Date getValidade() {
		return validade;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setId_ordemServico(int id_ordemServico) {
		this.id_ordemServico = id_ordemServico;
	}

	public void setData_inicio(Date data_inicio) {
		this.data_inicio = data_inicio;
	}

	public void setData_entrada(Date data_entrada) {
		this.data_entrada = data_entrada;
	}

	public void setData_servico_fim(Date data_servico_fim) {
		this.data_servico_fim = data_servico_fim;
	}

	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}

	public void setValor_moadeobra(double valor_moadeobra) {
		this.valor_moadeobra = valor_moadeobra;
	}

	public void setQuilometragem(int quilometragem) {
		this.quilometragem = quilometragem;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	
	
}
