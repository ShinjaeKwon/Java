public class DotMain {
    public static void main(String[] args){
        ColorDot cdot = new ColorDot(); //디폴트 생성자 ColorDot()을 호출해서 객체 생성

        cdot.setColor(255,0,0);
        cdot.setLoc(new Point(3,5));
        cdot.setSize(7);
        System.out.println(cdot);

        PatternDot pdot = new PatternDot();
        pdot.setLoc(new Point(5,5));
        pdot.setSize(11);
        pdot.setPattern("점무늬");
        System.out.println(pdot);
        pdot.move(-3,2);
        System.out.println(pdot);


    }
}
