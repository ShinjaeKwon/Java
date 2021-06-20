public class CircleMain {
    public static void main(String[] args){
        Circle c = new Circle();    //new : 힙 공간에 메모리 할당해서 객체를 생성, c는 객체를 가리키는 참조 변수
        //C++ : new 생성, delete c; 구문으로 삭제, 자바는 delete 명령어 없음, JVM 안에 가비지 콜렉터가 알아서 삭제
        c.r= 8;
        System.out.println(c.sizeOfCircle());   //main 메소드 입장에서 볼 때 , c 객체에게 sizeOfCircle 이라는 함수를 실행 요청

        Circle c2, c3;
        c2 = new Circle();
        c2.r = 12;
        System.out.println(c2.sizeOfCircle());

        c3 = c;
        System.out.println(c3.sizeOfCircle());
    }


}
