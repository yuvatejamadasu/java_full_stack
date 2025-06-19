/* write a class with 2 static variables,2 instance variables,2 static methods,2 instance methods and a main method */


/*
class Static_Inestance_Members
{
static int a=10;
static int b=20;

static public void main(String[] args)
{
System.out.println("the static variable a is" +a);
System.out.println("the static variable a is" +b);
}
}
*/

/* print instance variables in static methods*/

/*class Static_Inestance_Members
{
int a=10;
static void yuva()
{
System.out.println("this is static method");
System.out.println(a);
}

static public void main(String[] uv)
{

yuva(); //non-static variable a connot be referenced from a static context

}
}*/


/* print static variable in instance methods*/

/*class Static_Inestance_Members
{
int a=100;
static  int b=12;

static public void main(String[] uv)
{
Static_Inestance_Members m=new Static_Inestance_Members();

System.out.println("this is inestance variable"+m.a);
System.out.println("this is static variable"+m.b);

}
}*/


/* call instance methods in static mehtods */

/*class Static_Inestance_Members
{
public void inestance()
{
System.out.println("this is main method");
}

static void yuva()
{
System.out.println(" this is static method");
Static_Inestance_Members m=new Static_Inestance_Members();
m.inestance();
}

static public void main(String[] uv)
{
yuva();
}
}
*/
/* call static method in inestance methods */

/*class Static_Inestance_Members
{
static void yuva()
{
System.out.println("this is static method");
}

 public void instanceMethod() 
 {
yuva();
System.out.println(" this is main method");

}


static public void main(String[] uv)
{
Static_Inestance_Members m=new Static_Inestance_Members();
m.instanceMethod();
}
}*/

/* print all static inestance variables in main method */

/*class Static_Inestance_Members
{
int a=100;
static int b=200;
public static void main(String[] uv)
{
Static_Inestance_Members m=new Static_Inestance_Members();

System.out.println(m.a);
System.out.println(m.b);


}
}*/

/*  call static methods and instance methods in main methods*/
class Static_Inestance_Members
{
static void yuva()
{
System.out.println("this is static method");
}
public void inestance()
{
System.out.println("this is inestance method");
}
static public void main(String uv[])
{
Static_Inestance_Members m=new Static_Inestance_Members();
m.inestance();
yuva();

}
}






















