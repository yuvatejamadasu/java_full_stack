/* write a function to add integer values of an array*/
/*class Array
{
public static void main(String[] uv)
{
int a[]={1,2,3,4,5};

int sum=0;
for(int i=0;i<=4;i++)
{
sum=sum+a[i];
}
System.out.println(sum);
}
}
*/

/* write a function to calculate the average values of an array of integers*/
/*class Array
{
public static void main(String[] uv)
{
int a[]={1,2,3,4,5};
int avg;
int sum=0;
for(int i=0;i<=4;i++)
{
sum=sum+a[i];

}

System.out.println(sum);
avg=sum/5;
System.out.println(avg);

}
}
*/


/* write a program to find the index of an array element*/
/*class Array
{
public static void main(String[] uv)
{
int a[]={1,2,3,4,5,6};
System.out.println("the index of an array is:" +a[0]);
System.out.println("the index of an array is:" +a[1]);
System.out.println("the index of an array is:" +a[2]);
System.out.println("the index of an array is:" +a[3]);
System.out.println("the index of an array is:" +a[4]);
System.out.println("the index of an array is:" +a[5]);

}
}
*/

/* write a function to test if any array contains a specific vlaue*/
/*import java.util.Scanner;
class Array
{
public static void main(String[] uv)
{
int a[]={1,2,3,4,5,6};
int count=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter num value");
int num=sc.nextInt();
System.out.println(num);
for(int i=0;i<=5;i++)
{
if(a[i]==num)
{
count=count=1;
break;
}
}
if(count>=1)
{
System.out.println(" element is fount"+num);
}
else{
System.out.println("element is not found");

}


}
}*/




/*import java.util.Scanner;
class Array
{
public static void main(String args[])
{

Scanner sc=new Scanner(System.in);
int a[][]=new int[2][2];

System.out.println("enter the numbers");

for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
a[i][j]=sc.nextInt();
}

}

for(int i=0;i<2;i++)
{
for(int j=0;j<2;j++)
{
System.out.print(a[i][j]+" ");
}
System.out.println();
}

sc.close();
}
}*/



import java.util.Scanner;
class Array
{

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int array[][][]=new int[3][3][3];

System.out.println("enter the numbers");

for(int i=0;i<3;i++)
{
System.out.println("enter the values" +(i+1)+":");
for(int j=0;j<3;j++)
{
for( int k=0;k<3;k++)
{
array[i][j][k]=sc.nextInt();
}
}
}


for(int i=0;i<3;i++)
{
System.out.println("matrix" +(i+1)+":");
for(int j=0;j<3;j++)
{
for( int k=0;k<3;k++)
{
System.out.print(array[i][j][k]+"");
}
System.out.println();
}
System.out.println();
}


sc.close();
}
}


