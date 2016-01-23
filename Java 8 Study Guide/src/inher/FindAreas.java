package inher;

/**
 * Created by viioo on 06.01.2016.
 */
public class FindAreas {
    public static void main(String[] args) {
       // Figure f = new Figure(10,10);
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
       // infoFig(f);
        infoFig(t);
        infoFig(r);
    }
    public static void infoFig(Figure x){
        System.out.println("Area is "+x.area());
    }
}
