package CuentaBancoOrd;

import java.util.ArrayList;
import java.util.Collections;

public class Vista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco a = new Banco(10);
		Banco b = new Banco(273);
		Banco c = new Banco(3);
		Banco d = new Banco(5);
		Banco e = new Banco(600);
		Banco f = new Banco(2);
		
		ArrayList<Banco> lista= new ArrayList<Banco>();
		lista.add(a);
		lista.add(b);
		lista.add(c);
		lista.add(d);
		lista.add(e);
		lista.add(f);
		
		//Banco.OrdBanco(lista);
		//System.out.println("Ordenado en clase Banco: " + lista);
		
		// De esta forma tambien lo ordena mucho mas rapido y sencillo 
		Collections.sort(lista);
		System.out.println("Ordenado: " + lista);
		
	} 

}
