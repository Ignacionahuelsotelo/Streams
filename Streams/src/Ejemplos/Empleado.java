package Ejemplos;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Empleado{
	
	private String nombre;
	private String apellido;
	private int sueldo;
	private double antiguedad; 
	
	public Empleado(String nombre, String apellido, int sueldo, double antiguedad ) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.sueldo = sueldo;
		this.antiguedad = antiguedad;
	}
	
	public int getSueldo() {
		return this.sueldo;
	}
	
	public double getAntiguedad() {
		return this.antiguedad;
	}
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	
	
}

