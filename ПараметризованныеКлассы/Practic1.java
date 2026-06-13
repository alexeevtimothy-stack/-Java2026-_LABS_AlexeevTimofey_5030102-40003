import java.util.ArrayList;
import java.util.List;


class Wrapper<T> {
    private T item;

    public Wrapper(T a){
        this.item = a;
    }

    public T getItem() {
        return item;
    }
}

public void main() {

    Wrapper<String> string = new Wrapper<>("Dog");
    Wrapper<Integer> Int = new Wrapper<>(5);

    System.out.println(string instanceof Wrapper);
    System.out.println(Int instanceof Wrapper);

    System.out.println(string.item instanceof String);
    System.out.println(Int.item instanceof Integer);

}
















