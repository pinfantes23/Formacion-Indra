package CuentaBancoOrd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Banco implements Comparable<Banco> {

	int dinero;

	public Banco(int dinero) {
		this.dinero = dinero;
	}

	// Nos devuelve si es menor, mayor ó igual
	@Override
	public int compareTo(Banco o) {
		return this.dinero - o.dinero;
	}

	@Override
	public String toString() {
		return "Banco [dinero=" + dinero + "]";
	}

	public static void OrdBanco(ArrayList<Banco> lista) {

		Collections.sort(lista, (Banco b1, Banco b2) -> {
			int dinero1 = b1.dinero;
			int dinero2 = b2.dinero;
			if (dinero1 > dinero2)
				return 1;
			if (dinero1 < dinero2)
				return -1;
			return 0;
		});
	}
}