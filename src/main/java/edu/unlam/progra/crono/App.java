package main.java.edu.unlam.progra.crono;

import main.java.edu.unlam.progra.crono.presentadores.PresentadorDeTiempos;
import main.java.edu.unlam.progra.crono.presentadores.PresentadorDeTiemposDetallado;
import main.java.edu.unlam.progra.crono.presentadores.PresentadorDeTiemposPromedio;

/**
 * Ejemplo de uso del cronometro
 * 
 * @author lucas
 *
 */
public class App {

	public static void main(String[] args) throws InterruptedException {

		Cronometro crono = new Cronometro(Precision.MILISEGUNDOS);

		crono.clic();
		Thread.sleep(1600);
		crono.clic();
		Thread.sleep(500);
		crono.clic();

		System.out.println("Detalles");
		PresentadorDeTiempos detalles = new PresentadorDeTiemposDetallado(crono.getMediciones());
		System.out.println(detalles.toString());
		
		System.out.println("Promedio");
		PresentadorDeTiempos promedios = new PresentadorDeTiemposPromedio(crono.getMediciones());
		System.out.println(promedios.toString());
	}
}
