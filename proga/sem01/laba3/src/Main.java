import environment.*;
import exceptions.ConcertNotStartedException;
import people.*;

import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        // окружение
        Light light = new Light(80);
        City city = new City("Солнечный город", light);
        Car car = new Car("Кнопочный автомобиль");

        // концерт
        Concert concert = new Concert(light);

        concert.addArtist(new Magician("Фокусник", Mood.HAPPY));
        concert.addArtist(new Acrobat("Акробат", Mood.NEUTRAL));
        concert.addArtist(new Dancer("Танцор", Mood.HAPPY));
        concert.addArtist(new Clown("Клоун", Mood.HAPPY));

        // персонажи
        Traveler neznayka = new Neznayka(Mood.HAPPY);
        Traveler knopochka = new Knopochka(Mood.OFFENDED);
        Pestrenkiy pestrenkiy = new Pestrenkiy(Mood.HAPPY);

        List<Traveler> travelers = List.of(neznayka, knopochka, pestrenkiy);

        // сценарий
        System.out.println("Представление продолжается...");
        city.showNightView();

        try {
            // случайный старт концерта
            if (random.nextBoolean()) {
                concert.start();
            }

            for (Traveler traveler : travelers) {
                traveler.watchConcert(concert);
            }

        } catch (ConcertNotStartedException e) {
            System.out.println("Ошибка: " + e.getMessage());
            System.out.println("Зрители недоумевают и ждут начала");
            concert.start();
        }

        // случайное событие удара головой
        if (random.nextBoolean()) {
            pestrenkiy.hitHead();
        }

        concert.finish();

        // поездка назад
        System.out.println("Путешественники отправляются обратно");
        for (Traveler traveler : travelers) {
            traveler.ride(car);
        }
    }
}