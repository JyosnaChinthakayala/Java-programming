class emp
{
String eid,ename,edoj,edob;
int esal;
int hra_per=20,da_per=15,inc_per=5;
int hra,da,inc;
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
}
class emp_sal
{
public static void main(String arr[])
{
emp e=new emp();
e.getInput("54768","Sowrya","23-03-2011","20-12-1990",150000);
e.getValues();
e.getsalaryslip();
}
}



























