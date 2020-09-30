package loveLetter;

public class MainTemporal {
	public static void main(String args[]) {
		Jugador2 j1=new Jugador2("Maxi");
		Jugador2 j2 = new Jugador2("Pepe");
	
		
		Partida nuevaParti = new Partida(j1,j2,5);
		nuevaParti.iniciarPartida();
		
		
	}
}
