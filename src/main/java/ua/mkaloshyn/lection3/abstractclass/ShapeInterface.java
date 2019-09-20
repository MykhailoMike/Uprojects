package ua.mkaloshyn.lection3.abstractclass;

public interface ShapeInterface {

    public static final String NAME = "";//константа, нужно сразу инициализировать

    public abstract int getPerimeter();

    public default void printName (String name) { //наследники наследуют реализацию, можно переопределить
        System.out.println(name);
    }

    public static int calc() {
        return 0;
    }
}

