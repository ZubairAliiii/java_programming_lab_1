//created by zubair Ahmed (2K22/CSE/124)
//Date 8/10/2k22
//zubairali7044@gmail.com



//Create a program in which user is asked for marks in a respected way
//(metriculation, intermediate and test result) where output would be the CPN



import java.util.Scanner;
class cpn{
public static void main(String[] org)
{
int metric;
int inter;
int test_res;
double cpn;
Scanner obj=new Scanner(System.in);
System.out.println("Enter Metriculation Marks in percentage:");
metric=obj.nextInt();

System.out.println("Enter Intermediate Marks in percentage:");
inter=obj.nextInt();


System.out.println("Enter Test score Marks:");
test_res=obj.nextInt();

cpn=(metric/850)*10 + (inter/1100)*30 + (test_res/100)*60;


System.out.println("Cpn is:"+(cpn));


}
}