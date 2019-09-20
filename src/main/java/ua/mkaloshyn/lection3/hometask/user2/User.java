package ua.mkaloshyn.lection3.hometask.userwithbuilder.user2;

public class User {

    private final Adress adress;
    private final String name;

    public User(Adress adress, String name) throws CloneNotSupportedException {
        this.adress = adress.clone();
        this.name = name;
    }

    public Adress getAdresse() {
        return adress;
    }

    public String getName() {
        return name;
    }

}
