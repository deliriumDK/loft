package inher;

/**
 * Created by viioo on 06.01.2016.
 */
public class Circle extends Figure {
    Circle(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("Triangle is ");
        return dim1*dim2/2;
    }
}
