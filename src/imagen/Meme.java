package imagen;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import atencion.Atencion;


public class Meme implements Atencion {

	private Atencion siguiente;
	private HashMap<String, String>listaDeMemes;
	
	public Meme() {
		listaDeMemes = new HashMap<String, String>();
		listaDeMemes.put("its a trap", "memes/itsatrap.jpg");		
		listaDeMemes.put("take my money", "memes/takemymoney.jpg");
	}
	
	public void establecerSiguiente(Atencion siguiente) {
		this.siguiente = siguiente;
		
	}
	
	public String atender(String mensaje, String nombreAsistente, String nombreUsuario) {
		String consulta = mensaje.toLowerCase();
		String memeAMostrar;
		final String regex = "(@" + nombreAsistente + ")( meme)* (take my money|its a trap)";
		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		final Matcher matcher = pattern.matcher(consulta);

		if (matcher.find()){
			memeAMostrar = matcher.group(3);
			return getRuta(memeAMostrar);
		}

		return siguiente.atender(mensaje, nombreAsistente, nombreUsuario);
	}
	
	public String getRuta(String memeAMostrar) {
		String ruta = listaDeMemes.get(memeAMostrar);
		return ruta;
	}	
}
 