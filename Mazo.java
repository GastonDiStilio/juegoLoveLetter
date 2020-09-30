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
		mazoCartas.add(new Condesa());
		mazoCartas.add(new Principe());
		mazoCartas.add(new Principe());
		mazoCartas.add(new Rey());
		mazoCartas.add(new Princesa());
		mazoCartas.add(new Guardia());
		mazoCartas.add(new Guardia());
		mazoCartas.add(new Guardia());
		mazoCartas.add(new Guardia());
		mazoCartas.add(new Guardia());
		
		mazoCartas.add(new Sacerdote());
		mazoCartas.add(new Sacerdote());
		
		mazoCartas.add(new Baron());
		mazoCartas.add(new Baron());
		
		mazoCartas.add(new Mucama());
		mazoCartas.add(new Mucama());
		cantCartas= 16;
		//cantCartas = 16;}
	
	public void setCantCartas() {
		cantCartas = 16;
	}
	
	public int getCantCartas() {
		return this.cantCartas;
	}
	public void mezclarMazo() {
		Collections.shuffle(mazoCartas);
	}
	
	  public void reparto(Jugador2 j1) {
		  
		  j1.asignarCarta(mazoCartas.get(16-cantCartas));
		  
		  cantCartas--;
	  }
	
}

}