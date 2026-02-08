class shape
{
    float l,b,h;
    void getInput(int l1,int b1,int h1)
    {
        l=l1;b=b1;h=h1;
    }
    void area()
    {
        System.out.println("area "+l*b*h);
    }
    public static void main(String a[])
    {
        shape s=new shape();
        s.getInput(10,15,12);
        s.area();
    }
}