package com.generation.evaluacionjavaobjetos;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.generation.evaluacionjavaobjetos.models.Cursos;
import com.generation.evaluacionjavaobjetos.models.Materia;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

@SpringBootApplication
public class EvaluacionjavaobjetosApplication {

/*AVISO: Puse cada función como pense que podrian funcionar, pero no logre que arrancara el código, intente explicar como funcionaria cada parte de código*/


// CASO PRÁCTICO //

	/*Te contactaron desde un colegio municipal para que los ayudes a generar un software
	pensando en ordenar su funcionamiento, este colegio siempre a funcionado de manera análoga
	por 20 años y esto ha generado errores de pérdidas de datos de alumnos antiguos,
	documentos estropeados y nula posibilidad de generar estadísticas de rendimiento del colegio.
	En esta instancia tu tarea será generar los objetos necesarios para cubrir las necesidades del
	colegio, utilizando herencia.
	Además debes generar 3 funciones distintas que te ayudarán a los distintos procesos del
	colegio

	Puntos a considerar:

	● El colegio cuenta con distintos cursos, profesores, materias y alumnos

	● Se debe crear una función que permita al profesor ingresar notas por estudiante y que
	luego permita obtener el promedio de cada estudiante.

	● Se debe crear una función que permita guardar un arreglo de una cierta cantidad de
	alumnos por curso y que luego los muestre.
	
	● Se debe crear una función que dado un arreglo de notas obtenga la mejor nota, la peor
	nota y el promedio de notas.
	  
	 */

// ALGORITMO //

	/* 
 	1. Definir la cantidad de cursos y alumnos que se van a ingresar 
	2. Definir la cantidad de cantiadad de materia por cada profesor
	3. Que se pueda ingresar nota por cada estudiante y saber cual es la mejor del curso 
	y cual es la peor (funcion para saber bajo que promedio es mejor o la peor nota)
	4. Permitir que pueda obtener un promedio de un alumno en especifico (funcion para sacar promedio por cada nota de los estudiantes)
	5. Guardar datos de los estudiantes en un arreglo (HashMap para guardar dos datos relevantes y el un array para uno en específico)
	
	6 .Realizar un menú donde pueda el profesor ingresar el nombre del alumno y solicitar promedio de este
	de la misma forma asi obtener la mejor nota, la peor y el promedio
 	*/


//-----------------------------------------------------------------------------------------------------------//


// -- FUNCIÓN PARA SABER CUAL ES LA MEJOR NOTA, LA PEOR NOTA Y PROMEDIO DE NOTAS -- //

// Con está función se saca el promedio de notas por cada alumno 
	public static Double notasPromedio(ArrayList <Double> notas){
		Double suma = 0.0;
		for (int i=0; 1 < notas.size(); i++){
			suma += notas.get(i);
		}
		return suma/notas.size();
	}


// Con esta función se comprueba si el alumno guardo dentro del libro de clases tiene la mejor nota del curso
// verdadero si es la mejor nota o falso en caso de que no lo sea y ese por debajo del promedio 
	public static Boolean notasCurso (ArrayList<Double> notas, Double mejorNota){
		Double promedio = notasPromedio (notas);
		if(promedio >= mejorNota){
			return true;
		}else{
			return false; 
		}
	}

// Con esta función se puede sacar el promedio general de los alumnos y ver si es la mejor o la por nota del curso 
/* Aunque creo que habria que hacer una función solo para promedio y luego hacer un if else para que el programa
tome en cuenta cual es la mejor nota y cual es la peor nota */

	public static void sobrePromedio(Double promedioGeneral, ArrayList<Double> notas, String nomAlum){
		Double promedioAlumno = notasPromedio (notas);
		if(promedioAlumno>promedioGeneral){
			System.out.println("Este alumno/a "+ nomAlum +" tiene la mejor nota");
		}else if(promedioAlumno == promedioGeneral){
			System.out.println("Este alumno/a "+ nomAlum +" tiene la peor nota");
		}else{
			System.out.println("El promedio del alumno es "+ nomAlum);
		}
	}




	public static void main(String[] args) {
 
// -- CURSOS, MATERIA, PROFESORES Y ALUMNOS -- //


// Herencias para que el profesor pueda ingresar y cambiar cada alumno, materia, curso, dentro del libro de clases 
		
		Scanner teclado = new Scanner(System.in);
		
		Cursos cursoVacio = new Cursos();
		Cursos cursoCompleto = new Cursos("Jose Chaparro", "primeroMedio" , 40);

		Materia asigVacia = new Materia();
		Materia asigCompleto = new Materia("Matematicas", "Raul Mendez");

// Aquí se ingresan los datos principales del alumno 

		System.out.println("   Escuela Las Montañitas  ");
		System.out.println("");

		System.out.println("Nombre del alumno: ");
		String nombreAlumno = teclado.nextLine();
		cursoVacio.setNombreAlumno(nombreAlumno);

		System.out.println("Curso: ");
		String numeroDelCurso = teclado.nextLine();
		cursoVacio.setNumeroDelCurso(numeroDelCurso);

		System.out.println("Asignatura: ");
		String asignatura = teclado.nextLine();
		asigVacia.setAsignatura(asignatura);

		teclado.nextLine();

//-----------------------------------------------------------------------------------------------------------//

		String nomAlum ="";
		String notasAlum ="";
		Double mejorNota = 4.0;
// Aquí de deberian guardar los datos de los alumnos ingresados 
		HashMap <String, ArrayList<Double>> libroClase = new HashMap<String, ArrayList<Double>>();


		int cantidadDeAlumno;
		int cantidadDeNotas;
		int cantidadDeRamos;

// -- INGRESAR NONBRE DEL ALUMNO Y SU NOTA -- //		

		do{
			System.out.println("Ingrese la cantidad de alumno/a: ");
			cantidadDeAlumno = teclado.nextInt();
		if (cantidadDeAlumno <= 0){
			System.out.println("Intentelo nuevamente");
		 } 
		} while (cantidadDeAlumno <= 0);
		do{
			System.out.println("Ingrese la cantidad de notas: ");
		if 	(cantidadDeNotas <= 0){
			System.out.println("Intentelo nuevamente");
		 }
		} while (cantidadDeNotas <= 0);

// Función para que ingrese datos las veces que sea necesarias
		for(int i = 1; i <= cantidadDeAlumno; i++){
			teclado.nextLine();
			System.out.println("Nombre del Alumno: ");
			nomAlum = teclado.nextLine();
		ArrayList<Double> notasAlum;
		for(int x = 1; x <= cantidadDeNotas; x++){
			System.out.println("Ingresa nota" + x + "del alumno" + nomAlum + ": ");
			Double nota = teclado.nextDouble();
			notasAlum.add(nota);

		}
		libroClase.put(nomAlum, notasAlum);	


	}
		
		
// Menú para que el profesor pueda ingrese y obtenga los datos que necesita del alumno 

				System.out.println("LiBRO DE CLASES");
				System.out.println("");
				System.out.println("Ingrese el nombre del alumno");
				System.out.println("Ingrese la mejor nota es:");
				System.out.println("Ingrese la peor nota es:");
				System.out.println("este es el promedio del estudiante");

				System.out.println("Aprete ENTER para salir");
				//opcion = teclado.nextInt();
				





	}

}
