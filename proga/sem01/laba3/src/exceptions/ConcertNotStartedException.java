package exceptions;

public class ConcertNotStartedException extends Exception {

    @Override
    public String getMessage() {
        return "Концерт еще не начался, смотреть нечего";
    }
}