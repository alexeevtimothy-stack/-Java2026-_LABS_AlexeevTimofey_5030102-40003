class Vehicle {
    double speed=5; //скорость средства
    public void move(double time) {
        System.out.println("Транспорт проехал "+ time*speed); //считает пройденную дистанцию по времени с заданной скоростью
    }
}

class Plane extends Vehicle {
    double speed=225;//скорость самолета
    @Override
    public void move(double time) {
        System.out.println("Самолет пролетел "+ time*speed);//считает пройденную дистанцию по времени с заданной скоростью
    }
    public void land() {
        System.out.println("Самолет заходит на посадку.");//своя функция у класса Plane
    }
}

class Ferry extends Vehicle {
    double speed=35; //скорость парома
    @Override
    public void move(double time) {
        System.out.println("Паром проплыл "+ time*speed);//считает пройденную дистанцию по времени с заданной скоростью
    }
}

void travel(Vehicle vehicle, double time) {
    vehicle.move(time);//считает расстояние пройденной средством
}

void main(String[] args) {
    Plane plane = new Plane();
    Ferry ferry = new Ferry();
    travel(plane, 10);
    travel(ferry, 10);
    //принцип подстановки Лисков выполняется, поведение программы не меняется от передачи дочерних классов
}
