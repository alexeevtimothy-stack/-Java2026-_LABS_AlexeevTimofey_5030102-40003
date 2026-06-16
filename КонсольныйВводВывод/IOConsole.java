import java.util.Scanner;//импортируем сканер
void main() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите сове имя:");//просим ввести имя и после выводим сообщение
    String name = scan.next();
    System.out.println("Привет,"+name+"!");
}
