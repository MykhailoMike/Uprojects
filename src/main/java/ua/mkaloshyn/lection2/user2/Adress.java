package ua.mkaloshyn.lection2.user2;

public class Adress implements Cloneable {

    private String city;
    private int code;

    public Adress(String city, int code) {
        this.city = city;
        this.code = code;
    }

    public void setCity (String city) {
        this.city = city;
    }

    public void setCode (int code) {
        this.code = code;
    }

    public String getCity(){
        return city;
    }

    public int code() {
        return code;
    }

    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                ", code=" + code +
                '}';
    }

    /*@Override
    protected Adress clone() {
        return new Adress(this.city, this.code);
    }*/

    @Override
    protected Adress clone() throws CloneNotSupportedException {
        return (Adress)super.clone();
    }
}

