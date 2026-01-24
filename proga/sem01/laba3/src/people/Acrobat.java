package people;

public class Acrobat extends Artist {

    public Acrobat(String name, Mood mood) {
        super(name, mood, "Акробатический номер", "Акробат");
    }

    @Override
    protected void doAct() {
        System.out.println(getName() + " делает сальто");
    }
}