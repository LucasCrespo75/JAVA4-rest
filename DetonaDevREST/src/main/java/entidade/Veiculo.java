package entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "VIEUCLO")
public class Veiculo {
	
		@Id
		@Column(name = "ID_PLACA", nullable = false)
		private String id_placa;
		
		@Column(name = "MODELO", nullable = false)
		private String modelo;
		
		@Column(name = "FABRICANTE", nullable = false)
		private String fabricante;
		
		@Column(name = "TIPO", nullable = false)
		private String tipo;
		
		@Column(name = "ANO", nullable = false)
		private Date ano;
		
		@Column(name = "COR", nullable = false)
		private String cor;
		
		@ManyToOne
		@JoinColumn(name = "ID_CLIENTE", referencedColumnName = "CPF_ID", nullable = false)
		private Cliente cliente;

		public String getId_placa() {
			return id_placa;
		}

		public String getModelo() {
			return modelo;
		}

		public String getFabricante() {
			return fabricante;
		}

		public String getTipo() {
			return tipo;
		}

		public Date getAno() {
			return ano;
		}

		public String getCor() {
			return cor;
		}

		public Cliente getCliente() {
			return cliente;
		}

		public void setId_placa(String id_placa) {
			this.id_placa = id_placa;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public void setFabricante(String fabricante) {
			this.fabricante = fabricante;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public void setAno(Date ano) {
			this.ano = ano;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
}
