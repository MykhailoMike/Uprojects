package ua.mkaloshyn.lection2.inGroup;

public enum Color {

    YELLOW("yellow"),
    GREEN("green", 1) {
        @Override
        public void method() {
            System.out.println("Something");
        }
    };

    private String name;
    private int code;

    private Color(String name) {// default conxtructor
        this.name = name;
    }

    Color(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public void method() {
        System.out.println("One help");
    }
}
