class student
{
    protected String sno,sname,doj;
    student(String n,String nm,String d)
    {
        sno=n;sname=nm;doj=d;
    }
    void dispDetails()
    {
        System.out.println("Student id:"+sno+"\n"+"Student name:"+sname+"\n"+"Date of joining:"+doj);
       
    }
}
class marks extends student
{
    protected int m,p,c,tot;
    marks(String n,String nm,String d,int m1,int m2,int m3)
    {
        super(n,nm,d);
        m=m1;p=m2;c=m3;
    }
    public void findTotal()
    {
        tot=(m+p+c);
    }
}
class result extends marks
{
    double per;
    String rs;
    result(String n,String nm,String d,int m1,int m2,int m3)
    {
        super(n,nm,d,m1,m2,m3);
        System.out.println("This is child method"); 
    }
    void findResult()
    {
        per=(tot*100.0)/300.0;
        if(per<100&&per>=75)
        rs="Distinction";
        else if(per<75&&per>=60)
        rs="First class";
        else if(per<60&&per>=50)
        rs="Second class";
        else if(per<50&&per>=35)
        rs="Third class";
        else
        rs="failed";
    }
    void dispResult()
    {
        dispDetails();
    System.out.println("Student marks:\n"+"Maths:"+m+"\nPhysics:"+p+"\nChemistry:"+c+"\nTotal:"+tot+"\nPercentage:"+per+"\nResult:"+rs);
    }
}
class super_key_demo
{
    public static void main(String a[])
    {
        result rs=new result(a[0],a[1],a[2],Integer.parseInt(a[3]),Integer.parseInt(a[4]),Integer.parseInt(a[5]));
        rs.findTotal();
        rs.findResult();
        rs.dispResult();
        rs.dispDetails();
    }
}
