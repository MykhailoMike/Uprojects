package ua.mkaloshyn.lection3.interfaces.s3;

public class MyA implements A1, B1 {

    @Override
    public void method() {
        A1.super.method();
        B1.super.method();
    }
}
