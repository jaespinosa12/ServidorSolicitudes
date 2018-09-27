import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Reserva {
	
	private final String url = "jdbc:postgresql://172.24.41.208/nidoo_db";
	
	private final String usuario = "nidoo_user";
	
	private final String clave = "nidoo2503";

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
	
	public Connection connectar() {
		Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, usuario, clave);
            System.out.println("Connected to the PostgreSQL server successfully.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
	}

	public String reservar() throws IOException{
		Connection con = connectar();
		return "";
		
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
