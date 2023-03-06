package servicios;

import java.util.List;

import entidades.Libro;

/**
 * interfaz con los metodos necesarios para alquilar un libro
 * @author EQUIPO
 *
 */
public interface InterfazLibroAlquiler {

	
	
	public List<Libro> ingresarLibros(List<Libro> listaLibros);
		
	public List<Libro> prestamo(String nombreLibro);
	
	public List<Libro> devolucion(String nombreLibro) ;
		
		
	
	
}
