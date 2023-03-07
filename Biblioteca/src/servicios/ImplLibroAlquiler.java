package servicios;

import java.util.List;
import java.util.Scanner;

import entidades.Libro;

public class ImplLibroAlquiler implements InterfazLibroAlquiler {

	
	/**
	 * ingresamos libros en la biblioteca
	 */
	@Override
	public List<Libro> ingresarLibros(List<Libro> listaLibros) {
		
		Libro nuevoLibro = new Libro();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce el titulo del libro:");
		nuevoLibro.setTituloLibro(input.next());
		System.out.println("Introduce el autor del libro:");
		nuevoLibro.setAutor(input.next());
		System.out.println("Introduce el numero de ejemplares introducidos:");
		nuevoLibro.setNumEjemplares(input.nextInt());
		
		nuevoLibro.setId(calculoNuevoId(listaLibros));
		listaLibros.add(nuevoLibro);

		return listaLibros;
	}
	
	
	/**
	 * Calcular el id del nuevo repostaje
	 * @param listaRepostajes lista actual de repostajes
	 * @return id de un nuevo repostaje
	 */
	private int calculoNuevoId(List<Libro> listaLibros) {
		int auxiliar = 0;
		
		for(int i=0;i<listaLibros.size();i++) {
			
			int j = listaLibros.get(i).getId();
			if(auxiliar < j) {
				auxiliar = j;
			}
			
		}
		return auxiliar+1;
	}
	


	@Override
	public List<Libro> prestamo(List<Libro> listaLibros) {

		Scanner input = new Scanner(System.in);
		System.out.println("Que libro quieres alquilar(prestamo)");
		
		
		
		
		return null;
	}

	@Override
	public List<Libro> devolucion(List<Libro> listaLibros) {


		
		
		
		
		
		
		
		return null;
	}
	

}
