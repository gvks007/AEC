class Circle
{
     static float pi=3.14f;
     float rad;
     Circle()
      {
       rad=10.0f;
       }
     Circle(float r)
     {
      System.out.println("print the parametrised constructor");
       rad=r;
      }
   float  computeperi() 
       {
        return 2*pi*r;
        }
      float computearea(float r)
     {
      return 2*rad*rad;
      }
     public static void main(String args[])
       {
       Circle C1 =new Circle();
       Circle C2 =new Circle(15.0f);
     System.out.println((C1.computeperi) + " " + (C2.computearea));
      }
}
 
