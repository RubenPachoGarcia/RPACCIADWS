package servicios;

import dtos.VentaDto;

public interface OperativaEmpleadoInterfaz {

	/**
	 * Metodo mediante el cual desde el menu de empleado se podra añadir nuevas ventas
	 * RPG-10102024
	 * @return
	 */
	public VentaDto aniadirCompra();
}
