package environment;

public class City {

    private final String name;
    private final Light light;

    public City(String name, Light light) {
        this.name = name;
        this.light = light;
    }

    public void showNightView() {
        System.out.println("Над городом " + name + " чернеет ночное небо");
        light.illuminate();
        System.out.println("Дома и киоски светятся красками");
    }

    public Light getLight() {
        return light;
    }

    @Override
    public String toString() {
        return "City{name='" + name + "'}";
    }
}