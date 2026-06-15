void main() {
    Calendar hours = new GregorianCalendar(2024, 11, 24, 15, 30, 45);
    
    System.out.printf("%tH%n", hours);

    System.out.printf("%tM%n", hours);

    System.out.printf("%tS%n", hours);

    System.out.printf("%tY%n", hours);

    System.out.printf("%tB%n", hours);
}