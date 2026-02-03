class range
{
public static void main(String ar[])
{
int a[]={10,20,30,70,90,100,120,50,20,11,13};
for(int i=0;i<a.length;i++)
{
if(i>=5&&i<=9)
 continue;
System.out.println(a[i]);
}
}
}