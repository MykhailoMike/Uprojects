package ua.mkaloshyn.lection3;

import ua.mkaloshyn.lection3.singleton.Singleton1;

public class Main {

 /*   static {
        Byte[][]Byte={{0}};
        System.out.println(Byte.class);}

    public static void main(String[] args) {
        System.out.println(Byte.class);
    }*/

    public static void main(String[] args) {
        /*for (int i = 0, j = 0; i < 10; i++) {
            if (i == 8) {
                continue;
            }
            //на i=8 ничего не будет выводиться, т.е. прервется итерация
            System.out.println(i);

            if (i == 2) {
                break;//прервет цикл поностью
            }
        }*/

        //User user = new User("Iv", "Ivan", "i@gmail.com", "password");

        User user = User.builder()
                .withName("Ivan")
                .withSurname("Iv")
                .withPassword("pass")
                .build();

        Singleton1.SINGLETON.method();

        System.out.println(0.0/0.0+10);

        double c = (double) 0;

        String str = String.format("%1.4f",c);
        System.out.println(str);

    }
}
