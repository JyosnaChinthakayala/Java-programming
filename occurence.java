class occurence
{
public static void main(String arr[])
{
int a[],j=0;
a=new int[5];
System.out.println("the first three occurences which are divisible by 12 are ");
for(int i=1;i<50;i++)
{
if(i%12!=0)
 continue;
a[j++]=i;
}
for(j=0;j<3;j++)
{
 System.out.println(a[j]);
}
}
}