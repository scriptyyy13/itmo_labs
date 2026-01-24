package people;

public abstract class Artist extends Person implements Performer {

    private final String actName;
    private final String profession;

    protected Artist(String name, Mood mood, String actName, String profession) {
        super(name, mood);
        this.actName = actName;
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    @Override
    public final void perform() {
        System.out.println(getName() + " выступает. Номер: " + actName);
        doAct();
    }

    @Override
    public String toString() {
        return "Artist{name='" + getName() + "', mood=" + getMood() +
                ", actName='" + actName + "', profession='" + profession + "'}";
    }

    protected abstract void doAct();
}
