void main() {
    //switch работает со строками, целочисленными типами, их классами-оболочками и перечислениями

    String fruit = "Яблоко";
    switch (fruit) {
        case "Банан": System.out.println("Это банан"); break;
        case "Яблоко": System.out.println("Это яблоко"); break;
    }

    int num = 10;
    switch (num) {
        case 5:  System.out.println(num); break;
        case 10: System.out.println(num); break;
    }

    Integer I = 7;
    switch (I) {
        case 7: System.out.println(I); break;
        case 8: System.out.println(I); break;
    }

    enum Day {MONDAY,FRIDAY};
    Day day = Day.FRIDAY;
    switch (day) {
        case MONDAY: System.out.println("Понедельник"); break;
        case FRIDAY: System.out.println("Пятница"); break;
    }
}

