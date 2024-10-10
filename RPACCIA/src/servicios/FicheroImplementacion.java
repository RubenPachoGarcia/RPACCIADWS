package servicios;

import java.io.BufferedWriter;
import java.io.FileWriter;

import controladores.Inicio;

public class FicheroImplementacion implements FicheroInterfaz{

	public void escribirFicheroLog(String mensaje) {
		
		try {
			
			FileWriter fw=new FileWriter(Inicio.RUTAFICHEROLOGS, true);
			BufferedWriter bw=new BufferedWriter(fw);
			fw.write(mensaje.concat("\n"));
			fw.close();
		} 
		catch (Exception error) {
			System.out.println("[ERROR]-".concat(error.toString()));
		}
	}
}
