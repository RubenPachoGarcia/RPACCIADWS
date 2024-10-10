package servicios;

public interface MenuInterfaz {

	/**
	 * Metodo por el cual se muestra el menu principal de la aplicacion y sus diferentes opciones
	 * RPG-10102024
	 * @return
	 */
	public byte menuPrincipal();
	/**
	 * Metodo por el cual se muestra el menu de la parte de gerencia de la aplicacion y sus diferentes opciones
	 * RPG-10102024
	 * @return
	 */
	public byte menuGerencia();
	/**
	 * Metodo por el cual se muestra el menu de la parte de empleado de la aplicacion y sus diferentes opciones
	 * RPG-10102024
	 * @return
	 */
	public byte menuEmpleado();
}
