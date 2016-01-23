package Interface;

/**
 * Created by viioo on 06.01.2016.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(WatsUp.BLA);
        WatsUp experiment = new WatsUp();
        /*experiment.shit();
        experiment.msg(12);
        experiment.watsUp("dima");*/
        MyIn s = experiment;
        s.watsUp("s");

    }

}
