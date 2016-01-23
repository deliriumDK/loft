package main.dimk.interview.type_check;

/**
 * Created by viioo on 09.01.2016.
 */
public class Main {
    private int id;
    public static void main(String[] args) {
        checkType(new Integer(5));
        checkType(new String("Five"));
        checkType(new Object());

    }
    public static void checkType(Object obj){
        System.out.println(obj.getClass().getName());
    }
    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if (obj instanceof Main){
            Main temp = (Main)obj;
            if (this.getId() == temp.getId()){
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public boolean preciseEqualByType(Object obj){
        return this.getClass().getName().equals(obj.getClass().getName());
    }
}
