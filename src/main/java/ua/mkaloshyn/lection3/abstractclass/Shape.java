package ua.mkaloshyn.lection3.abstractclass;

public abstract class Shape { //объект такого класса создать нельзя, так как абстракт.

    private String name;

    public Shape(String name) {
        this.name = name;
        System.out.println("Shape");
    }

    public void printName(String name) { //наследники наследуют реализацию, можно переопределить
        System.out.println(name);
    }

    public abstract int getPerimeter();

}
