package ua.mkaloshyn.lection5.solid;

public interface Service {

    //User service

    void registrate(User user);
    void login (String password, String login);

    //message service
    void sendMessage(Message message);

    //help service
    String getCountries ();

}
