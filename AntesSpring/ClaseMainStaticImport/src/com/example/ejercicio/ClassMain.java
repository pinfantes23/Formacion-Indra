package com.example.ejercicio;

import static java.lang.Math.*;
import static java.lang.System.*;

import java.util.ArrayList;

public class ClassMain {
	
	public static void main(String[] args) {
		ArrayList<String> lista= new ArrayList();
		lista.add("Welcome to Indra");
		lista.add("Pedro");
		//Si no estuviese haciendo el static import de arriba seria Math.pow();
		double resultado= pow(2, 2);
		double resultado2= pow(3,3);
		double resultado3= PI*2;
		//Si no estuviese haciendo el static import de arriba seria System.out.println();
		out.println(resultado);
		out.println(resultado2);
		out.println(resultado3);
		out.println(lista);
	}

}

