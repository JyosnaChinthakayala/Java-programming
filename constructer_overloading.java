class shape
{
int l,b;
float r,h;
shape(int l1)
{
l=l1;
}
shape(int l1,int b1)
{
l=l1;b=b1;
}
shape(int b1,float h1)
{
b=b1;h=h1;
}
shape(float r1)
{
r=r1;
}
void square_area(int l)
{
System.out.println("Area of a square:"+(l*l));
}
void rectanglearea(int l,int b)
{
System.out.println("Area of rectangle"+(l*b));
}
void triangle_area( int b, float h)
{
System.out.println("Area of a triangle:"+(0.5*b*h));
}
void circle_area(float r)
{
System.out.println("Area of a circle:"+(3.14*r*r));
}
}
class constructer_overloading
{
public static void main(String arr[])
{
shape s=new shape(4,8);
shape s1=new shape(5);
shape s2=new shape(10,20.0f);
shape s3=new shape(2);
s1.square_area(s1.l);
s.rectanglearea(s.l,s.b);
s2.triangle_area(s2.b,s2.h);
s3.circle_area(s3.r);
}
}



