package inher;

/**
 * Created by viioo on 06.01.2016.
 */
public class Rectangle extends Figure {
    Rectangle(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("Rectangle is");
        return dim2*dim1;
    }
    double es(){
        System.out.println("sd");
        return 1;
    }
}
