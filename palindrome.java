class palindrome
{
public static void main(String arr[])
{
int n=152;
int a,r,rev=0;
a=n;
while(a!=0)
{
r=a%10;
rev=rev*10+r;
a=a/10;
}
if(n==rev)
System.out.println(n+"  is a palindrome");
else
System.out.println(n+" is a not a palindrome");
}
}