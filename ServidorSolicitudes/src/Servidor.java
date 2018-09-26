import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ArrayBlockingQueue;

public class Servidor {
	
	private static int PUERTO = 2121;
	
    public static void main(String[] args) throws IOException {
    	ServerSocket ss = null;
		boolean continuar = true;
		Buffer buffer = new Buffer(30);
		try {
		ss = new ServerSocket(PUERTO);
		} catch (IOException e) {
		System.err.println("No pudo crear socket en el puerto:" + PUERTO);
		System.exit(-1);
		}
		
		for (int i = 0; i < 2; i++) {
			new ThreadServidor(ss.accept(),i, buffer).start();
		}
		while (continuar) {
			
		}
		ss.close();
	}
}