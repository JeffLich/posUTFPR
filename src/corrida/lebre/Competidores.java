//Jefferson Mario Lichtenfels
package corrida.lebre;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Competidores { 
	static ArrayList<Lebre> competidores = new ArrayList<Lebre>();
	
	public static void main(String args[]) {
		System.out.println("Inicio da Corrida.");
		
		ThreadCorrida mt = new ThreadCorrida(new Lebre("1"));
		ThreadCorrida mt2 = new ThreadCorrida(new Lebre("2"));
		ThreadCorrida mt3 = new ThreadCorrida(new Lebre("3"));
		ThreadCorrida mt4 = new ThreadCorrida(new Lebre("4"));
		ThreadCorrida mt5 = new ThreadCorrida(new Lebre("5"));
		
		do {
			//System.out.print("."); 
			try {
				Thread.sleep(50);
			} catch(InterruptedException exc) {
				System.out.println("Main thread interrupted.");
			}
		}while (mt.thrd.isAlive() ||
				mt2.thrd.isAlive() ||
				mt3.thrd.isAlive() ||
				mt4.thrd.isAlive() ||
				mt5.thrd.isAlive());
		
		System.out.println("\nFinal da corrida!\n");
		System.out.println("Classificação:\n");
		
		competidores.add(mt.getLebreCorredor());
		competidores.add(mt2.getLebreCorredor());
		competidores.add(mt3.getLebreCorredor());
		competidores.add(mt4.getLebreCorredor());
		competidores.add(mt5.getLebreCorredor());
		
		ordernarLista();
		
		System.out.println(competidores);
		
	}
	
	private static void ordernarLista() {
		 Collections.sort (competidores, new Comparator<Lebre>() {
		        public int compare(Lebre o1, Lebre o2) {
		            return o1.getQtdadePulo() < o2.getQtdadePulo() ? -1 : +1;
		        }
		    });	
	}
	
}