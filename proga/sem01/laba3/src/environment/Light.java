package environment;

public class Light {

    private int intensity; // 0–100

    public Light(int intensity) {
        this.intensity = intensity;
    }

    public void illuminate() {
        if (intensity > 70) {
            System.out.println("Вокруг светло, как днем");
        } else if (intensity > 30) {
            System.out.println("Освещение умеренное");
        } else {
            System.out.println("Света мало, вокруг сумрачно");
        }
    }

    public int getIntensity() {
        return intensity;
    }

    public void changeIntensity(int intensity) {
        this.intensity = intensity;
        System.out.println("Интенсивность света изменилась на " + intensity);
    }

    @Override
    public String toString() {
        return "Light{intensity=" + intensity + '}';
    }
}