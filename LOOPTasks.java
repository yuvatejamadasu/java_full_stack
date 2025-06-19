/* write  a program to print "Bright It carrier" in ten times using for loops*/

/*public class LOOPTasks{
public static void main(String[] args){
for(int i=0;i<=10;i++)
{
System.out.println("Bright It Carrier");
}
}
}*/

/* write a java program to print 1 to 20 number using while loop  */

/*public class LOOPTasks
{
public static void main(String[] args)
{
int i=1;
while(i<=20)
{
System.out.println(i);
i++;

}
}
}*/

/* program to equal operator and operator  */
/*public class LOOPTasks
{
public static void main(String[] args)
{
int i=5;
int j=5;
if(i==j)
{
System.out.println("equal");
}
else
{
System.out.println("not equal");
}
}
}*/


/* write a program to print odd or even*/


/*import java.util.Scanner;
public class LOOPTasks
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
   System.out.println("ask a number for user:");
   int a=sc.nextInt();
   System.out.println(a);

   if(a%2==0)
{
System.out.println("the given number is even");
}
else
{
System.out.println("not a even number");
}
}
}*/

/* wite a java program to print largest number among these three*/

/*import java.util.Scanner;
public class LOOPTasks
{
public static void main(String[] args)
{
  Scanner sc=new Scanner(System.in);
   int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
System.out.println("enter a value");
System.out.println(a);
System.out.println("enter b value");
System.out.println(b);
System.out.println("enter c value");
System.out.println(c);

if((a>b)&(a>c))
{
System.out.println("the largest number is:"+a);
}
else if((b>c)&(b>a))
{
System.out.println("the largest number is:"+b);
}
else
{
System.out.println("the largest number is:"+c);
}
}
}*/


/* write a program to print even number b/w 10 to 100 using while loop */
 
/*public class LOOPTasks
{
public static void main(String[] args)
{
for(int i=11;i<=100;i++)
{
  if(i%2==0)
{
System.out.println("the even numbers are:"+i);
}
}
}
}*/

/* write a progrm to print 1 to 10 using do-while loop */
  
/*public class LOOPTasks
{
public static void main(String[] args)
{
int i=1;
do{
System.out.println(i);
i++;

}while(i<=10);
}
}*/


/*  write a program of prime numbers*/

/*import java.util.Scanner;
public class LOOPTasks
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter your prime number");
int number=sc.nextInt();
System.out.println(number);
boolean isPrime=true;
if(number<=1)
{
isPrime=false;
}
else{

for(int i=2;i<=number/2;i++)
{
if(number%i==0)
{
isPrime=false;
break;
}
}
}
if(isPrime){
System.out.println(number +" is a prime number.");
}
else
{
System.out.println(number + "is Not  a prime number.");
}
}
}*/


/* using swith case to print even number or not */

/**import java.util.Scanner;
public class LOOPTasks
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter num");
int num=sc.nextInt();
System.out.println(num);
switch(num%2)
{
case 0:
System.out.println("even number");
break;
case 1:
System.out.println("not a even number");
break;
default:
	System.out.println("enter the number");

}
}
}*/
/* using switch case to write male and female*/

/*import java.util.Scanner;
public class LOOPTasks
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter gender");
String num=sc.next();
switch(num)
{
case "M":
System.out.println("genter is male");
break;
case "F":
System.out.println("gender is female");
break;
default:
System.out.println("enter the valid gender");
}
}
}*/

/* program for multiple if else statements (largest number in 10,20,and 30)*/

/*public class LOOPTasks
{
public static void main(String[] args)
{
int a=10,b=20,c=30;
if((a>b)&(a>c))
{
System.out.println("the largest number is:" +a);
}
else if((b>a)&(b>c))
{
System.out.println("the largest number is:" +b);
}
else
{
System.out.println("the largest of number is:" +c);
}
}
}*/
/* armstraong code*/

import java.util.Scanner;
public class LOOPTasks
{
public static void main(String[] args){
int i,num;
int res=0;
int sum,original;
Scanner s=new Scanner(System.in);
System.out.println("Enter a Number");
num=s.nextInt();
original=num;
while(num>0){
int temp;
temp=num%10;

res=res+(int)Math.pow(temp,3);
num=num/10;
}
if(res==original){
System.out.println("Arm strong number");
System.out.println(res);
}
else{
System.out.println("Not a arm strong number");
System.out.println(res);
}
}
}









  






















