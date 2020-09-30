package loveLetter;

public class Guardia extends Carta{

	public Guardia() {
		super("Guardia", "El jugador elige otro jugador oponente y nombra un tipo de carta (excepto \"Guardia\"). \n"
				+ "Si el oponente tiene en su mano una carta de ese tipo, el oponente es eliminado de la ronda", 1);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void activarEfecto(Jugador2 j) {
		// TODO Auto-generated method stub
		
	}
	
}
