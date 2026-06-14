class Animal {
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

class Dog extends Animal {
    private String breed;

   public Dog(String name, int age, String breed) {
        super(name, age);//вызывает конструктор родителя
        this.breed = breed;
   }

    public void showInfo() {
        super.showInfo();//вызов функции родителя
        System.out.println(this.breed);
    }

    public void Age(){
       System.out.println(super.age);//вызывает поле родителя
    }


}

void main() {
    Dog dog = new Dog("Бобик", 3, "Овчарка");//Ошибка
    dog.makeSound();
    dog.showInfo();
    dog.Age();
}
