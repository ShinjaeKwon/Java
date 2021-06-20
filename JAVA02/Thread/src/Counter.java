//public class Counter extends Thread {
public class Counter implements Runnable{
    private int count;
    public Counter(int c){
        count =c;
    }

    @Override
    public void run() {
        int n = 0;
        while(n<10){
            System.out.println(count+n);
            n++;
            try {
                Thread.sleep(500); //스레드의 동작을 잠시 멈추게함
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
