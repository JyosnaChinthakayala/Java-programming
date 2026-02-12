class stu_det
{
int number,tot;
String name;
stu_det(int num,String sname,int total)
{
number=num;name=sname;tot=total;
}
void get_details()
{
System.out.println("Student number:"+number+"\n"+"Student name:"+name+"\n"+"Marks:"+tot);
}
}
class demo
{
public static void main(String a[])
{
int sno=Integer.parseInt(a[0]);
String sname=a[1];
int smarks=Integer.parseInt(a[2]);
stu_det s=new stu_det(sno,sname,smarks);
s.get_details();
}
}