package people;

import java.util.Objects;

public abstract class Person {

    private final String name;
    private Mood mood;

    protected Person(String name, Mood mood) {
        this.name = name;
        this.mood = mood;
    }

    public String getName() {
        return name;
    }

    public Mood getMood() {
        return mood;
    }

    public void changeMood(Mood mood) {
        this.mood = mood;
        System.out.println(name + " теперь чувствует себя " + mood);
    }

    public void react() {
        switch (mood) {
            case HAPPY -> System.out.println(name + " радуется происходящему");
            case OFFENDED -> System.out.println(name + " обижен и не улыбается");
            case NEUTRAL -> System.out.println(name + " реагирует спокойно");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', mood=" + mood + '}';
    }
}