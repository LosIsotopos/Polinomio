package polinom;

import java.io.FileNotFoundException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		String path = "grado";
		String grado = "300";
		double x = 1.14535;
		Polinomio p1 = new Polinomio(path+ grado +".in");
		long tIniResol;
		long tFinResol;
		long diff;
		long tot = 0;
//		p1.mostrar();
//		System.out.println(p1.evaluarMSucesivas(x));
//		System.out.println(p1.evaluarRecursiva(x));
//		System.out.println(p1.evaluarRecursivaPar(x));
//		System.out.println(p1.evaluarProgDinamica(x));
//		System.out.println(p1.evaluarMejorada(x));
//		System.out.println(p1.evaluarPow(x));
//		System.out.println(p1.evaluarHorner(x));
		for (int i = 0; i < 1000; i++) {
			tIniResol = System.nanoTime();
			p1.evaluarMSucesivas(x);
			tFinResol = System.nanoTime();
			diff = tFinResol - tIniResol;
			tot += diff;
		}
		tot/=1000;
		System.out.println("Tiempo Prom de MSucesivas() = " + tot/1000 + " microsegs");
		
		for (int i = 0; i < 1000; i++) {
			tIniResol = System.nanoTime();
			p1.evaluarRecursiva(x);
			tFinResol = System.nanoTime();
			diff = tFinResol - tIniResol;
			tot += diff;
		}
		tot/=1000;
		System.out.println("Tiempo Prom de Recursiva() = " + tot/1000 + " microsegs");
		
		for (int i = 0; i < 1000; i++) {
			tIniResol = System.nanoTime();
			p1.evaluarRecursivaPar(x);
			tFinResol = System.nanoTime();
			diff = tFinResol - tIniResol;
			tot += diff;
		}
		tot/=1000;
		System.out.println("Tiempo Prom de RecursivaPar() = " + tot/1000 + " microsegs");
		
		for (int i = 0; i < 1000; i++) {
			tIniResol = System.nanoTime();;
			p1.evaluarProgDinamica(x);
			tFinResol = System.nanoTime();
			diff = tFinResol - tIniResol;
			tot += diff;
		}
		tot/=1000;
		System.out.println("Tiempo Prom de ProgDinamica() = " + tot/1000 + " microsegs");
		
		for (int i = 0; i < 1000; i++) {
			tIniResol = System.nanoTime();
			p1.evaluarMejorada(x);
			tFinResol = System.nanoTime();
			diff = tFinResol - tIniResol;
			tot += diff;
		}
		tot/=1000;
		System.out.println("Tiempo Prom de Mejorada() = " + tot/1000 + " microsegs");
		
		for (int i = 0; i < 1000; i++) {
			tIniResol = System.nanoTime();
			p1.evaluarPow(x);
			tFinResol = System.nanoTime();
			diff = tFinResol - tIniResol;
			tot += diff;
		}
		tot/=1000;
		System.out.println("Tiempo Prom de Pow() = " + tot/1000 + " microsegs");
		
		for (int i = 0; i < 1000; i++) {
			tIniResol = System.nanoTime();
			p1.evaluarHorner(x);
			tFinResol = System.nanoTime();
			diff = tFinResol - tIniResol;
			tot += diff;
		}
		tot/=1000;
		System.out.println("Tiempo Prom de Horner() = " + tot/1000 + " microsegs");
	}

}
