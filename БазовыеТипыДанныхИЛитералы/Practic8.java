void main() {
    var name = "Тимофей";
    var age = Integer.valueOf(20); //типы данных подбираются автоматически c помощью var
    
    if(age instanceof Integer && name instanceof String){    //проверка на соответствие типов
        System.out.println("Оба Типа подобрались верно");
    }
}
