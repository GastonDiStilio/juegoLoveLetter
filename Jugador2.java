package loveLetter;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Jugador2 {

	String usuario;
	List <Carta> manoCartas;
	
	
	public Jugador2(String user) {
		usuario = user;
		 manoCartas = new LinkedList<Carta>();	
	}
	
	public void asignarCarta(Carta c) {
			manoCartas.add(c);
	}
	
	public void tirarCarta(int n, Jugador2 nJugador) {
		manoCartas.get(n-1).activarEfecto(nJugador);
		System.out.println("El jugador tira: "+manoCartas.remove(n-1));
		
	}
	
	
	
	public void verMazo(Jugador2 n) {
		n.mostrarMano();
	}
	
	
	public void descartarCarta(List<Jugador2> juga) {
		Scanner cartaElegida = new Scanner(System.in);
		int n=0;
		Carta c;
		mostrarMano();
		if(manoCartas.contains(c=new Condesa()) && (manoCartas.contains(new Principe()) || manoCartas.contains(new Rey()))) {
			n = manoCartas.indexOf(c)+1;
			System.out.println("Se debe tirar la condesa, oprimir cualquier tecla para descartarla....");
			cartaElegida.next();//Se espera una tecla por parte del jugador para continuar
			}
		
		else {
			do {
			System.out.println("Elija una carta a tirar: 1 o 2: ");
		n = cartaElegida.nextInt();
			}while(n<1 && n>2);
		}
		c = this.manoCartas.get(n-1);
		if(c.getFuerza()==4 || c.getFuerza()==8)
			tirarCarta(n,juga.get(1));			///Le paso cualquier jugador para que active el efecto,
												///Ya que son cartas que activan el efecto en el que la tira
		else { 
		
		tirarCarta(n,juga.get(elegirJugador(juga.size())-1));
		}
	}
	
	private int elegirJugador(int cantJug) {
		Scanner leoTeclado = new Scanner(System.in);
		int n;
		do {
			System.out.println("Elegir Jugador: ");
			n = leoTeclado.nextInt();
		}while(n<0  && n>cantJug-1);
		return n;
	}
	
	private void mostrarMano() {
		for(Carta c: manoCartas) {
			System.out.println(c);
		}
	}
}
