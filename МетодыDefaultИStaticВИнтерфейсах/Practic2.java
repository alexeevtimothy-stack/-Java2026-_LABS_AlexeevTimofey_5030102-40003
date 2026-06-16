interface Flyable {
    default void move() {
        System.out.println("Flying through the air");
    }
}

interface Drivable {
    default void move() {
        System.out.println("Driving on the road");
    }
}

class FlyingCar implements Flyable, Drivable {//два одинаковых метода из разных интерфейсов и два возможных решения
    //@Override
    //public void move() {//переопределим метод
        //System.out.println("Flying car taking off and driving!");
    //}
    //@Override
    //public void move() {//ссылаемся через super на нужный метод
        //Flyable.super.move();
        // Drivable.super.move();
    //}
}


