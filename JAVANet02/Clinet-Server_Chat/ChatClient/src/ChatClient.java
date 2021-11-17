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
        //전송쓰레드 생성
        Thread sending = new Thread(new Runnable() {
            @Override
            public void run() { //익명 클래스 기법
                while (true){
                    System.out.println("Msg(who#message) : ");
                    String msg = scn.nextLine();
                    try {
                        dos.writeUTF(msg); //전송
                        if(msg.equals("Bye")) break; //종료
                    } catch (IOException e) {
                      //  e.printStackTrace();
                    }

                }
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        //수신쓰레드 생성
        Thread receiving = new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    try {
                        String msg = dis.readUTF();
                        if (msg == null) break; //상대방이 접속 종료
                        System.out.println(msg);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    s.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
        //쓰레드 동작
        sending.start();
        receiving.start();
    }
}
