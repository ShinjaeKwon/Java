import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        try {
            //IP주소, 포트번호로 서버에 접속 요청
            Socket s = new Socket("127.0.0.1", 8000);
            System.out.println("Connection is completed");
            //데이터 송수신을 위한 입출력 객체 생성
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream())); // 수신 스트림
            PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream())); //송신 스트림
            String data = in.readLine();
            System.out.println(data);
            while(true){
                System.out.print("Message : ");
                String msg = scn.nextLine();
                if(msg.equals("BYE")){
                    break;
                }
                out.println(msg);
                out.flush();
                msg = in.readLine();
                System.out.println("Echoed Message : " + msg);
            }
            System.out.println("Disconnect...");
            s.close(); //연결 종료 요청

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
