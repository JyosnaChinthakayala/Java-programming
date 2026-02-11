class Lucky_number
{
public static void main(String ar[])
{
int a,ln=0,dob=29092009;
while(dob>0||ln>9)
{
if(dob==0)
{
dob=ln;
ln=0;
}
ln=ln+dob%10;
dob=dob/10;
}
System.out.println("Lucky number of this person is "+ln);
}
}