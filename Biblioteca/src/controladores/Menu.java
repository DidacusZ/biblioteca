package controladores;

import servicios.InterfazMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import servicios.ImplLibroAlquiler;
import servicios.ImplMenu;
import servicios.InterfazLibroAlquiler;

import entidades.Libro;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//inicializamos la interfaz de menu y libroAlquiler
		InterfazMenu intMenu = new ImplMenu();
		InterfazLibroAlquiler intPrestamo = new ImplLibroAlquiler();
		
		//listado libros(Base de Datos)
		List<Libro> listaLibros = new ArrayList<>();
		
		// Imprimir el menú por consola
		// Scanner con la opción del usuario
		Scanner entradaOpcion = new Scanner(System.in);		
		Boolean cerrarMenu = false;
		int opcion;
		
		
		
		while(!cerrarMenu) {	
			//Mostramos el menú
			intMenu.mostrarMenuLibros();

			System.out.println("Introduza la opción deseada: ");
			opcion = entradaOpcion.nextInt();
			System.out.println("[INFO] - Has seleccionado la opcion " + opcion);
			
			switch (opcion) {					
				case 0:
					cerrarMenu = true;
					break;							
				case 1:
					//listaLibros.add(ImplLibroAlquiler.);
					intPrestamo.ingresarLibros(listaLibros);
					System.out.println();
					break;
				case 2:
					
					break;
				case 3:
					
					break;
					
				case 4:
					
					break;
					
				default:

			}
		}
		
		
	
		
		
		
		
		

	}

}
