class A {
    public void add(int a, int b){
        System.out.println(a + b);
    }

    public void add(String a, String b){
        System.out.println(a+b);
    }
}

void main() {
    A a=new A();
    a.add(2,5);
    a.add("Hello ", "World");
}













