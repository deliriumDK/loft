package Except;

/**
 * Created by viioo on 07.01.2016.
 */
class MultipleCatches {
    public static void main(String args[]) {
        try {
            int a = 1;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        } catch (ArithmeticException c) {
            System.out.println("Ошибка индекса массива: " + c);
        } catch (Exception e) {
            System.out.println("Деление на 0: " + e);

            System.out.println("После блока try/catch.");
        }
    }
}