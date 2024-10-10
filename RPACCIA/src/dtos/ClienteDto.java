package dtos;

public class ClienteDto {

	//Atributos
	long idCliente=0;
	String nombreCliente="aaaaa";
	String apellidosCliente="aaaaa";
	
	//Metodos Getters(lectura) y Setters(escritura)
	public long getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getApellidosCliente() {
		return apellidosCliente;
	}
	public void setApellidosCliente(String apellidosCliente) {
		this.apellidosCliente = apellidosCliente;
	}
	
	//Constructor con todos los campos que necesita el cliente
	public ClienteDto(long idCliente, String nombreCliente, String apellidosCliente) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.apellidosCliente = apellidosCliente;
	}
	
	//Al definir un constructor con campos, debemos definir tambien el constructor vacio
	public ClienteDto() {
		super();
	}
	@Override
	
	public String toString() {
		return "ClienteDto [idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", apellidosCliente="
				+ apellidosCliente + "]";
	}
	
	
}
