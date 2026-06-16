class OuterClass {

    public class PublicInner {
        private String data = "Public";

        public void show() {
            System.out.println(data);
        }
    }

    private class PrivateInner {
        private String secret = "Private";

        public void reveal() {
            System.out.println(secret);
        }
    }
}

class AnotherClass{
    OuterClass a = new OuterClass();
    OuterClass.PublicInner b = a.new PublicInner();//публичный класс будет доступен абсолютно везде через класс OuterClass
    //OuterClass.PrivateInner c = a.new PrivateInner();//PrivateInner приватный класс и доступен только в OuterClass
}
