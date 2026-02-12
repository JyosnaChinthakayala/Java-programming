class shape
{
int l,b,h;
shape(int l1,int l2,int l3)
{
l=l1;b=l2;h=l3;
}
void area()
{
System.out.println("Area of the shape"+(l*b*h));
}
}
class constructer_demo
{
public static void main(String arr[])
{
shape s1=new shape(19,29,36);
shape s2=new shape(46,19,12);
shape s3=new shape(15,13,10);
s1.area();
s2.area();
s3.area();
}
}