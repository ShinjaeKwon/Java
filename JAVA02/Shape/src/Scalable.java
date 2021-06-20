public interface Scalable {
    int BASE = 2;       //상수 , public final int BASE = 2; 앞에 생략됨

    void scaleUp(int s);    // s 크기만큼 확대하는 기능
    default void scalDown(int s){   // 디폴트 메소드는 구현을 가진다.( Java 8이상)
        System.out.println("Scale Down");
    }


}
