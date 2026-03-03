class shape
{
public int l,b;
public void display(int area)
{
System.out.println("Area is :"+area);
}
public int area(int l,int b)
{
return l*b;
}
public int area(shape s)
{
return s.l*s.b;
}
}
class rectangle extends shape
{
public rectangle(int l1,int b1)
{
l=l1;b=b1;
}
}
public class inheritDemo
{
public static void main(String ar[])
{
int a;
rectangle r1=new rectangle(10,20);
rectangle r2=new rectangle(20,30);
a=r1.area(r1.l,r1.b);
r1.display(a);
a=r2.area(r2);
r2.display(a);
}
}


