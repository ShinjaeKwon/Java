import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class ChatHandler implements Runnable {
    private String name;
    private Socket s;
    private final DataInputStream dis;
    private final DataOutputStream dos;
    private boolean isSignin;

    public ChatHandler(String name, Socket s, DataInputStream dis, DataOutputStream dos){
        this.name = name;
        this.s = s;
        this.dis = dis;
        this.dos = dos;
        isSignin = true;
    }

    @Override
    public void run() { //
        System.out.println(name + " is chatting...");
    }
}
