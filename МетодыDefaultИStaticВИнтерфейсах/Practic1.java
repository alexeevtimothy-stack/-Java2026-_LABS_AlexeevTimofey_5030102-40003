interface Vehicle {

    default void honk() {
        System.out.println("Beeep! Beeep!");//сразу же и определили метод
    }

    static void serviceReminder() {
        System.out.println("Don't forget to service your vehicle every 5000 km!");//сразу же и определили метод
    }
}

class Car implements Vehicle {
    private String model;

    public Car(String model) {
        this.model = model;
    }

    @Override
    public void honk() {//переопределили уже существующий метод, могли не переопределять
       System.out.println(model + " says: Beep-beep-mother-beep!");
    }

}

void main(String[] args) {
    Car tesla = new Car("Tesla");

    tesla.honk();//вызов метода интерфейса через класс

    Vehicle.serviceReminder();//вызов статического метода через сам интерфейс

    Vehicle myVehicle = new Car("BMW");

    myVehicle.honk();//вызываем через экземпляр интерфейса
}


