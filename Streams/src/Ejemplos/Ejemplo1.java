package Ejemplos;

import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class Ejemplo1 {

	public static void main(String[] args) {
		 Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(20);
		 System.out.println(streamIterated.findAny());
		 
		 IntStream intStream = IntStream.range(1, 3); // No incluye el 3
		 LongStream longStream = LongStream.rangeClosed(1, 3); // Incluye el 3
		 System.out.print("intStream: " + intStream.findAny() + "longStream: " + longStream.findAny());
		 
		 Stream<String> stream = Stream.of("Ignacio", "Patricia", "Horacio")
				 .filter(e -> e.toLowerCase().contains("h"));
		 Optional<String> elemento = stream.findFirst();
		 System.out.println(elemento);
//		 Optional<String> elementoError = stream.findFirst(); // Error!
		 
		 IntStream.range(1, 10).limit(3).forEach(System.out::println);
		 long cant = IntStream.range(1, 10).filter(x -> x%2 == 0).count();
		 System.out.println(cant);
		 
		 System.out.println(IntStream.range(1, 10).sum());
		 System.out.println(IntStream.range(1, 10).min());
		 System.out.println(IntStream.range(1, 10).average());
		 OptionalInt max = IntStream.range(1, 10).max();
		 
		 if (max.isPresent()) {
		    double valor = max.getAsInt();
		    System.out.println("El valor es: " + valor);
		} else {
		    System.out.println("No hay valor presente");
		}
		 

		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		empleados.add(new Empleado("Ignacio", "Sotelo", 120000, 3.0));
		empleados.add(new Empleado("Patricia", "Bagnes", 500000, 15.5));
		empleados.add(new Empleado("Elizabeth", "Ferreyra", 200000, 1.0));
		empleados.add(new Empleado("Marck", "Zuckenberg", 10000, 10.0));
		
		
		double tot = empleados.stream().filter(e -> e.getAntiguedad() > 5).
		mapToDouble(Empleado::getSueldo).sum();
		System.out.print(tot);
		

			
	}
}