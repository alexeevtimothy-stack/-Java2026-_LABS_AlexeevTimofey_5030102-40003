void main() {

    String text = "Hello World!";
    int length = text.length();
    System.out.println("length() " + length); //возвращает длину строки, учитывая пробелы

    char firstChar = text.charAt(0);//возвращает символ по указанному индексу, начиная с 0
    char lastChar = text.charAt(text.length() - 1);
    System.out.println("charAt(): первый символ - '" + firstChar + "', последний - '" + lastChar + "'");

    String world = text.substring(6, 11);//извлекает подстроку от beginIndex до endIndex не включая
    System.out.println("substring(): " + world);

    String upper = text.toUpperCase();//преобразует все символы в верхний/нижний регистр
    String lower = text.toLowerCase();
    System.out.println("toUpperCase(): " + upper);
    System.out.println("toLowerCase(): " + lower);

    boolean hasWorld = text.contains("World");
    boolean hasJava = text.contains("Java");
    System.out.println("contains(): содержит 'World'? " + hasWorld);//проверяет, содержит ли строка указанную последовательность символов
    System.out.println("содержит 'Java'? " + hasJava);

    String replaced = text.replace('o', '0');//заменяет все вхождения одного символа/строки на другой
    String replacedWord = text.replace("World", "Java");
    System.out.println("replace(): " + replaced);
    System.out.println("replace(): " + replacedWord);

    String csv = "apple,banana,orange,grape";
    String[] fruits = csv.split(",");//разбивает строку на массив подстрок по разделителю
    System.out.print("split(): ");
    for (String fruit : fruits) {
        System.out.print(fruit + " ");
    }
    System.out.println();

    String withSpaces = "   Hello   World!   ";
    String trimmed = withSpaces.trim();//удаляет пробелы в начале и в конце строки
    System.out.println("trim(): '" + withSpaces + "' -> '" + trimmed + "'");


    String empty = "";
    System.out.println("isEmpty(): пустая строка? " + empty.isEmpty());//проверяет, пустая ли строка

    String joined = String.join(" - ", "Red", "Green", "Blue");//статический метод, объединяет строки с разделителем
    System.out.println("join(): " + joined);
    
}

