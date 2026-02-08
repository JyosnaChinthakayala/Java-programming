class emp
{
String eid,ename,edoj,edob;
int esal;
int hra_per=20,da_per=15,inc_per=5;
int hra,da,i,inc;
int netv,grossv;
void getInput(String id,String name,String doj,String dob,int sal)
{
eid=id;ename=name;edoj=doj;edob=dob;esal=sal;
}
void getValues()
{
hra=esal*hra_per/100;
da=esal*da_per/100;
inc=esal*inc_per/100;
grossv=hra+da;
netv=grossv-inc;
}
void getsalaryslip()
{
System.out.println("Employee ID:"+eid+"\nEmployee name:"+ename+"\nEmployee date of joining:"+edoj+"\nEmployee dob:"+edob+"\nEmployee basic salary:"+esal+"\nHRA:"+hra+"\nDA:"+da+"\nIncome tax:"+inc+"\nGross  value:"+grossv+"\nNet value:"+netv);
}
int getsal()
{
    int  sal=esal;
    return sal;
}
int highsal(emp e1[])
{
int high=0;
for(int i=0;i<5;i++)
{
if(e1[high].getsal()<e1[i].getsal())
high=i;
}
return high;
}
}
class high_sal_emp
{
public static void main(String arr[])
{
emp e[]=new emp[5];
for(int i=0;i<5;i++)
e[i]=new emp();                             
e[0].getInput("54768","Sowrya","23-03-2011","20-12-1990",150000);
e[1].getInput("36583","Jaanu","24-07-2020","29-09-1999",100000);
e[2].getInput("63829","Prasanna","23-06-2020","18-04-2008",100000);
e[3].getInput("73658","Pavani","12-09-2021","25-06-2000",95000);
e[4].getInput("74768","Mahesh","23-02-2023","23-06-2000",50000);
for(int i=0;i<5;i++)
{
 e[i].getValues();
}
int high=e[0].highsal(e);
e[high].getsalaryslip();
}
}



























