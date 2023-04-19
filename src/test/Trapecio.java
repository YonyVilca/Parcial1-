package test;
/*
 * Class			:Trapecio.java
 * Description		:Calcula y evalúa el método del trapecio con programación secuencial y paralela.
 * Autor			:Yony Alex Vilca Mamani
 * Fecha			:18-Abril-2023 12:56 a.m.
 * Course			:Lenguaje de Programación III
 * Editor			:Eclipse
 */

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class Trapecio {
	/*
	 * Input 01		:Funcion a ecaluar Tipo:String. Ejemplo: "2x^2+1"
	 * Input 02		:Limite inferior Tipo: int. Ejemplo: 5
	 * Input 03		:Limite superior. Tipo: int. Ejemplo:10
	 */
	
	
	public static void main(String args[]) {
		//Capturando el inicio de la ejecucion del programa long start = system.nanoTime();
		//Imprimiendo presentación y mostrando datos de entrada
		long start = System.nanoTime();
		//Imprimiendo presentación y mostrando datos de entrada
		System.out.println(" - - - - - - - - - - - -");
		System.out.println(" - Método del trapecio -");
		System.out.println(" - - - - - - - - - - - -");
		System.out.println("Función a evaluar : " + args[0]);
		System.out.println("Límite inferior : " + args[1]);
		System.out.println("Límite superior : " + args[2]);
		// Capturando el final de la ejecución del programa
		long end = System.nanoTime();
		//Mostrando el tiempo total de la ejecución del programa
		System.out.println("\n" + "TIEMPO TOTAL DE EJECUCIÓN : " + (end-start) + " ns.");
	}
}
