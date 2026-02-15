class A
{
protected int x;
A(int x1)
{
x=x1;
}
A()
{

}
void showx()
{
System.out.println("value of x:"+x);
}
}
class B extends A
{
public int y;
B(int y1)
{
y=y1;
}
B()
{

}
void showy()
{
x=60;
showx();
System.out.println("value  of y:"+y);
}
}
class C extends B
{
int z;
C(int a1,int b1,int c1)
{
x=a1;
y=b1;
z=c1;
}
void showxyz()
{
showx();
showy();
System.out.println("value of z:"+z);
}
}
class multilevel_demo
{
public static void main(String ar[])
{
A a1=new A(10);
a1.showx();
B b1=new B(20);
b1.showy();
C c1=new C(20,30,40);
c1.showxyz();
}
}