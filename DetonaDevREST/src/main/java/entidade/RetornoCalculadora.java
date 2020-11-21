package entidade;

public class RetornoCalculadora {
	
	private int codigoRetorno; //0 - sucesso 1 - erro
	private String mensagemRetorno;
	private double resultado;
	
	public int getCodigoRetorno() {
		return codigoRetorno;
	}
	public String getMensagemRetorno() {
		return mensagemRetorno;
	}
	public double getResultado() {
		return resultado;
	}
	public void setCodigoRetorno(int codigoRetorno) {
		this.codigoRetorno = codigoRetorno;
	}
	public void setMensagemRetorno(String mensagemRetorno) {
		this.mensagemRetorno = mensagemRetorno;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

}
