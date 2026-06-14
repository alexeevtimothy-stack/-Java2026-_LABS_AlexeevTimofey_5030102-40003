class OuterClass {
    private int PrivateVal = 10;
    int Val = 20;
    public int PublicVal = 30;
    protected int ProtectedVal = 40;
    private int getPrivateVal(){
        return PrivateVal;
    }
    int getVal(){
        return Val;
    }
    public int getPublicVal(){
        return PublicVal;
    }
    protected int getProtectedVal(){
        return ProtectedVal;
    }

    public class PublicInner {
        void get(){
            System.out.println(getPublicVal());
            System.out.println(getVal());
            System.out.println(getProtectedVal());
            System.out.println(getPrivateVal());
            System.out.println(ProtectedVal + Val + PublicVal + PrivateVal);
        }//от спецификатора доступа ничего не зависит, ко всем полям и функциям внешнего класса есть доступ
    }
}

void main(){
    OuterClass.PublicInner a = new OuterClass().new PublicInner();
    a.get();
}
