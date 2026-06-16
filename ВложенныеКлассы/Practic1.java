interface Drawable {

    static int add = 7;
    static class Point {
         int x;
         int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void draw() {
            System.out.println("Рисуем точку в (" + x + ", " + y + ")");
        }
    }

    static class AddPoint {
        int x;
        int y;

        public AddPoint(int x, int y) {
            this.x = x + add;
            this.y = y + add;
        }

        public void draw() {
            System.out.println("Рисуем точку в (" + (x + add) + ", " + (y + add) + ")");
        }
    }
}
void main() {
    Drawable.Point point = new Drawable.Point(10, 20);
    Drawable.AddPoint addpoint = new Drawable.AddPoint(10, 20);
    point.draw();
    addpoint.draw();//вызов вложенного класса
}
