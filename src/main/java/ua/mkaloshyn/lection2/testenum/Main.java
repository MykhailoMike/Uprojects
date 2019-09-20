package ua.mkaloshyn.lection2.testenum;

public class Main {

    public static void main(String[] args) {

        /*System.out.println(Seasons.SPRING);
        System.out.println(Seasons.WINTER);

        for(Seasons s: Seasons.values()){
            System.out.println(s);
        }*/

        System.out.println(Seasons.SPRING.ordinal());
        System.out.println(Seasons.SPRING.hashCode());
        System.out.println(Seasons.FALL.hashCode());

    }
}
