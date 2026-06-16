import java.io.*;//подключаем FileInputStream

void main() {
    try (FileInputStream fis = new FileInputStream("test.txt")) {
        int data;
        while ((data = fis.read()) != -1) {//считываем содержание файла
            System.out.print((char) data);
        }

    } catch (FileNotFoundException e) {//обрабатываем, если вдруг будут ошибки
        System.out.println("Файл не найден: " + e.getMessage());
    } catch (IOException e) {
        System.out.println("Ошибка чтения: " + e.getMessage());
    }
}