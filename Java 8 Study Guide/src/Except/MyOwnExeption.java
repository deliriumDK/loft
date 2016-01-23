package Except;

/**
 * Created by dima on 13.01.2016.
 */
public class MyOwnExeption extends Exception {
    private String message = null;

    public MyOwnExeption(String message){
        super(message);
        this.message = message;
    }

    public MyOwnExeption(Throwable couse){
        super(couse);
    }

    @Override
    public String toString() {
        return message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
