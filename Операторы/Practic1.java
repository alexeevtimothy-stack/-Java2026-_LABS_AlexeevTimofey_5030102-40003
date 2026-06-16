void main() {
    byte x = 10;//0000 1010
    System.out.println(x++);//10
    System.out.println(++x);//12
    System.out.println(x--);//12
    System.out.println(--x);//10
    System.out.println(~x);//1111 0101, -11, -x-1

    int a = 15;
    int b = 4;
    System.out.println(a * b);//60
    System.out.println(a / b);//3
    System.out.println(a % b);//3
    System.out.println(a + b);//19
    System.out.println(a - b);//11

    int max = (a > b) ? a : b;
    System.out.println(max);//15, a
    b=19;
    max = (a > b) ? a : b;
    System.out.println(max);//19, b
    //a=15, b=19
    System.out.println(a > b);//false
    System.out.println(a < b);//true
    System.out.println(a == b);//false
    System.out.println(a != b);//true
    System.out.println(a >= b);//false
    System.out.println(a <= b);//true

    String text = "A";
    System.out.println(text + a + b);//A1519
    System.out.println(text + (a + b));//A34, скобки изменяют порядок

    int num = -8;//1111 1111 1111 1111 1111 1111 1111 1000
    System.out.println(num << 2);//-32, 1111 1111 1111 1111 1111 1111 1110 0000
    System.out.println(num >> 2);//-2, 1111 1111 1111 1111 1111 1111 1111 1110
    System.out.println(num >>> 1);//2147483644, 0111 1111 1111 1111 1111 1111 1111 1100

    byte m1 = 0b1100;//12
    byte m2 = 0b1010;//10
    System.out.println(m1 & m2);//0b1000, 8
    System.out.println(m1 | m2);//0b1110, 14
    System.out.println(m1 ^ m2);//0b0110, 6


    boolean t = true;
    boolean f = false;
    System.out.println(t && f);//false
    System.out.println(t || f);//true
    System.out.println(!t);//false

    int c = 10;//10
    System.out.println(c += 5);//15
    System.out.println(c -= 3);//12
    System.out.println(c *= 2);//24
    System.out.println(c /= 4);//6
    System.out.println(c %= 2);//0

    //у [] наивысший приоритет, предоставляет доступ к желаемому элементу массива, либо используется для инициализации массивов
}

