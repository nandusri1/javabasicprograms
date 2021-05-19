import java.util.Scanner;
public class Duplicates{
public static void main(String args[]){
int a[]=new int[50],i,j;
System.out.print("Enter how many elements in the array:");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("Enter array elements:");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
System.out.print("Duplicate elements are:");
for(i=0;i<n;i++){
for(j=i+1;j<n;j++){
if(a[i]==a[j])
}
}
}
}

