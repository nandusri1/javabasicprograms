import java.util.Scanner;
public class Evenodd{
public static void main(String args[]){
System.out.println("Enter a number");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
if(n%2==0)
{
System.out.print(n+"is a prime number");
}
else{
System.out.println("Not a prime number");
}
}
}