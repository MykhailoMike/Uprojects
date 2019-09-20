package ua.mkaloshyn.lection1;

public class Test {

    static int b = Test.a;
    static final int a = 3;


    public static void main(String[] args) {
        System.out.println(a + " " + b);


        /*final Integer i = 1;
        switch (1) {
            case i:
                System.out.println("gg"); break;
                default:
                    System.out.println("def");
        }*/

    }
}