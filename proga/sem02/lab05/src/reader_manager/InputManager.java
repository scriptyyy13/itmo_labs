package reader_manager;

import models.*;

import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Scanner;

/**
 * Класс для безопасного чтения пользовательского ввода.
 * Обрабатывает ошибки и повторяет ввод при некорректных данных.
 * Используется для создания объектов City, Coordinates, Human и Government.
 *
 * author Ыскшзеннн
 * version 1.0
 */
public class InputManager {

    /** Сканер для чтения данных с консоли */
    private final Scanner scanner;

    /**
     * Конструктор InputManager.
     *
     * @param scanner объект Scanner для чтения пользовательского ввода
     */
    public InputManager(Scanner scanner) {
        this.scanner = scanner;
    }

    /**
     * Читает непустую строку.
     *
     * @param message сообщение для пользователя
     * @return непустая строка
     */
    public String readNonEmptyString(String message) {
        while (true) {
            System.out.println(message);
            String input = scanner.nextLine();
            if (!input.isBlank()) return input;
            System.out.println("Строка не может быть пустой.");
        }
    }

    /**
     * Читает число типа Long.
     *
     * @param message сообщение для пользователя
     * @param nullable разрешить пустое значение (возвращается null)
     * @return введённое число или null
     */
    public Long readLong(String message, boolean nullable) {
        while (true) {
            System.out.println(message);
            String input = scanner.nextLine();

            if (nullable && input.isBlank()) return null;

            try {
                long value = Long.parseLong(input);
                if (value <= 0) {
                    System.out.println("Число должно быть > 0.");
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Введите корректное число.");
            }
        }
    }

    /**
     * Читает число типа Float.
     *
     * @param message сообщение для пользователя
     * @return введённое число
     */
    public Float readFloat(String message) {
        while (true) {
            System.out.println(message);
            try {
                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите корректное число.");
            }
        }
    }

    /**
     * Читает число типа Integer с верхним ограничением.
     *
     * @param message сообщение для пользователя
     * @param maxValue максимальное допустимое значение
     * @return введённое число
     */
    public Integer readInt(String message, int maxValue) {
        while (true) {
            System.out.println(message);
            try {
                int value = Integer.parseInt(scanner.nextLine());
                if (value > maxValue) {
                    System.out.println("Значение не должно превышать " + maxValue);
                    continue;
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Введите корректное число.");
            }
        }
    }

    /**
     * Читает значение enum Government.
     *
     * @return выбранное значение Government или null, если пусто
     */
    public Government readGovernment() {
        while (true) {
            System.out.println("Выберите Government (пусто = null):");
            for (Government g : Government.values()) {
                System.out.println(g.name());
            }

            String input = scanner.nextLine();
            if (input.isBlank()) return null;

            try {
                return Government.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Неверное значение enum.");
            }
        }
    }

    /**
     * Читает объект Human (governor).
     *
     * @return объект Human или null, если имя пустое
     */
    public Human readHuman() {
        System.out.println("Введите governor (пусто = null):");
        String name = scanner.nextLine();
        if (name.isBlank()) return null;

        int height = readInt("Введите height (>0):", Integer.MAX_VALUE);

        return new Human(name, height, ZonedDateTime.now());
    }

    /**
     * Читает объект City, запрашивая все необходимые поля у пользователя.
     *
     * @return объект City
     */
    public City readCity() {
        String name = readNonEmptyString("Введите name:");

        Float x = readFloat("Введите coordinates.x:");
        Integer y = readInt("Введите coordinates.y (<=150):", 150);

        Coordinates coordinates = new Coordinates(x, y);

        long area = readLong("Введите area (>0):", false);
        Long population = readLong("Введите population (>0):", false);
        Long meters = readLong("Введите metersAboveSeaLevel (пусто = null):", true);
        long agglomeration = readLong("Введите agglomeration (>0):", false);

        Government government = readGovernment();
        Human governor = readHuman();

        return new City(
                name,
                coordinates,
                area,
                population,
                meters,
                new Date(),
                agglomeration,
                government,
                governor
        );
    }
}