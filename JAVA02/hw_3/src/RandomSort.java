import java.util.ArrayList;

public class RandomSort {
    public static void main(String args[]) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        int temp = 0;
        int r = 0;
        int j = 0;

        for (int i = 0; i < 10; i++) {
            r=(int) ((Math.random() * 41) + 10); //값 하나 추출
            for(j = 0; j < i; j++) { //그 값이 배열의 안에 있는지(중복난수인지) 체크
                if(r == list1.get(j)) {
                    break;
                }
            }
            if(j < i) { //for문을 모두 돌지 못했다면(중복난수가 있다면)
                i--;
                continue;
            }

            if (i == 0) {
                list1.add(r);
            } else  {
                for (j = 0; j < i; j++) {
                    if(r < list1.get(j)||list1.size()==0){
                        list1.add(j,r);
                        break;
                    }
                }
                if(j == i) //for루프를 모두 돌았다면(list1의 모든 원소보다 r이 크다면)
                    list1.add(j, r);
            }

        }

        for (int a : list1) {
            System.out.println(a);
        }
    }
}
