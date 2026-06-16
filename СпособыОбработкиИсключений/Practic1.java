double divide(int a, int b) {
    return (double) a / b;
}

void main() {
    int a = 0;
    String b = null;
    try {
        System.out.println("Результат: " + divide(b.length(),a));//ArithmeticException обработает NullPointerException - нет
    } catch (ArithmeticException e) {
        System.out.println("Ошибка: Деление на ноль!");
      System.out.println(e.getMessage());
    }
}