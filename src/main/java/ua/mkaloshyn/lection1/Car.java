package ua.mkaloshyn.lection1;

public class Car {

    private int year;
    private int vechiclePower;
    private int passangers;
    private String brand;

    public Car(int year, int vechiclePower, int passangers, String brand) {
        this.year = year;
        this.vechiclePower = vechiclePower;
        this.passangers = passangers;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Car car = (Car) o;
        return year == car.year &&
                vechiclePower == car.vechiclePower &&
                passangers == car.passangers;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result + year;
        result = 31*result + vechiclePower;
        result = 31*result + passangers;
        return result;
    }
}
