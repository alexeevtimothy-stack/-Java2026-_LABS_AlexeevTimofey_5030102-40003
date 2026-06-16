void main() {
    Boolean boolTrue = Boolean.TRUE;
    Boolean boolFalse = Boolean.FALSE;//через прямые константы

    boolean Val = true;
    Boolean boo = Boolean.valueOf(Val);//с помощью значения true, false
    System.out.println(Val);//true

    Boolean Str1 = Boolean.valueOf("true");//через строку, если она true, то и значение будет true, все другое false
    Boolean Str2 = Boolean.valueOf("TrUe");//true
    Boolean Str3 = Boolean.valueOf("not true");//false
    System.out.println(Str1);
    System.out.println(Str2);
    System.out.println(Str3);
}

