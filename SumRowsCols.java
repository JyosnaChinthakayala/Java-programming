class SumRowsCols
{
public static void main(String a[])
{
int b[][]={{0,2,3},{0,4,7},{0,7,8}};
int rows=b.length;
int cols=b[0].length;
int rowsum[]=new int[rows];
int colsum[]=new int[cols];
System.out.println("Matrix");
for(int i=0;i<rows;i++)
{
    for(int j=0;j<cols;j++)
    {
        System.out.println(b[i][j]+" ");
        if(b[i][j]%2==0)
        {
            rowsum[i]=rowsum[i]+b[i][j];
            colsum[j]=colsum[j]+b[i][j];
        }
    }
}
System.out.println("Even sum in each row and column");
for(int i=0;i<rows;i++)
System.out.println("Row"+(i+1)+":"+rowsum[i]);
for(int j=0;j<cols;j++)
System.out.println("Column"+(j+1)+":"+colsum[j]);
}
}
 