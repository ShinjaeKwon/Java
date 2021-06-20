import java.lang.Math;
    public class Dice {
       public static void main(String[] args){
           int x= 7;
           int y= 4;
           int z;

           z = ++x /y;
           x += ++y +3 + z--;

           System.out.print(z+" : "+x+" : "+y);
       }
}
