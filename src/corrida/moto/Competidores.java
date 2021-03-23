//Jefferson Mario Lichtenfels
package corrida.moto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Competidores { 
	static ArrayList<Piloto> competidores = new ArrayList<Piloto>();
	
	
	public static void main(String args[]) {
		System.out.println(" Iniciando campeonato.");
		int m = 1;
		
		ThreadCorrida piloto1 = new ThreadCorrida(new Piloto("1"));
		ThreadCorrida piloto2 = new ThreadCorrida(new Piloto("2"));
		ThreadCorrida piloto3 = new ThreadCorrida(new Piloto("3"));
		ThreadCorrida piloto4 = new ThreadCorrida(new Piloto("4"));
		ThreadCorrida piloto5 = new ThreadCorrida(new Piloto("5"));
		ThreadCorrida piloto6 = new ThreadCorrida(new Piloto("6"));
		ThreadCorrida piloto7 = new ThreadCorrida(new Piloto("7"));
		ThreadCorrida piloto8 = new ThreadCorrida(new Piloto("8"));
		ThreadCorrida piloto9 = new ThreadCorrida(new Piloto("9"));
		ThreadCorrida piloto10 = new ThreadCorrida(new Piloto("10"));		

		try {
			piloto1.thrd.join();
			piloto2.thrd.join();	
			piloto4.thrd.join();
			piloto5.thrd.join();
			piloto6.thrd.join();
			piloto7.thrd.join();
			piloto8.thrd.join();
			piloto9.thrd.join();
			piloto10.thrd.join();
		
			do {
				
				competidores.add(piloto1.getPilotoCorredor());
				competidores.add(piloto2.getPilotoCorredor());
				competidores.add(piloto3.getPilotoCorredor());
				competidores.add(piloto4.getPilotoCorredor());
				competidores.add(piloto5.getPilotoCorredor());
				competidores.add(piloto6.getPilotoCorredor());
				competidores.add(piloto7.getPilotoCorredor());
				competidores.add(piloto8.getPilotoCorredor());
				competidores.add(piloto9.getPilotoCorredor());
				competidores.add(piloto10.getPilotoCorredor());			
				
				ordernarLista();
				
				System.out.println("\nClassificação ao final da " + m + " etapa do campeonato:");
				System.out.println(competidores + "\n");				
				competidores.clear();
				 
				
				
				piloto1.run();
				piloto2.run();
				piloto3.run();
				piloto4.run();
				piloto5.run();
				piloto6.run();
				piloto7.run();
				piloto8.run();
				piloto9.run();
				piloto10.run();
				
				m++;
				
			} while(m<=12);
		}catch	(Exception e) {
			
		}

		competidores.add(piloto1.getPilotoCorredor());
		competidores.add(piloto2.getPilotoCorredor());
		competidores.add(piloto3.getPilotoCorredor());
		competidores.add(piloto4.getPilotoCorredor());
		competidores.add(piloto5.getPilotoCorredor());
		competidores.add(piloto6.getPilotoCorredor());
		competidores.add(piloto7.getPilotoCorredor());
		competidores.add(piloto8.getPilotoCorredor());
		competidores.add(piloto9.getPilotoCorredor());
		competidores.add(piloto10.getPilotoCorredor());			
		
		ordernarLista();
		
		System.out.println("\nClassificação final do campeonato:");
		System.out.println(competidores);				
	}
	
	private static void ordernarLista() {
		 Collections.sort (competidores, new Comparator<Object>() {
		        public int compare(Object o1, Object o2) {
		            Piloto p1 = (Piloto) o1;
		            Piloto p2 = (Piloto) o2;
		            return p1.getPontos() < p2.getPontos() ? +1 : -1;
		        }
		    });	
	}
	

	
}