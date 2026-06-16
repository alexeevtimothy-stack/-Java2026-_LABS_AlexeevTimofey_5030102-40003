import java.io.*;

void main() {
    //try-with-resources автоматически закрывает
    try (FileInputStream fis = new FileInputStream("file.txt")) {//нет необходимости закрывать fis
    } catch (IOException e) {
        e.printStackTrace();
    }
}