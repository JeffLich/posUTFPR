//Jefferson Mario Lichtenfels
package corrida.moto;

import java.util.Random;

class ThreadCorrida implements Runnable {

	Thread thrd;
	Random random = new Random();
	Piloto pilotoCorredor = null;
	volatile static Integer pontos = 10;
	
	public void run() {
			try {
				//coloquei um sleep aleatório para a corrida ficar mais emocionante
				Thread.sleep(gerarAleatorio(50,10));
				listaVencedor();
			} catch (Exception exc) {
				System.out.println(thrd.getName() + " interrupted."); 
			}
	}
	
	private synchronized void listaVencedor() {
		pilotoCorredor.setSomarPontos(pontos);
		
		if (pontos <= 1) {
			pontos = 10;
		}else {
			pontos --;
		}
	}
	

	public Piloto getPilotoCorredor() {
		return pilotoCorredor;
	}

	ThreadCorrida(Piloto piloto) {

		pilotoCorredor = piloto;
		thrd = new Thread(this, piloto.getNome()); 
		thrd.start(); 
	}

	private int gerarAleatorio(int max, int min) {
        return random.nextInt((max - min) + 1) + min;
	}
	
}

