package Inheritance;

public class Main {
  public static void main(String[] args) {
    AdvCac obj = new AdvCac();

    int r1 = obj.add(10,20);
    int r2 = obj.sub(48,20);
    int r3 = obj.mul(10,20);
    int r4 = obj.div(4000,20);
    System.out.println(r1+" "+r2+" "+r3+" "+r4);
  }
}
