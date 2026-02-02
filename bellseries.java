class bellseries
{
public static void main(String arr[])
{
int rows,max,i,j;
int bell[][]=new int[20][20];
rows=10;
max=150;
bell[0][0]=1;
for( i=1;i<rows;i++)
{
bell[i][0]=bell[i-1][i-1];
for(j=1;j<=i;j++)
{
 bell[i][j]=bell[i][j-1]+bell[i-1][j-1];
}
}
for(i=0;i<rows;i++)
{
for(j=0;j<=i;j++)
{
if(bell[i][j]>max)
break;
System.out.println(bell[i][j]+" ");
}
}
}
}