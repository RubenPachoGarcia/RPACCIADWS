package servicios;
import java.util.Scanner;
import controladores.Inicio;
import dtos.ClienteDto;

public class OperativaGerenciaImplementacion implements OperativaGerenciaInterfaz{

	FicheroInterfaz fi=new FicheroImplementacion();
	
	Scanner sc=new Scanner(System.in);
	
	public ClienteDto altaNuevoCliente() {
		
		ClienteDto nuevoCliente=new ClienteDto();
		try {
			nuevoCliente.setIdCliente(idAutomatico());
			
			System.out.println("Introduzca el nombre del nuevo cliente: ");
			String nombre=sc.nextLine();
			nuevoCliente.setNombreCliente(nombre);
			
			System.out.println("Introduzca los apellidos del nuevo cliente: ");
			String apellidos=sc.nextLine();
			nuevoCliente.setApellidosCliente(apellidos);
			
			System.out.println("¿Desea añadir otro cliente?(s/n)");
			String respuesta=sc.nextLine();
			
			System.out.println(nuevoCliente.toString());
			
			if(respuesta.equals("s")) {
				
				altaNuevoCliente();
			}
		}catch (Exception error) {
			System.out.println("[ERROR-]".concat(error.toString()));
			fi.escribirFicheroLog("[ERROR-]".concat(error.toString()));
		}
		
		return nuevoCliente;
	}
	
	//Metodo mediante el cual cada vez que se de de alta a un cliente se le asignara un id automatico
	private long idAutomatico() {
		
		long idAutomatico;
		long tamanioLista=Inicio.listaClientes.size();
		
		if(tamanioLista==0) {
			
			idAutomatico=1;
		}else {
			
			idAutomatico=tamanioLista-1;
		}
		
		return idAutomatico;
	}
}
