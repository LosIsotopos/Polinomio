package polinom;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "polinomio1";
		Polinomio p1 = new Polinomio(path +".in");
		p1.mostrar();
//		System.out.println(p1.evaluarMSucesivas(2));
//		System.out.println(p1.evaluarRecursiva(2));
//		System.out.println(p1.evaluarRecursivaPar(2));
//		System.out.println(p1.evaluarProgDinamica(2));
		System.out.println(p1.evaluarHorner(2));
	}

}
