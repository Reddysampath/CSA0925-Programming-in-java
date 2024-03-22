
class Circleusingoops
{
  int r;
  double area;
  void get()
  {
     r=10;
  }
  void calculate()
   {
     area=3.14 * r * r;
   }
  void display()
   {
     System.out.println("Area of circle:"+area);
    }
  public static void main(String arg[])
   {
     Circle ci=new Circle();
     ci.get();
     ci.calculate();
     ci.display();
   }
}
