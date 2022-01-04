package com.indra.formacion.stream;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamClass {

	public static void almacenarInteger() {
		// Stream.of() Almacena en un stream numeros del 1 al 9
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		stream.forEach(p -> System.out.println(p));
	}

	public static void matrizInteger() {
		Stream<Integer> stream = Stream.of(new Integer[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		stream.forEach(p -> System.out.println(p));
	}

	public static void arrayInteger() {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		Stream<Integer> stream = list.stream();
		stream.forEach(p -> System.out.println(p));
	}

	public static void generarNumerosRandom() {
		Stream<Integer> randomNumbers = Stream.generate(() -> (new Random()).nextInt(100));
		randomNumbers.limit(20).forEach(System.out::println);
	}

	public static void codigoASCIISplit() {
		// Te guarda el numero del codigo ASCII
		IntStream stream1 = "12345_abcdefg".chars();
		stream1.forEach(p -> System.out.println(p));

		// OR
		// Limpia la cadena y te guarda solo las letras A,B,C
		Stream<String> stream = Stream.of("A$B$C".split("\\$"));
		stream.forEach(p -> System.out.println(p));
	}

	public static void recopilarNumeroPar() {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		Stream<Integer> stream = list.stream();
		List<Integer> evenNumbersList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.print(evenNumbersList);
	}

	public static void recopilamosNumerosParesMatriz() {
		List<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		Stream<Integer> stream = list.stream();
		Integer[] evenNumbersArr = stream.filter(i -> i % 2 == 0).toArray(Integer[]::new);

		for (Integer p : evenNumbersArr) {
			System.out.print(p + " ");
		}
	}

	public static void filterLetra(List<String> memberNames) {
		memberNames.stream().filter((s) -> s.startsWith("A")).forEach(System.out::println);
	}

	public static void filterPonerMayuscula(List<String> memberNames) {
		memberNames.stream().filter((s) -> s.startsWith("A")).map(String::toUpperCase).forEach(System.out::println);
	}

	public static void recorrerListMayuscula(List<String> memberNames) {
		memberNames.stream().sorted().map(String::toUpperCase).forEach(System.out::println);
	}

	public static void ordenarAlfabeticamente(List<String> memberNames) {
		List<String> memNamesInUppercase = memberNames.stream().sorted().map(String::toUpperCase)
				.collect(Collectors.toList());
		System.out.print(memNamesInUppercase);
	}

	public static void anyAllNoneMatch(List<String> memberNames) {

		// anymatch: devuelve true si algun valor cumple la condicion
		boolean matchedResult = memberNames.stream().anyMatch((s) -> s.startsWith("A"));

		// boolean matched = memberNames.stream()
		// .anyMatch((s) -> s.startsWith("A"));
		//
		// System.out.println(matched);

		System.out.println(matchedResult); // true

		// allMatch: nos devuelve true si todos cumple la condicion
		matchedResult = memberNames.stream().allMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult); // false

		// noneMatch: si ninguno cumple la condicion
		matchedResult = memberNames.stream().noneMatch((s) -> s.startsWith("A"));

		System.out.println(matchedResult);
	}

	public static void cuentaCondicion(List<String> memberNames) {
		// COUNT nos devuelven los que empiezan por A
		long totalMatched = memberNames.stream().filter((s) -> s.startsWith("A")).count();

		System.out.println(totalMatched);

	}

	public static void introduceCaracter(List<String> memberNames) {
		Optional<String> reduced = memberNames.stream().reduce((s1, s2) -> s1 + "#" + s2);
		reduced.ifPresent(System.out::println);
	}

	public static void secuenciasParalelas() {
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
		}

		// Here creating a parallel stream
		Stream<Integer> stream = list.parallelStream();

		Integer[] evenNumbersArr = stream.filter(i -> i % 2 == 0).toArray(Integer[]::new);
		for (Integer p : evenNumbersArr) {
			System.out.print(p + " ");
		}
	}

	public static void primerNombrePorFilter(List<String> memberNames) {
		String firstMatchedName = memberNames.stream().filter((s) -> s.startsWith("L")).findFirst().get();

		System.out.println(firstMatchedName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		almacenarInteger();
//		matrizInteger();
//		arrayInteger();
//		generarNumerosRandom();
//		codigoASCIISplit();
//      recopilarNumeroPar();
//		recopilamosNumerosParesMatriz();
		List<String> memberNames = new ArrayList<>();
		memberNames.add("Amitabh");
		memberNames.add("Shekhar");
		memberNames.add("Aman");
		memberNames.add("Rahul");
		memberNames.add("Shahrukh");
		memberNames.add("Salman");
		memberNames.add("Yana");
		memberNames.add("Lokesh");
//		filterLetra(memberNames);
//		filterPonerMayuscula(memberNames);
//		recorrerListMayuscula(memberNames);
		// Recorrer list
		// memberNames.forEach(System.out::println);
//		ordenarAlfabeticamente(memberNames);
//		anyAllNoneMatch(memberNames);
//		cuentaCondicion(memberNames);
//		introduceCaracter(memberNames);

		//primerNombrePorFilter(memberNames);

		//secuenciasParalelas();
	
		
		//syso   CONTRL + ESP
		//for
		//main
	}

}
