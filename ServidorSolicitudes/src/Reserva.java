import java.io.BufferedReader;
import java.io.PrintWriter;

public class Reserva {

	private String barrio;

	private int numeroParqueadero;

	private String parqueadero;

	private boolean estado;
	
	private String cliente;

	public Reserva(String pBarrio, int pNumero, String pParqueadero, String pCliente) {
		barrio = pBarrio;
		numeroParqueadero = pNumero;
		parqueadero = pParqueadero;
		cliente = pCliente;
	}

	public void reservar(PrintWriter pOut, BufferedReader pIn){
		
	}
	
	public String agregarReserva() {
		return null;
	}

	public String getBarrio() {
		return barrio;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	public int getNumeroParqueadero() {
		return numeroParqueadero;
	}

	public void setNumeroParqueadero(int numeroParqueadero) {
		this.numeroParqueadero = numeroParqueadero;
	}

	public String getParqueadero() {
		return parqueadero;
	}

	public void setParqueadero(String parqueadero) {
		this.parqueadero = parqueadero;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

}
