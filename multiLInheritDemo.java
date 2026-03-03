class student
{
int pin;
String name;
student(int p,String n)
{
pin=p;name=n;
}
void dispData()
{
System.out.println("PIN no:"+pin);
System.out.println("Name:"+name);
}
}
class marks extends student
{
int tot;
marks(int p,String n,int t)
{
super(p,n);
tot=t;
}
void dispData1()
{
dispData();
System.out.println("Total marks:"+tot);
}
}
class percentage extends marks
{
int per;
percentage(int p,String n,int t,int pe)
{
super(p,n,t);
per=pe;
}
void dispData2()
{
dispData1();
System.out.println("Percentage:"+per);
}
}
class multiLInheritDemo
{
public static void main(String ar[])
{
percentage s=new percentage(9,"Jyosna",832,92);
s.dispData2();
}
}
