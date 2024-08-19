abstract class Shape {
  String color;
  abstract double area();
  public abstract String display();

  public Shape(String color)
  {
      this.color = color;
  }

  public String getColor() { return color; }
}
class Circle extends Shape {
  double radius;

  public Circle(String color, double radius)
  {
      super(color);
      this.radius = radius;
  }

  double area()
  {
      return Math.PI * Math.pow(radius, 2);
  }

  public String display()
  {
      return "Circle color is \n" + super.getColor()
          + "and area is : " + area();
  }

  
}
class Rectangle extends Shape {

  double length;
  double width;

  public Rectangle(String color, double length,
                   double width)
  {   
      super(color);
      this.length = length;
      this.width = width;
  }

  double area() { return length * width; }

  public String display()
  {
      return "Rectangle color is \n" + super.getColor()
          + " and area is : " + area();
  }
}
public class Abstraction {
  public static void main(String[] args)
  {
      Shape s1 = new Circle("Voilet", 4.2);
      Shape s2 = new Rectangle("Beige", 2, 4);

      System.out.println(s1.display());
      System.out.println(s2.display());
  }
}
