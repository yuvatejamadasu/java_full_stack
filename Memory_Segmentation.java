public class Memory_Segmentation
{
int a=10;
int b=20;
static int c=30;
static int d=40;
static{
System.out.println("this is static block 1");
}
static{
System.out.println("this is static block 1");
}
{
System.out.println("this is inestance block 1");

}

{
System.out.println("this is inestance block 2");

}

public void main1()
{
System.out.println("this is inestance method 1");

}


public void main2()
{
System.out.println("this is inestance method 2");

}

static void main3()
{
System.out.println("this is static method 3");

}

static void main4()
{
System.out.println("this is static method 4");

}

}

class Memory1
{
int i=10;
int j=20;
static int k=30;
static int l=40;
static{
System.out.println("this is static block 1");
}
static{
System.out.println("this is static block 1");
}
{
System.out.println("this is inestance block 1");

}

{
System.out.println("this is inestance block 2");

}

public void main5()
{
System.out.println("this is inestance method 1");

}


public void main6()
{
System.out.println("this is inestance method 2");

}

static void main7()
{
System.out.println("this is static method 3");

}

static void main8()
{
System.out.println("this is static method 4");

}

static public void main(String[] args)
{

Memory1 m1=new Memory1();


Memory_Segmentation m=new Memory_Segmentation();





System.out.println(m.a);
System.out.println(m.b);
System.out.println(m.c);
System.out.println(m.d);
m.main1();
m.main2();
m.main3();
m.main4();



System.out.println(m1.i);
System.out.println(m1.j);
System.out.println(k);
System.out.println(l);
m1.main5();
m1.main6();
main7();
main8();
}
}









