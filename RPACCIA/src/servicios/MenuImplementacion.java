package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{
	
	FicheroInterfaz fi=new FicheroImplementacion();
	OperativaGerenciaInterfaz ogi=new OperativaGerenciaImplementacion();
	OperativaEmpleadoInterfaz oei=new OperativaEmpleadoImplementacion();
	
	Scanner sc=new Scanner(System.in);
	
	public byte menuPrincipal() {
		
		byte opcionPrincipal;
		
		System.out.println("BIENVENIDO");
		System.out.println("------------------");
		System.out.println("0. Cerrar aplicacion");
		System.out.println("1. Menu empleado");
		System.out.println("2. Menu gerencia");
		System.out.println("------------------");
		System.out.println("Seleccione la opcion que desee: ");
		
		opcionPrincipal=sc.nextByte();
		
		return opcionPrincipal;
	}
	
	public byte menuEmpleado() {
		
		byte opcionEmpleado;
	
		System.out.println("MENU EMPLEADO");
		System.out.println("------------------");
		System.out.println("0. Volver");
		System.out.println("1. Calculo total de ventas mensuales");
		System.out.println("2. Añadir compras a cliente");
		System.out.println("------------------");
		System.out.println("Seleccione la opcion que desee: ");
		
		opcionEmpleado=sc.nextByte();
		
		try {
			switch(opcionEmpleado) {
			
			case 0:
				fi.escribirFicheroLog("VOLVISTE");
				break;
			case 1:
				System.out.println("Opcion 1");
				fi.escribirFicheroLog("CALCULO VENTAS MENSUALES");
				break;
			case 2:
				System.out.println("Opcion 2");
				oei.aniadirCompra();
				fi.escribirFicheroLog("AÑADIR COMPRAS A CLIENTE");
				break;
			default:
				System.out.println("La opcion seleccionada no es correcta");
				fi.escribirFicheroLog("OPCION INCORRECTA");
				break;
			}
		}catch (Exception error) {
			System.out.println("[ERROR-]".concat(error.toString()));
			fi.escribirFicheroLog("[ERROR-]".concat(error.toString()));
		}
		
		return opcionEmpleado;
	}
	
	public byte menuGerencia() {
		
		byte opcionGerencia;
		
		System.out.println("MENU GERENCIA");
		System.out.println("------------------");
		System.out.println("0. Volver");
		System.out.println("1. Crear nuevo cliente");
		System.out.println("------------------");
		System.out.println("Seleccione la opcion que desee: ");
		
		opcionGerencia=sc.nextByte();
		
		try {
			switch(opcionGerencia) {
			
			case 0:
				fi.escribirFicheroLog("VOLVISTE");
				break;
			case 1:
				System.out.println("Opcion 1");
				ogi.altaNuevoCliente();
				fi.escribirFicheroLog("CREAR NUEVO CLIENTE");
				break;
			default:
				System.out.println("La opcion seleccionada no es correcta");
				fi.escribirFicheroLog("OPCION INCORRECTA");
				break;
			}
		}catch(Exception error) {
			System.out.println("[ERROR-]".concat(error.toString()));
			fi.escribirFicheroLog("[ERROR-]".concat(error.toString()));
		}
		
		return opcionGerencia;
	}
}
