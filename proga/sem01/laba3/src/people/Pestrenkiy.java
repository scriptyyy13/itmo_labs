package people;

public class Pestrenkiy extends Traveler {

    private boolean hasBump;

    public Pestrenkiy(Mood mood) {
        super("Пестренький", mood);
    }

    public void hitHead() {
        hasBump = true;
        System.out.println(getName() + " ударился и набил шишку");
    }
}