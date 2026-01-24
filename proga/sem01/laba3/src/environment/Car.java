package environment;

public class Car {

    private final String type;

    public Car(String type) {
        this.type = type;
    }

    public void drive(Location destination) {
        System.out.println("Кнопочный автомобиль мчится к месту: " + destination.name());
    }

    @Override
    public String toString() {
        return "Car{type='" + type + "'}";
    }
}