package ua.mkaloshyn.lection3.interfaces.anonymous;

public class Main { //когда такая реализация нужна только в одном месте и больше нигде не использую

    public static void main(String[] args) {

        AI ai = new AI() {
            @Override
            public int method() {
                return 0;
            }

            @Override
            public void hello() {
                System.out.println("Hi");
            }
        };

        ai.hello();

        MyA myA = new MyA(100) {
            @Override
            public void hello() {
                System.out.println("hello");
            }
        };

        System.out.println(myA.getClass().getName());
    }
}
