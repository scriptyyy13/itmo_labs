package commands;

import models.City;
import models.Government;
import reader_manager.InputManager;
import tools.CollectionManager;

import java.util.stream.Collectors;

/**
 * Команда filter_by_government government.
 * Выводит элементы коллекции, значение поля government которых равно указанному.
 *
 * author Ыскшзеннн
 * version 1.0
 */
public class FilterByGovernment implements Command {

    private final CollectionManager collectionManager;
    private final InputManager inputManager;

    /**
     * Конструктор команды FilterByGovernment.
     *
     * @param collectionManager менеджер коллекции
     * @param inputManager менеджер для чтения пользовательского ввода
     */
    public FilterByGovernment(CollectionManager collectionManager, InputManager inputManager) {
        this.collectionManager = collectionManager;
        this.inputManager = inputManager;
    }

    /**
     * Выполняет команду.
     * Считывает значение Government и выводит все элементы коллекции с таким типом правления.
     */
    @Override
    public void execute() {
        try {
            Government government = inputManager.readGovernment();
            if (government == null) {
                System.out.println("Government не введён.");
                return;
            }

            var filtered = collectionManager.getCollection().stream().filter(city -> government.equals(city.getGovernment())).collect(Collectors.toList());

            if (filtered.isEmpty()) {
                System.out.println("Элементы с Government = " + government + " не найдены.");
            } else {
                System.out.println("Элементы с Government = " + government + ":");
                filtered.forEach(System.out::println);
            }

        } catch (Exception e) {
            System.out.println("Ошибка при фильтрации: " + e.getMessage());
        }
    }
}