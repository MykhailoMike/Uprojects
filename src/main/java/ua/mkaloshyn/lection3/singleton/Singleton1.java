package ua.mkaloshyn.lection3.singleton;

public class Singleton1 {

    public static final Singleton1 SINGLETON = new Singleton1(); //создали одну сущность

    private Singleton1() { //запрещаем создавать сущность извне
    }

    public void method() {
        System.out.println("Hello");
    }
}
