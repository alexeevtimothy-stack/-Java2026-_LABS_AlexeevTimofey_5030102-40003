
class Animal {
    public void makeSound() {
        System.out.println("RRRrrr");//общий звук животного
    }
    public void makeSound(String a){
        System.out.println(a);//кастомный звук животного
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("BarkBark");//переопределение звука животного
    }
}

void main() {
    Animal animal = new Animal();
    Dog dog = new Dog();
    animal.makeSound();
    animal.makeSound("AAAA");
    dog.makeSound();
}





