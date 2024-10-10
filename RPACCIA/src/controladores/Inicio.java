package controladores;

import java.util.ArrayList;
import dtos.ClienteDto;
import dtos.VentaDto;
import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;
import util.Utilidades;

public class Inicio {
	
	public static String RUTACARPETALOGS="C:\\Users\\rpaccia\\eclipse-workspace\\DWS\\RPACCIA\\auditoria\\";
	
	public static String RUTAFICHEROLOGS=RUTACARPETALOGS.concat(Utilidades.nombreLog());
	
	public static ArrayList<ClienteDto> listaClientes=new ArrayList<ClienteDto>();
	
	public static ArrayList<VentaDto> listaVentas=new ArrayList<VentaDto>();
	
	//Metodo principal de nuestra aplicacion
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuInterfaz mi=new MenuImplementacion();
		FicheroInterfaz fi=new FicheroImplementacion();
		
		byte opcion;
		boolean cerrarMenu=false;
		
		fi.escribirFicheroLog("HAS ENTRADO EN LA APLICACION");
		
		try {
			
			while(!cerrarMenu) {
				
				opcion=mi.menuPrincipal();
				fi.escribirFicheroLog("MENU PRINCIPAL");
				
				switch(opcion) {
				
				case 0:
					System.out.println("Se cerro la aplicacion");
					cerrarMenu=true;
					fi.escribirFicheroLog("SE CERRO LA APLICACION");
					break;
				case 1:
					System.out.println("Opcion 1");
					mi.menuEmpleado();
					fi.escribirFicheroLog("MENU EMPLEADO");
					break;
				case 2:
					System.out.println("Opcion 2");
					mi.menuGerencia();
					fi.escribirFicheroLog("MENU GERENCIA");
					break;
				default:
					System.out.println("La opcion seleccionada no es correcta");
					fi.escribirFicheroLog("OPCION INCORRECTA");
					break;
				}
			}
		}catch (Exception error) {
			System.out.println("[ERROR-]".concat(error.toString()));
			fi.escribirFicheroLog("[ERROR-]".concat(error.toString()));
		}
	}

}
