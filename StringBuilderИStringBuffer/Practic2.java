void main() {
    //String → StringBuilder
    String str = "Hello World";
    StringBuilder sb1 = new StringBuilder(str);//через конструктор
    System.out.println(sb1);

    StringBuilder sb2 = new StringBuilder();//через append()
    sb2.append(str);
    System.out.println(sb2);


    //String → StringBuffer
    StringBuffer sbuf1 = new StringBuffer(str);//через конструктор
    System.out.println(sbuf1);

    StringBuffer sbuf2 = new StringBuffer();//через append()
    sbuf2.append(str);
    System.out.println(sbuf2);


    //StringBuilder → String
    StringBuilder sb = new StringBuilder("Java");

    String strFromSb1 = sb.toString();//toString()
    System.out.println(strFromSb1);

    String strFromSb2 = new String(sb.toString());//через конструктор String
    System.out.println(strFromSb2);


    //StringBuffer → String
    StringBuffer sbuf = new StringBuffer("Python");

    String strFromSbuf1 = sbuf.toString();//toString()
    System.out.println(strFromSbuf1);

    String strFromSbuf2 = new String(sbuf.toString());//через конструктор String
    System.out.println(strFromSbuf2);


    //StringBuilder → StringBuffer
    StringBuilder builder = new StringBuilder("Builder");

    StringBuffer buffer1 = new StringBuffer(builder);//через конструктор
    System.out.println(buffer1);

    StringBuffer buffer2 = new StringBuffer(builder.toString());//через toString() + конструктор
    System.out.println(buffer2);

    StringBuffer buffer3 = new StringBuffer();//через append()
    buffer3.append(builder);
    System.out.println(buffer3);


    //StringBuffer → StringBuilder
    StringBuffer buf = new StringBuffer("Buffer");

    StringBuilder build1 = new StringBuilder(buf);//через конструктор
    System.out.println(build1);

    StringBuilder build2 = new StringBuilder(buf.toString());//через toString() + конструктор
    System.out.println(build2);

    StringBuilder build3 = new StringBuilder();//через append()
    build3.append(buf);
    System.out.println(build3);
}