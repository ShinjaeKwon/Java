import java.util.*;

public class MonthRain {
    public static void main(String args[]){
        final int MONTH=12;

        int[] month = new int[MONTH];
        Random r = new Random();

        for(int i =0;i<month.length;i++)
            month[i] = r.nextInt(296)+5;//0~296 +5 5~300
        //강수량 출력

        for(int rain : month) System.out.print(rain+" : ");
        System.out.println();
        System.out.println(Arrays.toString(month));
        //최대강수량 및 최소강수량 월을 구하기
        int max= month[0];
        int min = month[0];
        int m1=1;
        int m2=1;

        for(int i= 0; i<MONTH;i++){
            if(max < month[i]) {
                max = month[i];
                m1 = i+1;
            }
            if(min>month[i]) {
                min = month[i];
                m2 = i+1;
            }
        }
        System.out.println();
        System.out.println("최대강수량 월 : "+m1+", 최소강수량 월 : "+m2);

    }
}
