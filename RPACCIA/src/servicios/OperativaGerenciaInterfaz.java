package servicios;

import dtos.ClienteDto;

public interface OperativaGerenciaInterfaz {

	/**
	 * Metodo mediante el cual la gerencia podra añadir nuevos clientes
	 * RPG-10102024
	 * @return
	 */
	public ClienteDto altaNuevoCliente();
}
