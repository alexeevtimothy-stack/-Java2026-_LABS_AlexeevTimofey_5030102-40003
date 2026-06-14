class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    final public void makeSound() {//final метод
        System.out.println("rRr");
    }

    public void showInfo() {
        System.out.println(name + " " + age);
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void showInfo(){
        System.out.println(this.name + " " + this.breed + " " + this.age);
    }//Этот метод можно переопределить
    //@Override
    //public void makeSound() {
       // super.makeSound();//вызываем функцию родителя
        //System.out.println(this.name + "Гав-гав");//нельзя переопределить метод, иначе ошибка
   // }
}

void main() {
    Dog dog = new Dog("Бобик", 3, "Овчарка");
    dog.makeSound();
    dog.showInfo();
}
