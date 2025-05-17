package topic2Exceptions.task3FileNotFoundException;
import java.io.FileNotFoundException;
import java.io.FileReader;


/**
 * Пытается создать объект FileReader для несуществующего файла.
 * Использует блок try-catch для перехвата FileNotFoundException.
 * Выводит сообщение об ошибке, если файл не найден.
 */

public class FileReaderDemo {
    public static void main(String[] args) {

        try {
            FileReader reader = new FileReader("text.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Такого файла нет.");
        }
    }
}
