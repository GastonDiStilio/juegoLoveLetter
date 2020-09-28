package loveLetter;

import java.util.ArrayList;
import java.util.Scanner;

public class Jugador {
			String usuario;
	List <Carta> manoCartas;
	
	
	public Jugador2(String user) {
		usuario = user;
		 manoCartas = new LinkedList<Carta>();	
	}
	
	public void asignarCarta(Carta c) {
			manoCartas.add(c);
	}
	
	public void tirarCarta(int n) {
		System.out.println(manoCartas);
		System.out.println("El jugador tira: "+manoCartas.remove(n));

	}
	
	public void descartarCarta() {
		Scanner cartaElegida = new Scanner(System.in);
		int n=0;
		Carta c;
		
		if(manoCartas.contains(c=new Condesa("Condesa","asd",7)) && (manoCartas.contains(new Principe("Principe","asd",5)) || manoCartas.contains(new Rey("Rey","asd",6))))
			n = manoCartas.indexOf(c)+1;
		
		else {
			System.out.println("Elija una carta a tirar: 1 o 2: ");
		n = cartaElegida.nextInt();
		}
		tirarCarta(n);
		
	}
		
}
