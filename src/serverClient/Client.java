package serverClient;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Properties;
import java.util.Scanner;

public class Client {
    private String ip;
    private int port;
    private Scanner scanner;
    private FileInputStream fis;
    private Properties prop = new Properties();

    public Client() {

        try{fis = new FileInputStream("sources/server.properties");
            prop.load(fis);
            System.out.println(prop.getProperty("ip"));
            System.out.println(prop.getProperty("port"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.ip = prop.getProperty("ip");
        this.port = Integer.parseInt(prop.getProperty("port"));
        scanner = new Scanner(System.in);
    }

    public Client(String ip, int port){
        this.ip = ip;
        this.port = port;
        scanner = new Scanner(System.in);
    }
    private Socket getSocket() throws IOException {
        Socket socket = new Socket(ip, port);
        socket.getReceiveBufferSize();
        socket.getSendBufferSize();
        socket.isConnected();
        socket.getLocalPort();
        socket.getLocalAddress();
        return socket;
    }

    private void sendAndPrintMessage(SimpleMessage message) throws Exception
    {
        try (Connection connection = new Connection(getSocket())){
            connection.sendMessage(message);

            SimpleMessage fromServer = connection.readMessage();
            System.out.println("ответ от сервера " + fromServer);
        }
    }

    public void start() throws Exception {
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        String text;
        while (true) {
            System.out.println("введите сообщение");
            text = scanner.nextLine();
            sendAndPrintMessage(SimpleMessage.getInstance(name, text));
        }
    }


    public static void main(String[] args){
       // int port = 8090;
       // String ip = "127.0.011";
        try{
            new Client().start();
        } catch (Exception e) {

            System.out.println("erger");;
        }
    }
}





