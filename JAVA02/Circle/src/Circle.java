public class Circle {
    public int r;       //반지름
    public double size; //면적

    public double sizeOfCircle(){   //클래스의 기능이면서 외부에 제공하는 서비스(인터페이스)
        size= r * r * 3.1415;
        return size;
    }

}
