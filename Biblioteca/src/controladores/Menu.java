package controladores;

import servicios.InterfazMenu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import servicios.ImplLibroAlquiler;
import servicios.ImplMenu;
import servicios.InterfazLibroAlquiler;

import entidades.Libro;
//modificacion
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
		

		librito (listaLibros, "casa", "juan", 5, 1);
		librito (listaLibros, "playa", "jose", 6, 2);
		librito (listaLibros, "montaña", "pepe", 9, 3);
		
		for (Libro model : listaLibros) 
            System.out.println(model.toString());
				
		intPrestamo.prestamo(listaLibros);
		
		for (Libro model : listaLibros)
            System.out.println(model.toString());
		
		
		/*
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
					intPrestamo.ingresarLibros(listaLibros);					
					break;
				case 2:
					
					break;
				case 3:
					
					break;
					
				case 4:
					for (Libro model : listaLibros) 
			            System.out.println(model.toString());
					System.out.println("Escribe cualquier cosa para volver al menu");
					String letra = entradaOpcion.next();					
					break;
					
				default:

			}
		}
		
		*/
		


	}
	
	
	
	public static List<Libro> librito (List<Libro> lista, String a, String b, int c, int d) {
		
		Libro nuevoLibro = new Libro();
		
		nuevoLibro.setTituloLibro(a);
		nuevoLibro.setAutor(b);
		nuevoLibro.setNumEjemplares(c);
		
		nuevoLibro.setId(d);
		lista.add(nuevoLibro);
		
		return lista;
	}

}
