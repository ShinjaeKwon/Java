import java.util.Random;
import java.util.Scanner;

class Encryption {
    char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
}

public class PassWord {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Encryption ps = new Encryption();
        Random rd = new Random();

        String msg;    //입력 메세지, 암호화 메시지, 복호화 메시지
        String enc = " ";
        String dec = "";
        int h;
        System.out.print("Message : ");
        msg = sc.nextLine();
        char[] key = new char[msg.length()];
        int[] randomKey = new int[25];

        for(int i=0; i<25; i++) {
            randomKey[i]=(int)(Math.random()*25);
            for(int j=0; j<i;j++) {
                if(randomKey[i]==randomKey[j]) {i--; break;}
            }
        }


        for (int i = 0; i < msg.length(); i++) {
            switch(msg.charAt(i)){
                case '1': case '2': case '3': case '4': case '5': case '6':
                case '7': case '8': case '9': case '0':
                    enc = enc + msg.charAt(i);
                    key[i] = msg.charAt(i);
                    break;
                case '_': case'?': case'-': case'@': case'!': case'#': case'%':
                case'*': case'(': case')':
                    key[i] = msg.charAt(i);
                    enc = enc + msg.charAt(i);
                    break;
                default:
                    h= randomKey[i];
                    key[i] = ps.alpha[h];
                    enc = enc + key[i];
                    ps.alpha[h] = msg.charAt(i);

            }
        }
        System.out.println("Encoded : "+enc);
        h=0;
        char state;
        System.out.print("Decode(y/n)? ");
        state=sc.next().charAt(0);
        if(state == 'y'){
            for(int i= 0 ; i<enc.length()-1;i++){
                switch(key[i]){
                    case '1': case '2': case '3': case '4': case '5': case '6':
                    case '7': case '8': case '9': case '0':
                    dec = dec+key[i];
                    break;
                    case '_': case'?': case'-': case'@': case'!': case'#': case'%':
                    case'*': case'(': case')':
                    dec = dec+ key[i];
                    break;
                    default:
                        h=randomKey[i];
                        key[i]=ps.alpha[h];
                        dec = dec+ps.alpha[h];
                }
            }
        }
        else if(state == 'n'){
            System.out.println("복호화를 실행하지 않습니다.");
        }
        else {
            System.out.println("잘못된 입력입니다.");
        }
        if(msg.equals(dec)){
            System.out.println("Decoded :"+dec);
            System.out.println("Decording is successful");
        }
        else{
            System.out.println("Decording is failed");
        }
    }
}




