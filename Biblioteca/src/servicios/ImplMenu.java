package servicios;

public class ImplMenu implements InterfazMenu{

	@Override
	public void mostrarMenuLibros() {
		System.out.println("0. Salir");
		System.out.println("1. Ingresar libros");
		System.out.println("2. Prestamo/alquiler de un libro");
		System.out.println("3. Devolución de un libro");
		System.out.println("4. Mostrar información de todos los libros");
		
	}

}
