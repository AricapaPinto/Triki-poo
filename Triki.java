public class Triki{

	private String jugador_1;
	private String jugador_2;
	private int turno;
	private char tablero[][];
	private boolean en_juego;
	private int cant_jugadas;

	public Triki(){
		this.jugador_1 = "";
		this.jugador_2 = "";
		this.turno = 1;
		this.en_juego = true;
		this.cant_jugadas = 0;
		this.tablero = new char [3][3];
		this.limpiarTablero();
	}

	public void limpiarTablero(){
		for (int i=0; i<this.tablero.length; i++ ) {
			for (int j=0; j<this.tablero[i].length; j++) {
				this.tablero[i][j] = '-';
			}
		}
	}

	public void imprimirTablero(){
		for (int i=0; i<this.tablero.length; i++ ) {
			for (int j=0; j<this.tablero[i].length; j++) {
				System.out.print("["+this.tablero[i][j]+"] ");
			}
			System.out.println();
		}
	}

}