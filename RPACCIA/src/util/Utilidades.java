package util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utilidades {
	
	//Metodo mediante el cual especificamos el formato que queremos que tenga el nombre de nuestro ficherolog
	public static String nombreLog() {
		
		LocalDate fehaActual=LocalDate.now();
		DateTimeFormatter formato=DateTimeFormatter.ofPattern("ddMMyyyy");
		
		String fechaString=fehaActual.format(formato);
		
		String nombreFicheroLog="log-".concat(fechaString).concat(".txt");
		
		return nombreFicheroLog;
	}
}
