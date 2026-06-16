void main() {
    Integer decimal = Integer.decode("125");//125
    System.out.println(decimal);

    Integer hex1 = Integer.decode("0x1A");//26
    Integer hex2 = Integer.decode("-#FF");//-255
    Integer oct1 = Integer.decode("012");//10
    System.out.println(hex1);
    System.out.println(hex2);
    System.out.println(oct1);
}

