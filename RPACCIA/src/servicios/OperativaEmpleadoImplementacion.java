package servicios;
import java.time.LocalDateTime;
import java.util.Scanner;
import controladores.Inicio;
import dtos.VentaDto;

public class OperativaEmpleadoImplementacion implements OperativaEmpleadoInterfaz{

	FicheroInterfaz fi=new FicheroImplementacion();
	
	Scanner sc=new Scanner(System.in);
	
	public VentaDto aniadirCompra() {
		
		VentaDto nuevaVenta=new VentaDto();
		
		try {
			nuevaVenta.setIdVenta(idAutomatico());
			
			System.out.println("Introduzca el importe de la venta: ");
			double importe=sc.nextDouble();
			nuevaVenta.setImporteVenta(importe);
			
			System.out.println("Introduzca el id del cliente que ha realizado la compra: ");
			long idCliente=sc.nextLong();
			nuevaVenta.setIdClienteVenta(idCliente);
			
			LocalDateTime fechaActual=LocalDateTime.now();
			nuevaVenta.setFechaVenta(fechaActual);
			
			System.out.println(nuevaVenta.toString());
		}catch (Exception error) {
			System.out.println("[ERROR-]".concat(error.toString()));
			fi.escribirFicheroLog("[ERROR-]".concat(error.toString()));
		}
		
		return nuevaVenta;
	}
	
	//Metodo mediante el cual cada vez que se de de alta a un cliente se le asignara un id automatico
	private long idAutomatico() {
			
		long idAutomatico;
		long tamanioLista=Inicio.listaVentas.size();
			
		if(tamanioLista==0) {
				
			idAutomatico=1;
		}else {
			
			idAutomatico=tamanioLista-1;
		}
			
		return idAutomatico;
	}
}
