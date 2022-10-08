
//created by zubair Ahmed (2K22/CSE/124)
//Date 8/10/2k22
//zubairali7044@gmail.com

//A program which shows your veriable stores even/odd number

import java.util.Scanner;
class Even{
public static void main(String[] org)
{
int num;

Scanner obj=new Scanner(System.in);
System.out.println("Enter a number to check weather it is even or odd");
num=obj.nextInt();
if(num%2==0){
System.out.println("Number is even ");
}
else{
System.out.println("Number is odd ");
}
}
}

