class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Point other = (Point) obj;

        return this.x == other.x && this.y == other.y;
    }

    @Override
    public int hashCode() {
        return 777 * x + y;
    }

}//функция equals должна обладать свойствами симметричности, рефлексивности, транзитивности и обрабатывать null, кроме того следует еще переопределять и hashCode()