package dtos;

import java.time.LocalDateTime;

public class VentaDto {

	//Atributos
	long idVenta=0;
	long idClienteVenta=0;
	double importeVenta=0;
	LocalDateTime fechaVenta;
	
	//Metodos Getters(lectura) y Setters(escritura)
	public long getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(long idVenta) {
		this.idVenta = idVenta;
	}
	public long getIdClienteVenta() {
		return idClienteVenta;
	}
	public void setIdClienteVenta(long idClienteVenta) {
		this.idClienteVenta = idClienteVenta;
	}
	public double getImporteVenta() {
		return importeVenta;
	}
	public void setImporteVenta(double importeVenta) {
		this.importeVenta = importeVenta;
	}
	public LocalDateTime getFechaVenta() {
		return fechaVenta;
	}
	public void setFechaVenta(LocalDateTime fechaVenta) {
		this.fechaVenta = fechaVenta;
	}
	
	//Constructor con todos los campos que necesita la venta
	public VentaDto(long idVenta, long idClienteVenta, double importeVenta, LocalDateTime fechaVenta) {
		super();
		this.idVenta = idVenta;
		this.idClienteVenta = idClienteVenta;
		this.importeVenta = importeVenta;
		this.fechaVenta = fechaVenta;
	}
	
	//Al definir un constructor con campos, debemos definir tambien el constructor vacio
	public VentaDto() {
		super();
	}
	@Override
	
	public String toString() {
		return "VentaDto [idVenta=" + idVenta + ", idClienteVenta=" + idClienteVenta + ", importeVenta=" + importeVenta
				+ ", fechaVenta=" + fechaVenta + "]";
	}
	
	
}
