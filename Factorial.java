import java.util.Scanner;
public class Factorial{
public static void main(String args[]){
System.out.println("Enter a number");
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int i;
long factorial=1;
for(i=1;i<=num;i++)
{
factorial=factorial*i;
}
System.out.println("Factorial of "+ num+ " is:"+factorial);
}
} 