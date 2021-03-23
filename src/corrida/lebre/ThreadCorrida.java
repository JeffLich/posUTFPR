//Jefferson Mario Lichtenfels
package corrida.lebre;

import java.util.Random;

class ThreadCorrida implements Runnable {

	Thread thrd;
	Random random = new Random();
	Integer distancia = 0;
	Integer pulo = 0;
	Integer qtdade = 0;
	Lebre lebreCorredor = null;
	
	public void run() {
		System.out.println(thrd.getName() + " iniciou.");
		try {
			do {
				pulo =  gerarAleatorio(3,1);
				distancia += pulo;
				qtdade++;
				Thread.sleep(200);
				System.out.println("Lebre " + thrd.getName() + " saltou " + pulo + " metros");
			} while(distancia <= 20);
			System.out.println("Lebre " + thrd.getName() + " saltou " + distancia + " metros finalizando com o total de pulos: " + qtdade);
			lebreCorredor.setQtdadePulo(qtdade);
		} catch(InterruptedException exc) {
			System.out.println(thrd.getName() + " interrupted."); 
			System.out.println(thrd.getName() + " terminating.");
		}
	}
	
	public Lebre getLebreCorredor() {
		return lebreCorredor;
	}

	ThreadCorrida(Lebre lebre) {
		lebreCorredor = lebre;
		thrd = new Thread(this, lebre.getNome()); 
		thrd.start(); 
	}
	
	private int gerarAleatorio(int max, int min) {
        return random.nextInt((max - min) + 1) + min;
	}
	
	public Integer getDistancia() {
		return distancia;
	}


	public void setDistancia(Integer distancia) {
		this.distancia = distancia;
	}


	public Integer getPulo() {
		return pulo;
	}


	public void setPulo(Integer pulo) {
		this.pulo = pulo;
	}


	public Integer getQtdade() {
		return qtdade;
	}


	public void setQtdade(Integer qtdade) {
		this.qtdade = qtdade;
	}
}

