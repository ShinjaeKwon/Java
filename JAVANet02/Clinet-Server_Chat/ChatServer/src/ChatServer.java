import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Vector;

public class ChatServer {
    static Vector<ChatHandler> clients = new Vector<>(); //클라이언트들이 저장될 벡터
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(3005);
        while(true){
            //클라이언트 접속 대기
            System.out.println("Chat server is waiting...");
            Socket s = ss.accept(); //block mode
            System.out.println("Client is connected : " + s);
            //입출력 스트림 처리
            DataInputStream dis = new DataInputStream(s.getInputStream()); //수신
            DataOutputStream dos = new DataOutputStream(s.getOutputStream()); //송신
            dos.writeUTF("Welcome to a Chat");
            dos.writeUTF("Send your chatting id");
            String name = dis.readUTF(); //클라이언트 이름을 수신
            ChatHandler handler = new ChatHandler(name, s, dis, dos);
            clients.add(handler);
            Thread thread = new Thread(handler);
            thread.start();
        }
    }
}
