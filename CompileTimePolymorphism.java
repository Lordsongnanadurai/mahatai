class Calc{
  public int add(int a, int b){
    return a+b;
  }

  public int add(int a, int b,int c){
    return a+b+c;
  }
}


public class CompileTimePolymorphism {
  public static void main(String[] args) {
    Calc obj = new Calc();
    int r1 = obj.add(10, 20);
    int r2 = obj.add(20, 30, 40);
    System.out.println(r1+" "+r2);
  }
}
