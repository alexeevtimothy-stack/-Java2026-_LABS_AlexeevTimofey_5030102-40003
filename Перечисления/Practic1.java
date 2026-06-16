class Anouncement {

    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    Day day;

    Anouncement(Day day){
        this.day = day;
    }

    void whatsNew(Day day){
        switch (day) {
            case MONDAY:
                System.out.println("Начало недели!");
                break;
            case FRIDAY:
                System.out.println("Пятница!");
                break;
        }
    }
}

class Book {
    enum Genre {
        FICTION,
        SCIENCE,
        HISTORY;
    }

    String title;
    Genre genre;

    public Book(String title, Genre genre) {
        this.title = title;
        this.genre = genre;
    }

    public void show() {
        System.out.println(title + " " + genre);
    }
}
void main(){
    Anouncement A = new Anouncement(Anouncement.Day.MONDAY);
    A.whatsNew(A.day);
    Book B = new Book ("Учебник Истории", Book.Genre.HISTORY);
    B.show();
}