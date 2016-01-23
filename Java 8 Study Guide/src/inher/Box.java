package inher;

public class Box{
    private double width;
    private double hight;
    private double depth;

     public int test(){
        int x= 2*2;
        return x;
    }

    @Override
    public String toString() {
        return "Box{" +
                "width=" + width +
                ", hight=" + hight +
                ", depth=" + depth +
                '}';
    }

    public Box clone() throws CloneNotSupportedException {
        return (Box)super.clone();
    }



    // использование объекта типа Вох
    Box(Box ob){//передача объекта конструктору//и тут что**
        width = ob.width;
        hight = ob.hight;
        depth = ob.depth;
    }
    // конструктор используемый при указании всех измерений
    Box(double w, double h, double d){
        width = w;
        hight = h;
        depth = d;
    }
    // конструктор без указанных измерений
    Box(){
        width = -1;
        hight = -1;
        depth = -1;
    }

    // конструктор куба
    Box(double len){
        width=hight=depth=len;
    }

    //Вычесление и возвращение обьема
    double volume(){
        return width*hight*depth;
    }
}
