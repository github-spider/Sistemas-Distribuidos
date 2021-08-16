package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {
    public static HashMap<String,ClienteServidor> clientesConectados = new HashMap<>();

    public void Start() throws IOException {
        int porta = 9999;
        ServerSocket server = new ServerSocket(porta);
        System.out.println("Servidor rodando na porta: "+porta);
        while(true){
            Socket socket = server.accept();
            ClienteServidor cliente = new ClienteServidor(socket);
        }
    }
    public static void main(String[] args) throws IOException {
        new Server().Start();
    }







}
