public class ColorDot extends Dot {
    private int red, green, blue;

    //자식 객체를 생성할 때 내부적으로 부모 객체를 만들고 그 다음 자식 객체가 완성된다.
    public ColorDot(){ super();}
    public void setColor(int r, int g, int b){
        red = r;
        green = g;
        blue = b;
    }
    public int getRed() {
        return red;
    }
    public void setRed(int red) {
        this.red = red;
    }
    public int getGreen() {
        return green;
    }
    public void setGreen(int green) {
        this.green = green;
    }
    public int getBlue() {
        return blue;
    }
    public void setBlue(int blue) {
        this.blue = blue;
    }

    @Override
    public String toString() {
        return "ColorDot{" + loc+ " : " + size + " : "+
                "red=" + red +
                ", green=" + green +
                ", blue=" + blue +
                '}';
    }
}
