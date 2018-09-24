package unlam.edu.pb2;

public class Taxi {

	
	private String marca;
	private String modelo;
	private String patente;
	private Chofer chofer;
	
	
	public Taxi(String marca, String modelo, String patente, String nombre, String apellido) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.chofer = new Chofer(nombre, apellido);
	}
	
	
	public Taxi(String marca, String modelo, String patente) {
		this.marca = marca;
		this.modelo = modelo;
		this.patente = patente;
		this.chofer= new Chofer("", "");
	}
	
	
	public String mostrarNombreChofer() {
		return getChofer().getNombre()+" "+getChofer().getApellido();
		
	}

	public Chofer getChofer() {
		return chofer;
	}


	public void setChofer(Chofer chofer) {
		this.chofer = chofer;
	}
	
	
	
	
}
