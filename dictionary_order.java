class dictionary_order
{
public static void main(String a[])
{
for(int i=0;i<a.length;i++)
{
for(int j=i+1;j<a.length;j++)
{
if(a[i].compareTo(a[j])>0)
{
String t=a[i];
a[i]=a[j];
a[j]=t;
}
}
}
System.out.println("Words in Dictionary  order");
for(int i=0;i<a.length;i++)
{
System.out.println(a[i]);
}
}
}