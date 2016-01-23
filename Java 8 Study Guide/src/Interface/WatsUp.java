package Interface;

/**
 * Created by viioo on 06.01.2016.
 */
public class WatsUp implements MyIn {
    @Override
    public String watsUp(String Name) {
        System.out.print(Name);
        return Name;
    }

    @Override
    public int msg(int callMsg) {
        System.out.print(callMsg);
        return callMsg;

    }
    void shit(){
        watsUp("asd");
        msg(7);
    }

}
