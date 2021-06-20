public class ThreadMain {
    public static void main(String[] args) {
        //Counter c1 = new Counter(0);
        //Counter c2 = new Counter(20);
/*
        Thread c1 = new Thread(new Counter(0));
        Thread c2 = new Thread(new Counter(20));

        c1.start();   //run() 메소드를 동작, 쓰레드를 시작, 생성단계 -->  Runnable 단계로 간다.
        c2.start();*/
        Thread turtle = new Thread(new Runner("Turtle", 300));
        Thread rabbit = new Thread(new Runner("rabbit", 300));
        turtle.start();
        rabbit.start();

    }
}
