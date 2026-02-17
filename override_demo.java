class A
{
  void add(int a,int b)
{
   System.out.println("sum of two numbers in super:"+(a+b));
 }
}
 class B extends A
{
  void add(int a,int b)
{
  System.out.println("sum of two numbers in subclass:"+(a+b));
}
}
   public class override_demo
{
 public static void main(String args[])  
{
  A a1=new A();
 a1.add(10,20);
 B b1=new B();
 b1.add(30,20);
}
}