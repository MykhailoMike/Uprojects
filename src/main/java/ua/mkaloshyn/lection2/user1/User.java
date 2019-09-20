package ua.mkaloshyn.lection2.user1;

public class User {

    private String name;
    private String surname;
    private int age;
    private boolean active;

    public User() {

    }

    public User(String name, String surname, int age, boolean active) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.active = active;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public boolean isActive() {
        return active;
    }

    public boolean equals(User user) {

        if (this == user) return true;
        if (user == null) return false;
        return (age == user.getAge() &&
                active == user.isActive() &&
                (name == user.getName() || (name != null) && (name.equals(user.getName()))) &&
                (surname == user.getSurname() || (surname != null) && (surname.equals(user.getSurname()))));

    }

    @Override
    public int hashCode() {
        int result = 17;
        result = result*31 + age;
        result = result*31 + (active?1:0);
        result = result*31 + ((name != null)?name.hashCode():0);
        result = result*31 + ((surname !=null)?surname.hashCode():0);
        return result;
    }
}
