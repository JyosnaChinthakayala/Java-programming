class A
{
private int z;
public int x;
protected int y;
protected A(int x1,int y1,int z1)
{
x=x1;y=y1;z=z1;
}
A()
{

}
public void disp()
{
System.out.println("x and y value "+x+" "+y);
System.out.println("z value "+z);
}
}
class B extends A
{
public int a,b;

B(int l1,int l2,int l3,int l4)
{
a=l1;b=l2;x=l3;y=l4;
}
public void show()
{
System.out.println("Value of x and y "+x+" "+y);
System.out.println("Value of a and b "+a+" "+b);
}
public int sum()
{
return (x+y+a+b);
}
}
class single_demo
{
public static void main(String a[])
{
A a1=new A(5,10,20);
a1.disp();
B b1=new B(20,30,40,50);
b1.x=100;
b1.y=200;
b1.disp();
int tot=b1.sum();
System.out.println(tot);
b1.show();
}
}