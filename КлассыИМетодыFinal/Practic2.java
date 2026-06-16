final class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("rRr");
    }

    public void showInfo() {
        System.out.println(name + " " + age);
    }
}

//class Dog extends Animal {
    //private String breed;

   // public Dog(String name, int age, String breed) {
      //  super(name, age);
       // this.breed = breed;
   // }

//}//Нельзя создать наследника из final класса

void main() {
    //Dog dog = new Dog("Бобик", 3, "Овчарка");//Ошибка
    Animal dog = new Animal("Бобик", 7);
    dog.makeSound();
    dog.showInfo();
}
