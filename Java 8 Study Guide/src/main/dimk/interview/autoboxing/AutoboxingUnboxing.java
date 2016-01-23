package main.dimk.interview.autoboxing;

/**
 *
 */
public class AutoboxingUnboxing {

    public static void main(String[] args) {

        // Byte, Short, Integer, Double, Float, Character, Boolean
        int value = 32;
        System.out.println("Autoboxing int = 32 : ");
        Integer valueBox = getAsBox(value);
        Integer value2Box = 32;
        Integer valueFromString = Integer.parseInt("3");
        System.out.println("From string : " + valueFromString);
        System.out.println(valueBox);
        // isHungry(Boolean flag) ; boolean flag = true;
        // isHungry(true); isHungry(flag);

        System.out.println("Unboxing Integer object (32) : ");
        printInteger(valueBox);

        System.out.println("Print Integer reference:");
        printIntegerObj(valueBox);

        // сравнение всех ссылочных boxes надо делать только с помощью метода equals(), а не с помощью ==, как мы делаем сравнение элементарных типов
        Integer i1 = new Integer(2);
        Integer i2 = new Integer(2);
        System.out.println("Через == : " + (i1 == i2));
        System.out.println("Через equals() : " + i1.equals(i2));
    }

    private static void printInteger(int value) {
        System.out.println(value);
    }

    private static Integer getAsBox(int value) {
        return value;
    }

    private static void printIntegerObj(Integer obj) {
        System.out.println(obj.getClass().getName() + " : " + obj);
    }
}
