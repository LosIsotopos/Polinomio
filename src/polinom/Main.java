package polinom;

import java.io.FileNotFoundException;
import main.java.edu.unlam.progra.crono.Cronometro;
import main.java.edu.unlam.progra.crono.Precision;
import main.java.edu.unlam.progra.crono.presentadores.PresentadorDeTiempos;
import main.java.edu.unlam.progra.crono.presentadores.PresentadorDeTiemposDetallado;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "grado";
		String grado = "3";
		int x = 2;
		Polinomio p1 = new Polinomio(path+ grado +".in");
//		p1.mostrar();
		
		Cronometro crono = new Cronometro(Precision.MICROSEGUNDOS);
		crono.clic(); 
		//Empieza a correr el cronometro
		
		System.out.println(p1.evaluarMSucesivas(x));
		crono.clic();
		System.out.println(p1.evaluarRecursiva(x));
		crono.clic();
		System.out.println(p1.evaluarRecursivaPar(x));
		crono.clic();
//		System.out.println(p1.evaluarProgDinamica(x));
//		crono.clic();
//		System.out.println(p1.evaluarMejorada(x));
//		crono.clic();
//		System.out.println(p1.evaluarPow(x));
//		crono.clic();
		System.out.println(p1.evaluarHorner(x));
		crono.clic();
		
		System.out.println("Detalles");
		PresentadorDeTiempos detalles = new PresentadorDeTiemposDetallado(crono.getMediciones());
		System.out.println(detalles.toString());
	}

}
