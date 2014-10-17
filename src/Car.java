/**
 * Created by Соня on 17.10.2014.
 */
abstract public class Car {
    private String make;

    public abstract void start();

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return make;
    }

    public static void main(String[] args) {
        Car Hybrid = new Car() {
            int battery = 3000;
            @Override
            public void start() {
                    battery -= 100;
            }
        };
    }
}