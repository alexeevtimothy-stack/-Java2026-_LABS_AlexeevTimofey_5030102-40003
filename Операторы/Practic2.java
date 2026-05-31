void main() {
    Object text = "123";
    Object num= Integer.valueOf(100);

    System.out.println(text instanceof String);//true
    System.out.println(num instanceof String);//false
    System.out.println(text instanceof Object);//true

    Object nul = null;

    System.out.println(nul instanceof String);//false
    System.out.println(nul instanceof Object);//false
    //потому что null не представляет никакой класс/объект
}

