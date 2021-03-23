//Jefferson Mario Lichtenfels
package corrida.moto;

public class Piloto {

	private String nome;
	private Integer pontos = 0;
	
	
	public Piloto(String nome) {
		super();
		this.nome = nome;
	}
	
	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}
	
	public void setSomarPontos(Integer novosPontos) {
		this.pontos += novosPontos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	 
	@Override
	public String toString() {
		return "Piloto " + nome + " = " + pontos;
	}	
	
}
