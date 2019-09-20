package ua.mkaloshyn.lection3.hometask.userwithbuilder.user2;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException, InterruptedException {

        Adress adress = new Adress("Kyiv", 54001);

        User user1 = new User(adress, "Popenko Alex");

        System.out.println(user1.getName());
        System.out.println(user1.getAdresse());
        System.out.println();

        adress.setCity("Mykolaiv");

        System.out.println(user1.getName());
        System.out.println(user1.getAdresse());
        System.out.println();

        //User user2 = new User(adress, "Popenko Ilona");

        /*System.out.println(user1.equals(user2));
        System.out.println(user1.toString());
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1.getClass().getSimpleName());*/

    }
}
