package environment;

import people.Artist;

import java.util.ArrayList;
import java.util.List;

public class Concert {

    private final List<Artist> artists = new ArrayList<>();
    private boolean started;
    private final Light light;

    public Concert(Light light) {
        this.light = light;
    }

    public void addArtist(Artist artist) {
        artists.add(artist);
        System.out.println("В концерт добавлен артист: " + artist.getProfession());
    }

    public void removeArtist(Artist artist) {
        artists.remove(artist);
        System.out.println("Артист покинул концерт");
    }

    public List<Artist> getArtists() {
        return artists;
    }

    public void start() {
        started = true;
        System.out.println("Концерт начинается");
        light.illuminate();

        for (Artist artist : artists) {
            artist.perform();
        }
    }

    public void finish() {
        started = false;
        System.out.println("Концерт окончен");
    }

    public boolean isStarted() {
        return started;
    }

    @Override
    public String toString() {
        return "Concert{artists=" + artists.size() + ", started=" + started + '}';
    }
}