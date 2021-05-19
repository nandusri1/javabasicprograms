import java.util.Scanner;
public class Arraysum{
public static void main(String args[]){
int arr[]=new int[50],i,sum=0;
System.out.println("Enter the number of elements in the array:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("Enter "+n+ " elements:");
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
sum=sum+arr[i];
}
System.out.println("sum is:"+sum);
}
}
