package ua.mkaloshyn.lection2.user1;

public class Main {

    public static void main(String[] args) {

        User user1 = new User();
        User user2 = new User();

        user1.setName("Oleg");
        user1.setSurname("Popenko");
        user1.setAge(35);
        user1.setActive(true);

        String b = new String("Popenko");

        user2.setName("Oleg");
        user2.setSurname(b);
        user2.setAge(35);
        user2.setActive(true);

        System.out.println(user1.equals(user2));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());

    }

}
