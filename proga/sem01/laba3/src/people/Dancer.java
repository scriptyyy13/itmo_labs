package people;

public class Dancer extends Artist {

    public Dancer(String name, Mood mood) {
        super(name, mood, "Танцевальный номер", "Танцор");
    }

    @Override
    protected void doAct() {
        System.out.println(getName() + " исполняет SUPERский танец");
    }
}