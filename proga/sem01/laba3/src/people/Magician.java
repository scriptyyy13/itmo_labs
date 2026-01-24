package people;

public class Magician extends Artist {

    public Magician(String name, Mood mood) {
        super(name, mood, "Магический фокус", "Фокусник");
    }

    @Override
    protected void doAct() {
        System.out.println(getName() + " достает кролика из шляпы");
    }
}