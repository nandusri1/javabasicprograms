import java.util.Scanner;
public class Arrayinput{
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
System.out.println("array elements are:");
for(i=0;i<n;i++)
{
System.out.println(arr[i]);
}

}
}