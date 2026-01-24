package people;

import environment.Car;
import environment.Concert;
import environment.Location;
import exceptions.ConcertNotStartedException;

public class Traveler extends Person {

    public Traveler(String name, Mood mood) {
        super(name, mood);
    }

    public void watchConcert(Concert concert) throws ConcertNotStartedException {
        if (!concert.isStarted()) {
            throw new ConcertNotStartedException();
        }
        System.out.println(getName() + " смотрит концерт");
        react();
    }

    public void ride(Car car) {
        car.drive(new Location("Гостиница"));
    }
}