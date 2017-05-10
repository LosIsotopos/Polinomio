package polinom;

import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "grado";
		String grado = "1000";
		double x = 1.14535;
		Polinomio p1 = new Polinomio(path+ grado +".in");
		long tIniResol;
		long tFinResol;
		long diff;
		long tot = 0;
//		p1.mostrar();
		
//		Cronometro crono = new Cronometro(Precision.MICROSEGUNDOS);
//		crono.clic(); 
		//Empieza a correr el cronometro
		
//		System.out.println(p1.evaluarMSucesivas(x));
//		crono.clic();
//		System.out.println(p1.evaluarRecursiva(x));
//		crono.clic();
//		System.out.println(p1.evaluarRecursivaPar(x));
//		crono.clic();
		for (int i = 0; i < 1000; i++) {
			tIniResol = System.nanoTime();
			System.out.println(p1.evaluarProgDinamica(x));
			System.out.println(p1.evaluarMejorada(x));
			tFinResol = System.nanoTime();
			diff = tFinResol - tIniResol;
			tot += diff;
//			x+=0.001;
		}
		tot/=1000;
		System.out.println("Tiempo Prom de ProgDinamica() = " + tot/1000 + " microsegs");
//		crono.clic();
//		System.out.println(p1.evaluarMejorada(x));
//		crono.clic();
//		System.out.println(p1.evaluarPow(x));
//		crono.clic();
//		System.out.println(p1.evaluarHorner(x));
//		crono.clic();
		
//		System.out.println("Detalles");
//		PresentadorDeTiempos detalles = new PresentadorDeTiemposDetallado(crono.getMediciones());
//		System.out.println(detalles.toString());
	}

}
