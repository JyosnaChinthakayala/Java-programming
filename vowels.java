class vowels
{
public static void main(String arr[])
{
int i;
for(i=0;i<arr.length;i++)
{
String a=arr[i];
for(int j=0;j<a.length();j++)
{
char c=a.charAt(j);
if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
System.out.println(c);
}
}     
}
}
 