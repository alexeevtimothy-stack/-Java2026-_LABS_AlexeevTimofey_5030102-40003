void main() {
    StringBuilder sb = new StringBuilder();

    sb.append("Hello");//добавляет строку/число/символ в конец
    sb.append(" ");
    sb.append("World");
    sb.append(2024);
    System.out.println(sb);


    sb.insert(5, ",");//вставляет строку/символ в указанную позицию
    System.out.println(sb);
    sb.insert(0, "Start: ");
    System.out.println(sb);


    sb.delete(0, 7);//удаляет символы от start до end не включая
    System.out.println(sb);
    sb.delete(5, 6);
    System.out.println(sb);


    sb.deleteCharAt(11);//удаляет один символ по индексу
    System.out.println(sb);


    sb.replace(6, 11, "Java");//заменяет часть строки на другую
    System.out.println(sb);


    sb.reverse();//переворачивает строку задом наперёд
    System.out.println(sb);
    sb.reverse();
    System.out.println(sb);


    System.out.println("Длина строки: " + sb.length());//длина строки и вместимость буфера (обычно 16 + длина)
    System.out.println("Вместимость: " + sb.capacity());


    sb.setLength(5);//устанавливает новую длину
    System.out.println(sb);
    sb.setLength(10);
    System.out.println(sb);
    sb.setLength(0);
    sb.append("Hello Java 2024");


    int firstIndex = sb.indexOf("a");//поиск подстроки
    int lastIndex = sb.lastIndexOf("a");
    System.out.println("Первый 'a' на индексе: " + firstIndex);
    System.out.println("Последний 'a' на индексе: " + lastIndex);


    char ch = sb.charAt(0);//получение и установка символа
    System.out.println(ch);
    sb.setCharAt(0, 'h');
    System.out.println(sb);


    //для StringBuffer определены те же самые функции

    StringBuffer sf = new StringBuffer();

    sf.append("Hello");//добавляет строку/число/символ в конец
    sf.append(" ");
    sf.append("World");
    sf.append(2024);
    System.out.println(sf);


    sf.insert(5, ",");//вставляет строку/символ в указанную позицию
    System.out.println(sf);
    sf.insert(0, "Start: ");
    System.out.println(sf);


    sf.delete(0, 7);//удаляет символы от start до end не включая
    System.out.println(sf);
    sf.delete(5, 6);
    System.out.println(sf);


    sf.deleteCharAt(11);//удаляет один символ по индексу
    System.out.println(sf);


    sf.replace(6, 11, "Java");//заменяет часть строки на другую
    System.out.println(sf);


    sf.reverse();//переворачивает строку задом наперёд
    System.out.println(sf);
    sf.reverse();
    System.out.println(sf);


    System.out.println("Длина строки: " + sf.length());//длина строки и вместимость буфера (обычно 16 + длина)
    System.out.println("Вместимость: " + sf.capacity());


    sf.setLength(5);//устанавливает новую длину
    System.out.println(sf);
    sf.setLength(10);
    System.out.println(sf);
    sf.setLength(0);
    sf.append("Hello Java 2024");


    int first = sf.indexOf("a");//поиск подстроки
    int last = sf.lastIndexOf("a");
    System.out.println("Первый 'a' на индексе: " + first);
    System.out.println("Последний 'a' на индексе: " + last);


    char cha = sf.charAt(0);//получение и установка символа
    System.out.println(cha);
    sb.setCharAt(0, 'h');
    System.out.println(sf);
}