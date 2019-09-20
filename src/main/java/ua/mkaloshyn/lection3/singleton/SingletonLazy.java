package ua.mkaloshyn.lection3.singleton;

public class SingletonLazy { //этот вариант очень плохой в случае многопоточности

    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}
