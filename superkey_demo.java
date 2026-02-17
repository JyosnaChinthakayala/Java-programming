class A
{
int x,y;
public A()
{
}
protected A(int x1,int x2)
{
x=x1;y=y1;
}
void show()
{
System.out.println("Value of x and y "+x+" "+y);
}
}
class B extends A
{
int y;
B(int y1)
{
y=y1;
}
void disp()
{
super.show();
int res=x+super.y;
}
void show()
{
System.out.println("Value of y "+y);
}
}
class superkey_demo
{
A a1=new A(30,50);
B b1=new B(23);
b1.disp();
b1.show();
}
