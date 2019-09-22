package ua.mkaloshyn.lection5.innerclasses;

public class Car {

    private static final String CODE = "100";
    private String name;
    private Engine engine; //composition

    public String getName() {
        return name;
    }

    public Car setName(String name) {
        this.name = name;
        return this;
    }

    public Engine getEngine() {
        return engine;
    }

    public Car setEngine(Engine engine) {
        this.engine = engine;
        return this;
    }

    public Car(String name, int volume, int code) {
        this.name = name;
        this.engine = new Engine(volume, code);
        //engine.innerMethod();


    }

    private void method(){

        System.out.println("outer method");

    }

    public class Engine {

       // private static String str; ошибка компиляции

        private final int volume;
        private final int code;

        public Engine(int volume, int code) {
            this.volume = volume;
            this.code = code;
            setName("Hello");
            method();
        }

        public int getVolume() {
            return volume;
        }


    }
}


