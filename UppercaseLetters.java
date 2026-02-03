class UppercaseLetters
{
public static void main(String arr[])
{
char str[]={'H','e','L','l','O','W','o','R','l','D'};
System.out.println("Uppercase Letters are:");
for(int i=0;i<str.length;i++)
{
if(str[i]<'A'||str[i]>'Z')
 continue;
System.out.println(str[i]);
}
}
}