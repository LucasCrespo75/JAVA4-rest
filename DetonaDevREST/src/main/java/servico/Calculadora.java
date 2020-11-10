package servico;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

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
	@Produces(MediaType.TEXT_PLAIN)
	public String somar(@QueryParam("valor1") double valor1, @QueryParam("valor2") double valor2) {
		return "" + (valor1 + valor2);
		
	}

	@Path("/subtrair")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String subtrair(@QueryParam("valor1") double valor1, @QueryParam("valor2") double valor2) {
		return "" + (valor1 - valor2);
}
	@Path("/multiplicacao")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String multiplicacao(@QueryParam("valor1") double valor1, @QueryParam("valor2") double valor2) {
		return "" + (valor1*valor2);
}

	
	@Path("/dividir")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String dividir(@QueryParam("valor1") double valor1, @QueryParam("valor2") double valor2) {
		if(valor1 == 0) {
			System.out.println("NAO PODE SER DIVISIVEL POR ZERO");
		}
		if(valor2 == 0) {
			System.out.println("NAO PODE SER DIVISIVEL POR ZERO");
		}
	
		return "" + (valor1%valor2);

	}
}
