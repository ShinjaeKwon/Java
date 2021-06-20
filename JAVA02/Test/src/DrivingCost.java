import java.util.Scanner;

public class DrivingCost {
    public void getCost(){
        Scanner sc = new Scanner(System.in);
        float dist, rate;      //여행거리, 연비
        int l_fee,toll,tourCost;  //연료비, 톨비, 여행경비
        char type;      //type=sc.next().charAt(0); 문자 하나 입력

        System.out.print("여행거리를 입력하세요.");dist = sc.nextFloat();
        System.out.print("연비를 입력하세요.");rate = sc.nextFloat();
        System.out.print("주유비를 입력하세요.");l_fee = sc.nextInt();
        System.out.print("톨게이트 비용을 입력하세요.");toll = sc.nextInt();
        System.out.print("종류?(s,e,l)"); type=sc.next().charAt(0); //문자 하나 입력받음
        tourCost = (int) (dist/rate *l_fee);            //연료비 계산
        tourCost += (type == 's') ? (int)toll * 0.5 : (type == 'e') ?  (int)toll * 0.8 : (type == 'l') ? (int) toll *1.2 :toll;
        if(type == 's') toll =(int)(toll*0.5);
        else if(type =='e') toll =(int)(toll*0.8);
        else if(type =='l') toll =(int)(toll*1.2);
        tourCost += toll;
        //경차는 50%, 전기차는 20%, 대형차 20% 할증,

        System.out.println("여행경비 : "+  tourCost+ "원");

    }




}
