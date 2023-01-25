package one.digitalinnovation.gof.subsistema2.crm;

public class CepApi {

	private static CepApi instancia = new CepApi();
	
	private CepApi() {
		super();
	}
	
	public static CepApi getInstancia() {
		return instancia;
	}
	
	public String recuperarCidade(String cep) {
		return "Pará de Minas";
	}
	
	public String recuperarEstado(String estado) {
		return "Minas Gerais";
	}
}
