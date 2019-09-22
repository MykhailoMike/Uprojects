package ua.mkaloshyn.lection5.innerclasses;

public class User {

    private String name;
    private String surname;
    public static final String CODE; //по умолчанию Null???

    static {
        CODE = "CODE_OUTER"; //помогает загрузить стат блок внешнего класса, если его объект не создается
        System.out.println("User");
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
        System.out.println(Adress.CODE_INNER);
        new Adress(100).adressMethod();
        Adress.adressStaticMethod();
    }

    private void userMethod() {
        System.out.println("UserMethod");
    }

    public static void userStaticMethod() {
        System.out.println("UserMethod");
    }

    public static class Adress {
        public static final String CODE_INNER; /* = "CODE INNER"; */
        private int code;

        static {
            CODE_INNER="Code_Inner";
            System.out.println("Address");
        }

        public void adressMethod () { //private?
            System.out.println("adress Method");
        }

        public static void adressStaticMethod () { //private?
            System.out.println("adress static Method");
        }

        public Adress(int code) {
            this.code = code;
            System.out.println(CODE);
            new User ("df", "df").userMethod();
            userStaticMethod();
        }
    }
}
