import java.util.StringJoiner;

void main() {
    
    StringJoiner joiner1 = new StringJoiner(", ");//объединение с разделителем
    joiner1.add("Яблоко");
    joiner1.add("Банан");
    joiner1.add("Апельсин");
    System.out.println(joiner1);

    StringJoiner jsonJoiner = new StringJoiner(", ", "[", "]");//с префиксом и суффиксом
    jsonJoiner.add("1").add("2").add("3").add("4");
    System.out.println(jsonJoiner);

    StringJoiner joinerA = new StringJoiner(", ", "{", "}");
    joinerA.add("A").add("B");

    StringJoiner joinerB = new StringJoiner(", ");
    joinerB.add("C").add("D");

    joinerA.merge(joinerB);//объединение двух StringJoiner
    System.out.println(joinerA);
}