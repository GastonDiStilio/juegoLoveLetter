package loveLetter;

import java.util.ArrayList;
import java.util.Scanner;

public class Jugador {
		String usuario;
		Carta [] vCarta;		
		
		
		public Jugador(String user) {
			usuario = user;
			vCarta = new Carta[2];
		}
		
		public void asignarCarta(Carta c) {
				if(vCarta.length==0)
					vCarta[0] = c;
				else vCarta[1] = c;
		}
		
		public void tirarCarta(Carta[] v, int n) {
			System.out.println(v[n]);
			v[n].activarEfecto();
			v[n].setFuerza(0);
		}
		
		public void descartarCarta() {
			Scanner cartaElegida = new Scanner(System.in);
			boolean condes = false, rey=false, principe = false;
			int cartaElijo, n=0, pos;
			

			
			for(Carta c : vCarta)
			{
				if(c.compararCartas(new Condesa("Condesa","asd",9))==0) {
					System.out.println("Solo puede tirar un príncipe o rey");
					condes = true;
					pos = n;
				}
				if(c.compararCartas(new Rey("Rey","asd",6))==0)
					rey = true;
				if(c.compararCartas(new Principe("Principe","asd",5))==0)
					principe = true;
				
				n++;
			}
			
			if((principe == true || rey == true)&& condes == true)
				{tirarCarta(vCarta, n);
				return;
				}
			System.out.println("Elija una carta a tirar: 1 o 2: ");
			cartaElijo = cartaElegida.nextInt();
			tirarCarta(vCarta,cartaElijo-1);
			
		}
		
}
