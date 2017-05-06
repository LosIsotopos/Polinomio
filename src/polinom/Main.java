package polinom;

import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "polinomio1";
		Polinomio p1 = new Polinomio(path +".in");
		p1.mostrar();
		Calendar tIniResol = new GregorianCalendar();
//		System.out.println(p1.evaluarMSucesivas(2));
//		System.out.println(p1.evaluarRecursiva(2));
//		System.out.println(p1.evaluarRecursivaPar(2));
//		System.out.println(p1.evaluarProgDinamica(2));
		System.out.println(p1.evaluarHorner(2));
		Calendar tFinResol = new GregorianCalendar();
		long diff = tFinResol.getTimeInMillis() - tIniResol.getTimeInMillis();
		System.out.println("Tiempo de resolverSistema() = " + diff + " milisegs");
	}

}
