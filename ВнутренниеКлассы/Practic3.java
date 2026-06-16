class OuterClass {

    public class PublicInner {
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
    }
    PublicInner a = new PublicInner();
    void getPublic() {
        System.out.println(a.getPublicVal());
        System.out.println(a.getProtectedVal());
        System.out.println(a.getPrivateVal());
        System.out.println(a.getVal());
        System.out.println(a.ProtectedVal + a.Val + a.PublicVal + a.PrivateVal);
    }
    private class PrivateInner {
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
    }
    PrivateInner b = new PrivateInner();
    void getPrivate() {
        System.out.println(b.getPublicVal());
        System.out.println(b.getProtectedVal());
        System.out.println(b.getPrivateVal());
        System.out.println(b.getVal());
        System.out.println(b.ProtectedVal + b.Val + b.PublicVal + b.PrivateVal);
    }
}

void main() {
    OuterClass a = new OuterClass();
    a.getPublic();
    a.getPrivate();//от спецификатора типов класса ничего не зависит, внешний класс имеет доступ ко всем полям и методам внутреннего класса
}
