import java.io.*;
import java.util.Scanner;//подгружаем сканер и потоки ввода/вывода

void main() {
    try (Scanner scanner = new Scanner(new File("test.txt"))) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            System.out.println(line);
        }
    } catch (FileNotFoundException e) {
        System.out.println(e.getMessage());
    }
}