import java.util.Scanner;
public class Minmax{
public static void main(String args[]){
int arr[]=new int[20];
int n,i=0;
System.out.println("Enter how many elements:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("Enter "+n+" elements:");
for(i=0;i<n;i++)
{
arr[i]=sc.nextInt();
}
int max=arr[0];
for(i=1;i<n;i++)
{
if(arr[i]>max)
{
max=arr[i];
}
}
int min=arr[0];
for(i=1;i<n;i++)
{
if(arr[i]<min)
{
min=arr[i];
}
}
System.out.println("maximum element is:"+max);
System.out.println("minimum element is:"+min);

}
}
