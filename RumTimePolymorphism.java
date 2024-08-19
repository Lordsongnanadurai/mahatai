class Calc {

  public int add(int a, int b){
    return a+b;
  }

  public int sub(int a, int b){
    return a-b;
  }
  
}

class AdvCac extends Calc{
  public int add(int a, int b){
    return a+b+1;
  }

  public int mul(int a, int b){
    return a*b;
  }
}

public class RumTimePolymorphism {
  public static void main(String[] args) {
    AdvCac obj = new AdvCac();
    int r1 = obj.add(10, 20);
    System.out.println(r1);
  }
}
