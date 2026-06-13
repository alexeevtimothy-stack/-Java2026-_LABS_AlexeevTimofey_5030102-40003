class Animal {
    String name = "Animal";
    public String toString(){
        return name;
    }
}

class Dog extends Animal {
    String name = "Dog";
    @Override
    public String toString(){
        return name;
    }
}

class Puppy extends Dog {
    String name = "Puppy";
    @Override
    public String toString(){
        return name;
    }
}

class Wrapper<T> {
    T item;

    Wrapper(T item) {
        this.item = item;
    }

    T get() {
        return item;
    }

    void set(T item) {
        this.item = item;
    }
}

void Ex(Wrapper<? extends Dog> box) {
    System.out.println(box.item.toString());
}

void Super(Wrapper<? super Dog> box) {
    box.set(new Dog());
}

void main(String[] args) {

    Wrapper<Dog> dog = new Wrapper<>(new Dog());
    Wrapper<Puppy> puppy = new Wrapper<>(new Puppy());
    Wrapper<Animal> animal = new Wrapper<>(new Animal());

    Ex(dog);
    Ex(puppy);
    //Ex(animal);//Не может записать animal он предок, с extends не работает, помогает ограничить тип параметризации, extends удобно использовать для чтения

    Super(dog);
    //Super(puppy);//Не может записать puppy он предок, с super не работает, помогает ограничить тип параметризации, super удобно использовать для записи
    Super(animal);
}