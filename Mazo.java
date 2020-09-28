package loveLetter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class Mazo  {
	List <Carta> mazoCartas;
	int cantCartas;
	
	public Mazo() {
		mazoCartas = new ArrayList<Carta>();
		mazoCartas.add(new Condesa("Condesa","",7));
		mazoCartas.add(new Principe("Principe","",5));
		mazoCartas.add(new Principe("Principe","",5));
		mazoCartas.add(new Rey("Rey","",6));
		mazoCartas.add(new Princesa("Princesa","",8));
		mazoCartas.add(new Guardia("Guardia","",1));
		mazoCartas.add(new Guardia("Guardia","",1));
		mazoCartas.add(new Guardia("Guardia","",1));
		mazoCartas.add(new Guardia("Guardia","",1));
		mazoCartas.add(new Guardia("Guardia","",1));
		
		mazoCartas.add(new Sacerdote("Sacerdote","",2));
		mazoCartas.add(new Sacerdote("Sacerdote","",2));
		
		mazoCartas.add(new Baron("Baron","",3));
		mazoCartas.add(new Baron("Baron","",3));
		
		mazoCartas.add(new Mucama("Mucama","",4));
		mazoCartas.add(new Mucama("Mucama","",4));
		
		Collections.shuffle(mazoCartas);
		cantCartas = 16;
	}
	
	  public void reparto(Jugador j1) {
		  j1.asignarCarta(mazoCartas.get(16-cantCartas));		  
		  cantCartas--;
	  }
	
}
