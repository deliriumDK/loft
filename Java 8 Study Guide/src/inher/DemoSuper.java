package inher;

/**
 * Created by viioo on 05.01.2016.
 */
public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10,20,15,34.3);
        BoxWeight clone = new BoxWeight(mybox1);
    }
}
