package ua.mkaloshyn.lection3.hometask.userwithbuilder;

public class Main {

    public static void main(String[] args) {

        UserHT userHT = UserHT.builder()
                .withName("Denis")
                .withCode(50400)
                .withEmail("den@gmail")
                .withSurname("Ivantsov")
                .withPassword("ttt")
                .build();

        System.out.println(userHT.toString());
    }
}
