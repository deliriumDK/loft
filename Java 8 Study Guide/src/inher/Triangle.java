package inher;

/**
 * Created by viioo on 06.01.2016.
 */
public class Triangle extends Figure {

    Triangle(double a, double b){
        super(a,b);
    }
    double area(){
        System.out.println("Triangle is ");
        return (int)(dim1*dim2/2);
    }

}
