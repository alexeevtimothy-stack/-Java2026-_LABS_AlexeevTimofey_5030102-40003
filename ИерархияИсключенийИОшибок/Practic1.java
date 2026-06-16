public static double divide(int a, int b) {
    if (b == 0) {
        throw new IllegalArgumentException("Делитель не может быть равен 0");
    }
    return (double) a / b;
}

void main() {
    //Arithmetic error - арифметическая ошибка при вычислении
    //int a = 10;
    //int b = 0;
   // try {
     //   int result = a / b;
       // System.out.println("Результат: " + result);
    //} catch (ArithmeticException e) {
     //   System.out.println("Ошибка: Деление на ноль!");
    //    System.out.println(e.getMessage());
   // }


    //ArrayIndexOutOfBoundsException - выход за границу массива
    //int[] numbers = {10, 20, 30, 40, 50};
    //try {
      //  int index = 10;
       // System.out.println("Значение: " + numbers[index]);
    //} catch (ArrayIndexOutOfBoundsException e) {
     //   System.out.println("Ошибка: Индекс вне диапазона!");
    //    System.out.println(numbers.length);
   // }


    //IllegalArgumentException - некорректный аргумент переданный в функцию
    //try {
        //System.out.println("100 / 5 = " + divide(100, 5));
       // System.out.println("10 / 0 = " + divide(10, 0));
   // } catch (IllegalArgumentException e) {
     //   System.out.println(e.getMessage());
    //}


    //ClassCastException - ошибка приведения одного класса к другому
    //Object obj = "Hello World";
    //try {
       // Object myObject = "Это строка";
        //Integer number = (Integer) myObject;
       // System.out.println("Число: " + number);
   // } catch (ClassCastException e) {
      //  System.out.println("Ошибка: Неверное приведение типа!");
      //  System.out.println(e.getMessage());
   // }


    //NullPointerException - ошибка при передаче пустого указателя
    //try {
       // String str = null;
       // System.out.println("Длина: " + str.length());
    //} catch (NullPointerException e) {
       // System.out.println("Ошибка: Попытка обратиться к null объекту!");
       // System.out.println(e.getMessage());
    //}
}