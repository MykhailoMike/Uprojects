package ua.mkaloshyn.lection3.interfaces.anonymous;

public class MyA {

    private int code;

    public MyA(int code) {
        this.code = code;
    }

    public MyA() {
    }

    public void hello(){
        System.out.println(code);
    }
}
