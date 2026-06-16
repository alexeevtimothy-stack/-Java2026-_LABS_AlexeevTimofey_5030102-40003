import java.io.*;//подключаем FileInputStream

void main() {
    try (FileOutputStream fos = new FileOutputStream("output.txt")) {//создаем новый файл
        fos.write(72);  // 'H'
        fos.write(101); // 'e'
        fos.write(108); // 'l'
        fos.write(108); // 'l'
        fos.write(111); // 'o'
    } catch (IOException e) {
        System.out.println("Ошибка записи: " + e.getMessage());
    }
}