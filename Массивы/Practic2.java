void main() {
    int[] num = {42, 12, 7, 89, 23};
    String Str = Arrays.toString(num);
    System.out.println(Str);//печатает массив

    Arrays.sort(num);
    System.out.println(Arrays.toString(num));//печатает отсортированный массив

    int el = 23;
    int found = Arrays.binarySearch(num, el);
    System.out.println("Индекс элемента " + el + " Нашли " + found);//отображает результаты поиска

    int[] mum = {7, 12, 23, 42, 89};
    boolean check = Arrays.equals(num, mum );
    System.out.println(check);//сравнивает два массива

    int[] extra = {7, 12, 25, 42, 89};
    int res = Arrays.compare(num, extra);//сравнивает массивы, -1, если первый массив меньше другого, 1, если первый больше другого, 0, если равны
    System.out.println(res);
}

