public class SwitchTest {
    public static void main(String args[]){
        String weapon;
        int power;

        weapon = "Gun1";
        switch(weapon){
            case "Gun1" /*"Gun2"*/ : power = 20; break;  //Fall-Through
            /*switch 블록 나열 은 8버전에서 지원 안함*/
            case "Gun2" : power =20;break;
            case "Canon1"  : power  =30;break;
            case "Canon2"  : power  =40;    break;
            default: power = 0;
        }
        System.out.println(weapon + " : "+power);
        //New switch구문(자바 14)
       /* weapon = "Gun1";
        switch(weapon){
            case "Gun1","Gun2"-> power = 20;   //Fall-Through
            //switch 블록 나열 은 8버전에서 지원 안함
            case "Canon1"-> power  =30;
            case "Canon2"-> power  =40;
            default-> power = 0;
        }
        System.out.println(weapon + " : "+power);*/
        //switch expression(수식) : 값이 하나 나옴
        /*weapon = "Canon1";
        power =switch(weapon){
            case "Gun1","Gun2"-> 20;   //Fall-Through
            //switch 블록 나열 은 8버전에서 지원 안함
            case "Canon1"->30;
            case "Canon2"->{    //블록문 사용 가능
            //int energy =20;   //변수 선언 가능
            power = energy * 3;
            yield power;        //함수에서 return 과 비슷
            }
            default-> 0;
        };
        System.out.println(weapon + " : "+power);*/
        
    }
}
