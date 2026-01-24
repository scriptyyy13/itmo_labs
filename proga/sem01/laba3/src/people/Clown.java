package people;

public class Clown extends Artist {

    public Clown(String name, Mood mood) {
        super(name, mood, "Смешной номер", "Клоун");
    }

    @Override
    protected void doAct() {
        System.out.println(getName() + " падает и смешит зрителей");
    }
}