package serverClient;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private int port;
    private Connection connection;

    public Server(int port) {
        this.port = port;
    }

    public void start() throws IOException, ClassNotFoundException {
        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Сервер запущен...");
            while (true) {
                Socket clientSocket = serverSocket.accept();
                connection = new Connection(clientSocket);
                System.out.println(connection.readMessage().getText().equals("/help"));
                if(connection.readMessage().getText().equals("/help")) {
                    System.out.println("srdfg");
                    connection.sendMessage(SimpleMessage.getInstance("server", "список команд"));
                }
                else{
                    System.out.println("sdf");
                }

//                if (connection.readMessage().toString().equals("/help")){
//                connection.sendMessage(SimpleMessage.getInstance("server", "список команд"));
//                    }
//                else if (connection.readMessage().toString().equals("/ping")){
//                connection.sendMessage(SimpleMessage.getInstance("server", "пинг"));
//                    }
//                else if (connection.readMessage().toString().equals("/exit")){
//                connection.sendMessage(SimpleMessage.getInstance("server", "exit"));
//                    }
//                else {connection.sendMessage(SimpleMessage.getInstance("server", "wfe"));
//                    }
//
                }

            }
        }


    public static void main(String[] args) {
        int port = 8090;
        Server server = new Server(port);
        try {
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}


