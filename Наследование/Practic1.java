class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;//обращаемся к собственному полу name и age
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
        super(name, age);//вызываем конструктор родителя
        this.breed = breed;//инициализируем свое поле breed
    }

    @Override
    public void makeSound() {
        super.makeSound();//вызываем функцию родителя
        System.out.println(this.name + "Гав-гав");
    }
}

void main() {
    Dog dog = new Dog("Бобик", 3, "Овчарка");//вызовет конструктор родителя
    dog.makeSound();//выведет поле родителя и свою породу
}
