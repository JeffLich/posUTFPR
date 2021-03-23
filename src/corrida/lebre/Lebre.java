//Jefferson Mario Lichtenfels
package corrida.lebre;

public class Lebre {

	private String nome;
	private Integer qtdadePulo;
	
	public Lebre(String nome) {
		super();
		this.nome = nome;
	}
	
	public Integer getQtdadePulo() {
		return qtdadePulo;
	}

	public void setQtdadePulo(Integer qtdadePulo) {
		this.qtdadePulo = qtdadePulo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	 
	@Override
	public String toString() {
		return "Lebre " + nome + " qtdadePulo=" + qtdadePulo;
	}
}
