package ua.mkaloshyn.lection3.abstractclass;

public class Circle extends Shape {

    private int radius;

    public Circle(String name, int radius) {
        super(name);
        this.radius = radius;

    }

    @Override
    public int getPerimeter() {
        return (int) (2 * Math.PI * radius);
    }
}
