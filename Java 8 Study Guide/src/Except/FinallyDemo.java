package Except;

/**
 * Created by viioo on 07.01.2016.
 */
public class FinallyDemo {
    static void procA() {
        try {
            System.out.println("внутри procA");
            throw new RuntimeException("демо");
        } finally {
            System.out.println("блок finally procA");
        }
    }
    // Возврат управления в блоке try.
    static void procB() {
        try {
            System.out.println("внутри procB");
            return;
        } finally {
            System.out.println("блок finally procB");
        }
    }
    // Нормальное выполнение блока try.
    static void procC() {
        try {
            System.out.println("внутри procC");
        } finally {
            System.out.println("блок finally procC");
        }
    }
    public static void main(String args[]) {
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Исключение перехвачено " +e.getMessage());
        }
        procB();
        procC();
    }
}
