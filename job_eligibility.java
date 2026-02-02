class job_eligibility
{
public static void main(String arr[])
{
 String name="Prasanna",gender="female",category="SC/ST";
 int age=28,percentage=70;
String eligible="no";
if(category=="general")
{
if(age>18&&age<27)
{
if(percentage>=75)
{
 eligible="yes";
}
}
}
else if(category=="SC/ST")
{
if(age>18&&age<30)
{
if(percentage>=60)
{
eligible="yes";
}
}
}
else if(gender=="female"||category=="BC")
{
if(age>18&&age<27)
{
eligible="yes";
}
}
else
{
eligible="no";
}
System.out.println("Name:"+name+"\nAge:"+age+"\nGender:"+gender+"\nCategory:"+category +"\npercentage:"+percentage+"\neligibility status:"+eligible);
}
}