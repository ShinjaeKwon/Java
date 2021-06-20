import java.util.Scanner;

public class ArrayPrac {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str;     // str : String 객체를 가리키는 객체참조변수
        char c;

        System.out.print("문자열 : ");
        str = sc.nextLine();    //한 문장 next는 한 단어
        System.out.print("문자: ");
        c=  sc.next().charAt(0);        //문자 입력

        int cnt  = 0;
        //for(int i = 0 ; i< str.length();i++)
            //if(c==str.charAt(i)) cnt++;   //i인덱스에서 문자 한개 를 받아와서 비교
        for(char m : str.toCharArray()) //toCharArray 메소드는 문자열을 문자배열로 변환
            if(c == m) cnt++;

        System.out.println("count : " + cnt);



    }
}
