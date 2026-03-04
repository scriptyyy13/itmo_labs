package commands;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import tools.CommandManager;

/**
 * Команда execute_script file_name.
 * Выполняет команды из указанного файла, будто бы они вводились пользователем (как в интерактивном режиме).
 *
 * author Ыскшзеннн
 * version 1.0
 */
public class ExecuteScript implements Command {

    private final CommandManager commandManager;

    /**
     * Конструктор команды ExecuteScript.
     *
     * @param commandManager менеджер команд для выполнения команд из файла
     */
    public ExecuteScript(CommandManager commandManager) {
        this.commandManager = commandManager;
    }

    /**
     * Выполняет команду.
     * Пользователю предлагается ввести имя файла скрипта.
     * Затем команды из файла выполняются последовательно.
     */
    @Override
    public void execute() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла скрипта:");
        String scriptFileName = scanner.nextLine().trim();

        File file = new File(scriptFileName);
        if (!file.exists() || !file.isFile()) {
            System.out.println("Файл не найден: " + scriptFileName);
            return;
        }

        try (Scanner fileScanner = new Scanner(file)) {
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim();
                if (line.isEmpty() || line.startsWith("#")) continue; // пропуск пустых строк и комментариев

                String[] parts = line.split(" ");
                String commandName = parts[0];
                String[] cmdArgs = new String[parts.length - 1];
                System.arraycopy(parts, 1, cmdArgs, 0, cmdArgs.length);

                System.out.println("> " + line);
                commandManager.execute(commandName);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}