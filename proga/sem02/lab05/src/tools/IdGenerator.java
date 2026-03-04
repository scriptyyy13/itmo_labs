package tools;

/**
 * Класс для генерации уникальных ID.
 * Используется для автоматического присвоения id объектам City.
 *
 * ID:
 * - всегда > 0
 * - уникальны
 * - генерируются автоматически
 *
 * @author Ыскшзеннн
 * @version 1.0
 */
public class IdGenerator {

    /**
     * Текущий максимальный ID.
     */
    private static long currentId = 1;

    /**
     * Генерирует новый уникальный ID.
     *
     * @return уникальный ID > 0
     */
    public static long generateId() {
        return currentId++;
    }

    /**
     * Обновляет текущий ID при загрузке из файла.
     * Нужно, чтобы новые элементы не повторяли старые ID.
     *
     * @param existingId ID из файла
     */
    public static void updateId(long existingId) {
        if (existingId >= currentId) {
            currentId = existingId + 1;
        }
    }

    /**
     * Сбрасывает генератор.
     */
    public static void reset() {
        currentId = 1;
    }
}