class  continue_demo
{
public static void main(String ar[])
{
System.out.println("The numbers between 1 to 100 except those numbers which are multiples of 9 are:");
for(int i=1;i<=100;i++)
{
if(i%9==0)
continue;
System.out.println(i);
}
}
}