interface area
{
double PI=3.147;
double rect_area(double b,double d);
double square_area(double l);
double circle_area(double r);
}
class shape implements area
{
double l,b;
shape(double x1,double x2)
{
l=x1;b=x2;
}
double rect_area(double x,double y)
{
System.out.println("Area of a rectangle "+(x*y));
}
double square_area(double x)
{
System.out.println("Area of a square "+(x*x));
}
double circle_area(double r)
{
System.out.println("Area of a circle "+(PI*r*r));
}
}
class interface_demo
{
shape s=new shape(5,12);
shape s2=new shape();
area as;
as=s;
as.rect_area(s.l,s.b);
as.square_area(s.l);
as.circle_area(s.l);
as=s2;
as.rect_area(s2.l,s2.b);
as.square_area(s2.l);
as.circle_area(s2.l);
}







