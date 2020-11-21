package servico;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import entidade.RetornoCalculadora;

@Path("/calculadora")
public class Calculadora {

	@Path("/")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String ola() {
		return "Funfando DetonaDevREST !!!";
	}

	@Path("/somar")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public RetornoCalculadora  somar(@QueryParam("valor1") double valor1, @QueryParam("valor2") double valor2) {
			
		RetornoCalculadora retorno = new RetornoCalculadora();
		retorno.setCodigoRetorno(0);
		retorno.setMensagemRetorno("SUCESSO!!");
		retorno.setResultado(valor1 + valor2);
		
		return retorno;
		
	}

	@Path("/subtrair")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public RetornoCalculadora  subtrair(@QueryParam("valor1") double valor1, @QueryParam("valor2") double valor2) {
		
		RetornoCalculadora retorno = new RetornoCalculadora();
		retorno.setCodigoRetorno(0);
		retorno.setMensagemRetorno("SUCESSO!!");
		retorno.setResultado(valor1 - valor2);
		
		return retorno;
}
	@Path("/multiplicacao")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public RetornoCalculadora  multiplicacao(@QueryParam("valor1") double valor1, @QueryParam("valor2") double valor2) {
		
		RetornoCalculadora retorno = new RetornoCalculadora();
		retorno.setCodigoRetorno(0);
		retorno.setMensagemRetorno("SUCESSO!!");
		retorno.setResultado(valor1 * valor2);
		
		return retorno;
}

	
	@Path("/dividir")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public RetornoCalculadora  dividir(@QueryParam("valor1") double valor1, @QueryParam("valor2") double valor2) {
		
		RetornoCalculadora retorno = new RetornoCalculadora();
		retorno.setCodigoRetorno(0);
		retorno.setMensagemRetorno("SUCESSO!!");
		retorno.setResultado(valor1/valor2);
	
		if(valor1 == 0) {
			retorno.setCodigoRetorno(1);
			retorno.setMensagemRetorno("NAO PODE SER DIVISIVEL POR ZERO");
		}else {
			retorno.setResultado(valor1/valor2);
	}
		return retorno;
}
}

