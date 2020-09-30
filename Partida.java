package loveLetter;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Partida {
	private List <Jugador2> jugadores = new LinkedList<Jugador2>();
	private Mazo mazoCartas;
	private int cantSimbolosAfecto; 
	
	public Partida(Jugador2 j1, Jugador2 j2, int cantSimbol) {
		jugadores.add(j1);
		jugadores.add(j2);
		cantSimbolosAfecto = cantSimbol;
	}
	
	public Partida(Jugador2 j1, Jugador2 j2, Jugador2 j3, int cantSimbol) {
		jugadores.add(j1);
		jugadores.add(j2);
		jugadores.add(j3);
		cantSimbolosAfecto = cantSimbol;
	}
	
	public Partida(Jugador2 j1, Jugador2 j2, Jugador2 j3, Jugador2 j4, int cantSimbol) {
		jugadores.add(j1);
		jugadores.add(j2);
		jugadores.add(j3);
		jugadores.add(j4);
		cantSimbolosAfecto = cantSimbol;
	}
	
	private  Jugador2 devuelvoJugador(int n) {
		return this.jugadores.get(n-1);
	}
	public void iniciarPartida() {///La partida termina cuando un jugador tiene X simbolos de afecto o
									///cuando queda un solo jugador
		
		///Utilizar patron observer para cada jugador, para verificar la cantidad de simbolos de afecto
		  //que tiene, y hacer un WHILE con esa condicion
		
		///PONGO ESTO PARA FINALIZARLA ANTES Y PROBAR EL PROGRAMA
		Scanner leoTeclado = new Scanner(System.in);
		int finalizoPartida = 0;
		
		mazoCartas = new Mazo();
		mazoCartas.mezclarMazo();
		
		while(finalizoPartida==0) {
		for(Jugador2 j : jugadores)
			mazoCartas.reparto(j);
		
		while(mazoCartas.getCantCartas()>0) {
			for(Jugador2 i: jugadores) {
				System.out.println("Agarrar carta del mazo");
				leoTeclado.nextLine();///Espero tecla/Accion
				mazoCartas.reparto(i);
				i.descartarCarta(jugadores);
			}
		}
		
		mazoCartas.setCantCartas();
		mazoCartas.mezclarMazo();
		
		System.out.println("Presione 1 si quiere finalizar la partida, de lo contrario 0");
		finalizoPartida = leoTeclado.nextInt()!=1?0:1;
	}
	
	}
	
}
