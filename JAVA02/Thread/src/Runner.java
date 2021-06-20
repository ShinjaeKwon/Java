import java.util.Random;

public class Runner implements Runnable{
    private String name;
    private int tiles;
    private static  int score = 00; // 객체가 공유하는 클래스 변수
    public Runner (String n, int t){
        name =n;
        tiles = t;
    }

    synchronized private void scoring (int s){
        score += s;
        System.out.println(name+ " ---> "+score);
    }


    @Override
    public void run() {
        //주사위 던져서 나오는 숫자만큼 이동
        int pos = 0;
        Random dice = new Random();
        while(pos < tiles) {
            pos += dice.nextInt(6) + 1; //0~5 +1 = 1~ 6
            System.out.println(name+" : "+pos);
            if(pos % 8 == 0){
                scoring(10);
            }
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(name + " is arrived.");
    }
}
