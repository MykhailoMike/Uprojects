package ua.mkaloshyn.lection3;

public class A {

    private Integer k;
    private int z;
    private int i;
    public void method(){
        i=k+z;
    }

    public static void main(String[] args) {
        A t = new A();
        t.method();
        System.out.println(t.i);
    }
}
