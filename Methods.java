
/* for each loop*/
/*class Methods{
static public void main(String[] yuva)
{
int a[]={1,2,3,4,5,6};
for(int b:a)
{
System.out.println(b);
}
}
}*/


/* using for each to print*/

/*class Methods{
static public void main(String[] yuva)
{
int a[]={1,2,3,4,5,6};
int sum=0;
for(int b:a)
{
sum=sum+b;
}
System.out.println(sum);


}
}*/


/* methods types*/
/* without parameter without return */

/*class Methods
{
public void add()
{
System.out.println(10+20);
}

static public void main(String[] yuva)
{
Methods m=new Methods();
m.add();
}
}*/

/* without parameter with return*/


/*class Methods
{
public int sub()
{
int a=10;
int b=20;

return(a-b);
}

static public void main(String[] yuva)
{

Methods m=new Methods();
int c=m.sub();
System.out.println(c); 
}
}*/
/*with parameter without return */

/*class Methods
{
public void mul(int a, int b)
{
  System.out.println(a*b);
}

static public void main(String[] yuva)
{
 
Methods m=new Methods();
m.mul(10,20);
}
}*/

/* with parameter with return*/

class Methods
{
public int div(int a, int b)
{
  return(a/b);
}

static public void main(String[] yuva)
{
 
Methods m=new Methods();
int c=m.div(10,20);
System.out.println(c);
}
}
















