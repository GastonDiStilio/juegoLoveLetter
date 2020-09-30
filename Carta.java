package loveLetter;

public abstract class Carta  {
		String nombre, descripcion;
		int fuerza;
		
		public Carta(String n, String d, int f) {
			nombre = n;
			descripcion = d;
			fuerza = f;
		}
		
		@Override
		public String toString() {
			return "\nCarta:"+nombre+" | "+descripcion+"Fuerza: "+fuerza;
			
		}
		public int getFuerza() {
			return fuerza;
		}


		public void setFuerza(int fuerza) {
			this.fuerza = fuerza;
		}


		public abstract void activarEfecto(Jugador2 j);
		
		public void mostrarCarta() {
			System.out.println(this);
		}
		
		public int compararCartas(Carta c) {
			return this.nombre.compareTo(c.nombre);
		}
		
		
		
}
