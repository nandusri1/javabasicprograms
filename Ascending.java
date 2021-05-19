import java.util.Scanner;
public class Ascending{
public static void main(String args[]){
int arr[]=new int[50],i,j,temp;
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
for(j=i;j<n;j++){
if(arr[i]>arr[j]){
temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}
System.out.println("Ascending order of the array is....");
for(i=0;i<n;i++){
System.out.println(arr[i]);
}
}
}

