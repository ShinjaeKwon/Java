import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class ChatClient {
    final static int ServerPort = 3005;

    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        InetAddress ipAddr = InetAddress.getByName("localhost");
        Socket s = new Socket(ipAddr, ServerPort);
        System.out.println("Connection OK!");
        //입출력 스트림 처리
        DataInputStream dis = new DataInputStream(s.getInputStream()); //수신
        DataOutputStream dos = new DataOutputStream(s.getOutputStream()); //송신
        String msg = dis.readUTF();
        System.out.println(msg);
        msg = dis.readUTF();
        System.out.println(msg);
        System.out.print("Name : ");
        String name = scn.nextLine();
        dos.writeUTF(name); //클라이언트 이름을 서버에 전송
        while (true){
            char q= scn.next().charAt(0);
            if(q == 'q'){
                break;
            }
        }
    }
}
