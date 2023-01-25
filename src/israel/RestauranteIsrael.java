package israel;
/**
 * 
 * @author dam108
 * @version verion 1.0
 * Gestiona los comensales del restaurante de isreael
 * 
 *
 */
public class RestauranteIsrael {
	public int patatas;
	public int calamares;
	private static RestauranteIsrael r1;

	/**
	 * 
	 * @param a numero de patatas
	 * @param b numero de calamares
	 */
	
	public RestauranteIsrael(int a, int b) {
		this.patatas = a;
		this.calamares = b;
	}

	int cantP() {
		int a = this.patatas * 3;
		return a;
	}

	int cantC() {
		int ch = this.calamares * 6;
		return ch;
	}

	/**
	 * agreega calamares 
	 * @param c
	 */
	public void addCalamares(int c) {
		this.calamares = this.calamares + c;
	}

	/**
	 * agrega patatas
	 * @param d
	 */
	
	public void addPatatas(int d) {
		this.patatas = this.patatas + d;
	}

	public static void main(String[] args) {
		r1 = new RestauranteIsrael(50, 60);
		System.out.println("Cantidad de calamares: " + r1.calamares);
		System.out.println("Cantidad de patatas: " + r1.patatas);
		calculacomensales(r1);
		r1.addCalamares(1);
		r1.addPatatas(80);
		System.out.println("\nPedido Recibido!! Stock actual: ");
		System.out.println(r1.patatas + " patatas.\n" + r1.calamares + " calamares");
		calculacomensales(r1);
	}

	/**
	 * calcula el numero de comensales que ouedes atender con las patatas y calamares que dispones
	 * @param miRestaurante
	 */
	
	private static void calculacomensales(RestauranteIsrael miRestaurante) {
		if (miRestaurante.cantP() <= miRestaurante.cantC()) {
			System.out.println(
					"\nIsrael puede dar de comer a " + miRestaurante.cantP() + " personas con raciones de patatas máximo");
		} else {
			System.out.println(
					"\nIsrael puede dar de comer a " + miRestaurante.cantC() + " personas con raciones de calamares máximo");
		}
	}
}