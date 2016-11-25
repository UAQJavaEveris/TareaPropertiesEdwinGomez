/**
 * @author Edwin
 */

package mx.com.everis.tallerjava.clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.ResourceBundle;

public class FormularioBeca {

	public static void main(String[] args) {
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Idioma(español, english, français, italiano):");
			String idiomaIn = in.readLine().toLowerCase().trim();
			Locale idioma;
			switch (idiomaIn) {
			case "español":
				idioma = new Locale("es", "MX");
				break;
			case "english":
				idioma = Locale.US;
				break;
			case "français":
			case "francais":
				idioma = Locale.FRANCE;
				break;
			case "italiano":
				idioma = Locale.ITALY;
				break;
			default:
				idioma = Locale.getDefault();
				break;

			}
					
			String nombre, fechaNacimiento, telefono, universidad, grado, promedio, ingreso;

			ResourceBundle formularioBeca = ResourceBundle.getBundle("mx.com.everis.tallerjava.properties.Idioma",
					idioma);
			System.out.println(formularioBeca.getString("encabezado"));
			System.out.println(formularioBeca.getString("instrucciones"));

			System.out.println(formularioBeca.getString("nombre"));
			nombre = in.readLine();
			System.out.println(formularioBeca.getString("fechaNacimiento"));
			fechaNacimiento = in.readLine();
			System.out.println(formularioBeca.getString("telefono"));
			telefono = in.readLine();
			System.out.println(formularioBeca.getString("universidad"));
			universidad = in.readLine();
			System.out.println(formularioBeca.getString("gradoEscolar"));
			grado = in.readLine();
			System.out.println(formularioBeca.getString("promedio"));
			promedio = in.readLine();
			System.out.println(formularioBeca.getString("ingreso"));
			ingreso = in.readLine();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
