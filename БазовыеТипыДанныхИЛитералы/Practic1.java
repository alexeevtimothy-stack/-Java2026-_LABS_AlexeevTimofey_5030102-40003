
short defaultShort;
int defaultInt;
long defaultLong;
float defaultFloat;
double defaultDouble;
char defaultChar;
boolean defaultBoolean;
byte defaultByte;

void main() {

    byte b = 42;//возможные значения переменных
    short s = 1024;
    int i = 50000;
    long l = 9_000_000_000L;
    float f = 3.14f;
    double d = 2.71828;
    char c = 'A';
    boolean bool = true;

    System.out.printf("byte: %d, short: %d, int: %d, long: %d%n", b, s, i, l);
    System.out.printf("float: %f, double: %f, char: %c, boolean: %b%n", f, d, c, bool);

    System.out.println("byte-" + defaultByte);//нулевые значения соответствующих переменных
    System.out.println("short-" + defaultShort);
    System.out.println("int-" + defaultInt);
    System.out.println("long-" + defaultLong);
    System.out.println("float-" + defaultFloat);
    System.out.println("double-" + defaultDouble);
    System.out.println("char-" + (int) defaultChar + defaultChar);
    System.out.println("boolean-" + defaultBoolean);
}
