package imagen;

public class Main {

	public static void main(String[] args) {
		ImagenGag i = new ImagenGag();
		ClienteGUI gui = new ClienteGUI("Test");
		//Meme m = new Meme();
		
		String gag = i.getPost();
		System.out.println(gag);
		String datos[] = gag.split("\\|");
		System.out.println(datos[0] + " " + datos[1]);
		gui.imprimir(datos[0]);
		gui.imprimirImagen(datos[1]);
		//System.out.println(gag.getTitulo() + " - " + gag.getLink());
		//gui.imprimirImagen(m.getRuta("its a trap"));
	}
}
