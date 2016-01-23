package inher;

import inher.Box;

public class BoxDemo {
    public static void main(String... args) throws CloneNotSupportedException {
        // Объявление резервирование и инициализация объектов inher.Box
        // создание с применением различных конструкторов

        Box mybox1 = new Box(10,20,15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);

        Box boxclone = mybox1.clone();


        //создание копии myBox1
       Box myclone = new Box(mybox1);// что именно происходит**

        double vol;
// Получение объема первого параллелепипеда
        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

// Получение объема второго параллелепипеда
        vol = mybox2.volume();
        System.out.println("Volume is " + vol);

//получение объема куба
        System.out.println("Volume of mycube is "+mycube.volume());
        System.out.println(mybox1.test());

        System.out.println(boxclone);

// получение объема клона
  /*      vol = myclone.volume();
        System.out.println("Volume of myclone is "+vol);*/
    }
}
