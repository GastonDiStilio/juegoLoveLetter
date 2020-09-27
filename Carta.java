package loveLetter;

public abstract class Carta  {
		String nombre, descripcion;
		int fuerza;
		
		public Carta(String n, String d, int f) {
			nombre = n;
			descripcion = d;
			fuerza = f;
		}
		
		
		public int getFuerza() {
			return fuerza;
		}


		public void setFuerza(int fuerza) {
			this.fuerza = fuerza;
		}


		public abstract void activarEfecto();
		
		public void mostrarCarta() {
			
		}
		
		public int compararCartas(Carta c) {
			return this.nombre.compareTo(c.nombre);
		}
		
		
		
}
