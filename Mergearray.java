import java.util.Scanner;
public class Mergearray{
public static void main(String args[]){
int a[]=new int[50],i,j;
int k;
int b[]=new int[50];
int c[]=new int[50];
System.out.print("Enter how many elements in the array:");
Scanner sc=new Scanner(System.in);
int size1=sc.nextInt();
System.out.println("Enter array elements:");
for(i=0;i<size1;i++)
{
a[i]=sc.nextInt();
}
System.out.print("Enter how many elements in the array:");
int size2=sc.nextInt();
System.out.println("Enter second array elements:");
for(i=0;i<n;i++)
{
b[i]=sc.nextInt();
}
for(i=0;i<size1;i++)
{
int size=size1+size2;
}
for(i=0,K=size1;k<size && i<size2;i++,k++){
c[k]=b[i];
}
for(i=0;i<size;i++)
{
System.out.println(c[i]);
}
}
}




